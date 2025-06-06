package ZeichenApp;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Main extends JFrame {

    class ZeichenPanel extends JPanel {
        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            zeichnenAlles(g);
        }
    }

    private Linie l;
    private Ellipse e;
    private Text t;
    private Gruppe g;
    private Rectangle r;

    public Main() {
        this.l = new Linie(0, 0, 100, 100);
        this.e = new Ellipse(50, 50, 50, 50);
        this.t = new Text(10, 20, "Zeichnung");
        this.r = new Rectangle(10,30,200,200);

        // Группируем объекты
        ArrayList<GrafikKomponente> komponenten = new ArrayList<>();
        komponenten.add(l);
        komponenten.add(e);
        komponenten.add(t);
        komponenten.add(r);
        this.g = new Gruppe(komponenten);

        ZeichenPanel zeichenPanel = new ZeichenPanel();
        add(zeichenPanel);

        setVisible(true);
        setTitle("Test");
        setLocation(5, 10);
        setSize(1000, 2000);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void zeichnenAlles(Graphics g) {
        if (g == null) return;

        this.g.zeichnen(g);
    }

    public static void main(String[] args) {
        new Main();
    }
}
