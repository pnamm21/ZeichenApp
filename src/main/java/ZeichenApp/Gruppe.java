package ZeichenApp;

import java.awt.*;
import java.util.ArrayList;

public class Gruppe extends GrafikKomponente {

    private ArrayList<GrafikKomponente> arrayList;

    public Gruppe(ArrayList<GrafikKomponente> arrayList) {
        this.arrayList = new ArrayList<>(arrayList);
    }


    @Override
    public void zeichnen(Graphics graphics) {
        for (GrafikKomponente komponente : arrayList) {
            komponente.zeichnen(graphics);
        }
    }

    public void add(GrafikKomponente komponente) {
        arrayList.add(komponente);
    }
}
