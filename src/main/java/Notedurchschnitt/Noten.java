package Notedurchschnitt;

public class Noten {
    private int summe;
    private int anzahl;

    Noten(int summe, int anzahl){
        this.summe = summe;
        this.anzahl = anzahl;
    }

    public void neueEx(int note){
        summe += note;
        anzahl++;
    }

    public void neueSchux(int note){
        int temp = note * 2;
        summe += temp;
        anzahl++;
    }

    public float gibGesamtNote(){
        return (float) summe / anzahl;
    }


}
