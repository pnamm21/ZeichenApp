package ZeichenApp;

import java.awt.*;

public class Linie extends GrafikKomponente{

    private int x2;
    private int y2;

    public Linie(int x, int y, int x2, int y2) {
        this.x = x;
        this.y = y;
        this.x2 = x2;
        this.y2 = y2;
    }

    @Override
    public void zeichnen(Graphics g){

        g.drawLine(x,y,x2,y2);
    }

    @Override
    public String toString() {
        return "Linie von (" + x + ";" + y + ")" + "(" + x2 + ";" + y2 + ")";
    }
}
