package ZeichenApp;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

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
public class Main extends JFrame {

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

    private Gruppe gruppe;

    public Main() {

        Linie    linie = new Linie   (0, 0, 100, 100);
        Ellipse  ellipse = new Ellipse(50, 50, 50, 50);
        Text     text   = new Text   (10, 20, "Zeichnung");
        Rechteck rechteck = new Rechteck(10, 30, 200, 200);

        ArrayList<GrafikKomponente> list = new ArrayList<>();
        list.add(linie);
        list.add(ellipse);
        list.add(text);
        list.add(rechteck);

        gruppe = new Gruppe(list);

        /* Fensteraufbau */
        setTitle("Test");
        add(new ZeichenPanel());

        pack();
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    private void zeichnenAlles(Graphics g) {
        gruppe.zeichnen(g);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(Main::new);
    }
}
