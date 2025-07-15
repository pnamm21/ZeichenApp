package ZeichenApp;

import java.awt.*;

public abstract class GrafikKomponente {

    protected int x;
    protected int y;

    public abstract void zeichnen(Graphics g);

    protected ZielModus zielModus = ZielModus.NICHTS;
    public abstract void mausLinksGedruckt(int xm, int ym);
    public abstract void mausBewegt(int xm, int ym);
    // public void mausLinksLosgelassen();

}
