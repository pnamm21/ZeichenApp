package ZeichenApp;

import java.awt.*;

public class Text extends GrafikKomponente{
    private String text;

    public Text(int x, int y, String text) {
        this.x = x;
        this.y = y;
        this.text = text;
    }

    @Override
    public void zeichnen(Graphics g) {

        g.setFont(new Font("Arial", Font.PLAIN, 16));
        g.setColor(Color.BLACK);
        g.drawString(text,x,y);

    }

    @Override
    public String toString(){
        return "Text \"" + text + "auf (" + x + ";" + y + ")\"";
    }
}
