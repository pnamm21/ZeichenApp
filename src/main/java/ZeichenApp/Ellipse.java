package ZeichenApp;

import java.awt.*;

public class Ellipse extends GrafikKomponente{

    private int x2;
    private int y2;

    public Ellipse(int x, int y, int x2,int y2) {
        this.x = x;
        this.y = y;
        this.x2 = x2;
        this.y2 = y2;
    }

    public void mausLinksGedruckt(int xm, int ym){

    }
    public void mausBewegt(int xm, int ym){

    }

    @Override
    public void zeichnen(Graphics g){

        g.drawOval(x,y,x2,y2);
    }

    @Override
    public String toString() {
        return "Ellipse von (" + x + ";" + y + ")" + "(" + x2 + ";" + y2 + ")";
    }
}
