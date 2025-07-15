package ZeichenApp;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;

public class Main extends JFrame implements MouseListener, MouseMotionListener {

    private Gruppe gruppe;

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

        ArrayList<GrafikKomponente> fallback = new ArrayList<>();
        fallback.add(linie);
        fallback.add(ellipse);
        fallback.add(text);

        //gruppe = Gruppe.readTxt("grafik.txt");
        if (gruppe == null) {
            gruppe = new Gruppe(fallback);
        }

        /* Fensteraufbau */
        setTitle("Test");
        add(new ZeichenPanel());

        pack();
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    // brauchen
    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    @Override
    public void mouseDragged(MouseEvent e) {

    }

    @Override
    public void mouseMoved(MouseEvent e) {

    }
    private void zeichnenAlles(Graphics g) {
        gruppe.zeichnen(g);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(Main::new);
    }
}
