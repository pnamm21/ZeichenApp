package ZeichenApp;

import java.awt.*;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Gruppe extends GrafikKomponente {

    private final ArrayList<GrafikKomponente> komponenten;

    public Gruppe() {
        this.komponenten = new ArrayList<>();
    }
    public Gruppe(ArrayList<GrafikKomponente> list) {
        this.komponenten = new ArrayList<>(list);
    }

    @Override
    public void zeichnen(Graphics g) {
        for (GrafikKomponente k : komponenten) {
            k.zeichnen(g);
        }
    }

    public void mausLinksGedruckt(int xm, int ym){

    }
    public void mausBewegt(int xm, int ym){

    }

    public void add(GrafikKomponente k) {
        komponenten.add(k);
    }

    public static Gruppe readTxt(String filename) {
        Gruppe gruppe = new Gruppe();

        try (Scanner scanner = new Scanner(new FileInputStream(filename))) {

            while (scanner.hasNext()) {
                String classname = scanner.next();

                if (classname.equals("Linie")) {
                    int x1 = scanner.nextInt();
                    int y1 = scanner.nextInt();
                    int x2 = scanner.nextInt();
                    int y2 = scanner.nextInt();
                    gruppe.add(new Linie(x1, y1, x2, y2));

                } else if (classname.equals("Ellipse")) {
                    int x = scanner.nextInt();
                    int y = scanner.nextInt();
                    int w = scanner.nextInt();
                    int h = scanner.nextInt();
                    gruppe.add(new Ellipse(x, y, w, h));

                } else if (classname.equals("Text")) {
                    int x = scanner.nextInt();
                    int y = scanner.nextInt();
                    String text = scanner.nextLine().trim();
                    gruppe.add(new Text(x, y, text));

                } else {
                    System.err.println("Unbekannter Typ: " + classname);
                    scanner.nextLine();
                }
            }

        } catch (FileNotFoundException e) {
            System.err.println("Datei nicht gefunden: " + filename);
        }

        return gruppe;
    }
}
