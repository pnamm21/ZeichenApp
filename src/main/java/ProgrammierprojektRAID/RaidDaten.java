package ProgrammierprojektRAID;

public class RaidDaten {
    private int typ;
    private int volumeBrutto;
    private int volumeNetto;
    private int amount;
    private int efficiency;
    private int breakdown;
    private boolean error = false;

    public RaidDaten() {
        this.typ = 0;
        this.volumeBrutto = 0;
        this.volumeNetto = 0;
        this.amount = 0;
        this.efficiency = 0;
        this.breakdown = 0;
        this.error = false;
    }

    public RaidDaten(int typ, int volumeBrutto, int volumeNetto, int amount, int efficiency, int breakdown, boolean error) {
        this.typ = typ;
        this.volumeBrutto = volumeBrutto;
        this.volumeNetto = volumeNetto;
        this.amount = amount;
        this.efficiency = efficiency;
        this.breakdown = breakdown;
        this.error = error;
    }


    public int getTyp() {
        return typ;
    }

    public void setTyp(int typ) {
        this.typ = typ;
    }

    public int getVolumeBrutto() {
        return volumeBrutto;
    }

    public void setVolumeBrutto(int volumeBrutto) {
        this.volumeBrutto = volumeBrutto;
    }

    public int getVolumeNetto() {
        return volumeNetto;
    }

    public void setVolumeNetto(int volumeNetto) {
        this.volumeNetto = volumeNetto;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getEfficiency() {
        return efficiency;
    }

    public void setEfficiency(int efficiency) {
        this.efficiency = efficiency;
    }

    public int getBreakdown() {
        return breakdown;
    }

    public void setBreakdown(int breakdown) {
        this.breakdown = breakdown;
    }

    public boolean isError() {
        return error;
    }

    public void setError(boolean error) {
        this.error = error;
    }

    public static RaidDaten getInstance() {
        return new RaidDaten();
    }

    public void setInstance(RaidDaten raidDaten) {
        this.typ = raidDaten.typ;
        this.volumeBrutto = raidDaten.volumeBrutto;
        this.volumeNetto = raidDaten.volumeNetto;
        this.amount = raidDaten.amount;
        this.efficiency = raidDaten.efficiency;
        this.breakdown = raidDaten.breakdown;
        this.error = raidDaten.error;
    }
}