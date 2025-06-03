package ZeichenApp;

import java.awt.*;

public class Main {

    private Linie l;
    private Ellipse e;
    private Text t;
    public Main(){
        this.l = new Linie(0,0,100,100);
        this.e = new Ellipse(100,100,0,0);
        this.t = new Text(50,50,"name");
        zeichnenAlles(null);
    }

    public void zeichnenAlles(Graphics g){

        this.l.zeichnen(g);
        this.e.zeichnen(g);
        this.t.zeichnen(g);

    }

    public static void main(String[] args) {

        Main main = new Main();

        // main.zeichnenAlles();
    }

}
