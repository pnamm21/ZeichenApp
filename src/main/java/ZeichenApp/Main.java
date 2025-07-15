package ZeichenApp;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

/* ---------- Rechteck-Komponente ---------- */
class Rechteck extends GrafikKomponente {
    private final int x, y, width, height;

    public Rechteck(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    @Override
    public void zeichnen(Graphics g) {
        g.drawRect(x, y, width, height);
    }
}

/* ---------- Hauptfenster ---------- */
public class Main extends JFrame {

    private Gruppe gruppe;                         // <‑‑ fehlte

    /* Zeichenfläche */
    private class ZeichenPanel extends JPanel {
        ZeichenPanel() {
            setPreferredSize(new Dimension(800, 600));
        }
        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            zeichnenAlles(g);
        }
    }

    public Main() {

        /* --- Fallback-Objekte, falls Datei nicht gelesen werden kann --- */
        Linie    linie    = new Linie  (0, 0, 100, 100);
        Ellipse  ellipse  = new Ellipse(50, 50, 50, 50);
        Text     text     = new Text   (10, 20, "Zeichnung");
        Rechteck rechteck = new Rechteck(10, 30, 200, 200);

        ArrayList<GrafikKomponente> fallback = new ArrayList<>();
        fallback.add(linie);
        fallback.add(ellipse);
        fallback.add(text);
        fallback.add(rechteck);

        /* --- Versuch, grafische Elemente aus Datei zu laden --- */
        gruppe = Gruppe.readTxt("grafik.txt");     // Pfad ggf. anpassen
        if (gruppe == null) {
            gruppe = new Gruppe(fallback);         // Fallback
        }

        /* Fensteraufbau */
        setTitle("Test");
        add(new ZeichenPanel());

        pack();
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    /* Zeichnen delegieren */
    private void zeichnenAlles(Graphics g) {
        gruppe.zeichnen(g);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(Main::new);
    }
}
