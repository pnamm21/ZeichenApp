package ZeichenApp;

import javax.swing.*;
import java.awt.*;

public class Main extends JFrame {

    class ZeichenPanel extends JPanel{
        @Override
        public void paint(Graphics g) {
            zeichnenAlles(g);
        }
    }

    private Linie l;
    private Ellipse e;
    private Text t;
    public Main(){
        this.l = new Linie(0,0,100,100);
        this.e = new Ellipse(50,50,50,50);
        this.t = new Text(50,50,"Nam");

        ZeichenPanel zeichenPanel = new ZeichenPanel();
        add(zeichenPanel);

        zeichnenAlles(null);
        setVisible(true);
        setTitle("Test");
        setLocation(5,10);
        setSize(1000,2000);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void zeichnenAlles(Graphics g){

        if (g == null) {
            return;
        }else {
            this.l.zeichnen(g);
            this.e.zeichnen(g);
            this.t.zeichnen(g);
        }


    }

    public static void main(String[] args) {

        Main main = new Main();



        // main.zeichnenAlles();
    }

}
