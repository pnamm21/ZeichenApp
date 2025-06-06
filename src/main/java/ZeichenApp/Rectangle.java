package ZeichenApp;

import java.awt.*;

public class Rectangle extends GrafikKomponente{

    private int x2;
    private int y2;

    public Rectangle(int x, int y,int x2, int y2) {
        this.x = x;
        this.y = y;
        this.x2 = x2;
        this.y2 = y2;
    }

    @Override
    public void zeichnen(Graphics g) {
        g.setColor(Color.BLUE);
        g. drawRect(x,y,x2,y2);
    }

    @Override
    public String toString() {
        return "Rectangle von (" + x + ";" + y + ")" + "(" + x2 + ";" + y2 + ")";
    }
}
