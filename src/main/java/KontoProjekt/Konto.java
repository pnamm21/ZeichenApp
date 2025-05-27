package KontoProjekt;

public class Konto {

    double guthaben;
    int kontoNr;

    String inhaber;

    public Konto(double guthaben, int kontoNr, String inhaber){
        this.guthaben = guthaben;
        this.kontoNr = kontoNr;
        this.inhaber = inhaber;
    }

    public void einzahlen(double betrag){
        this.guthaben += betrag;
    }

    public void abbuchen(double betrag){
        this.guthaben -= betrag;
    }

    public double gibGuthaben(){
        return guthaben;
    }

    public String gibKontoInhaber(){
        return inhaber;
    }

    public void setzeKontoInhaber(String name){
        this.inhaber = name;
    }

    public int gibKontoNr(){
        return kontoNr;
    }

    public void setzeKontoNr(int kontoNr){
        this.kontoNr = kontoNr;
    }

    public void ueberweisen(double betrag, Konto zielkonto){
        if (kontoNr == zielkonto.gibKontoNr() && inhaber.equals(zielkonto.gibKontoInhaber()) && guthaben != 0) {
            this.guthaben -= betrag;
        }else {
            System.out.println("Der Betrag konnte nicht überwiesen!");
        }
    }

    public void ausgeben(){

    }

}