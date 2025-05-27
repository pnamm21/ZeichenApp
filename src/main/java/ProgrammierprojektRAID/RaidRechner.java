package ProgrammierprojektRAID;

public class RaidRechner {

    RaidDaten raidDaten = new RaidDaten();
    private int[] level = {0,1,5,6,51};

    public void berechnenAusVolume(int typ, int volume, int size){

        if (!isValidTyp(typ)) {
            System.out.println("Error: Valid Raid type.");
        }

        switch (typ){
            case 0:
                berechneRaid0(volume, size);
                break;
            case 1:
                berechneRaid1(volume, size);
                break;
            case 5:
                berechneRaid5(volume, size);
                break;
            case 6:
                berechneRaid6(volume, size);
                break;
            case 51:
                berechneRaid51(volume, size);
                break;
            default:
                System.out.println("Error: Raid type is not in the List");
        }
    }

    public void berechnenAusPlatte(int typ, int amountPlatte, int size){

    }

    private void berechneRaid0(int volume, int size) {
        raidDaten.setTyp(0);
        raidDaten.setVolumeBrutto(volume);
        raidDaten.setVolumeNetto(volume);
        raidDaten.setAmount(volume / size);
        raidDaten.setEfficiency(100);
        raidDaten.setBreakdown(0);
        raidDaten.setError(false);
    }

    private void berechneRaid1(int volume, int size){
        raidDaten.setTyp(1);
        raidDaten.setVolumeBrutto(volume);
        raidDaten.setVolumeNetto(volume);
        raidDaten.setAmount(volume / 2);
        raidDaten.setEfficiency(50);
        raidDaten.setBreakdown(1);
        raidDaten.setError(false);
    }

    private  void berechneRaid5(int volume, int size){
        raidDaten.setTyp(5);
        raidDaten.setVolumeBrutto(volume);
        raidDaten.setVolumeNetto(volume-size);
        raidDaten.setAmount(volume / size);
        raidDaten.setEfficiency((raidDaten.getVolumeNetto()*100)/volume);
        raidDaten.setBreakdown(1);
        raidDaten.setError(false);
    }

    private  void berechneRaid6(int volume, int size){
        raidDaten.setTyp(6);
        raidDaten.setVolumeBrutto(volume);
        raidDaten.setVolumeNetto(volume-(2*size));
        raidDaten.setAmount(volume / size);
        raidDaten.setEfficiency((raidDaten.getVolumeNetto()*100)/volume);
        raidDaten.setBreakdown(2);
        raidDaten.setError(false);
    }

    private  void berechneRaid51(int volume, int size){
        raidDaten.setTyp(51);
        raidDaten.setVolumeBrutto(volume);
        raidDaten.setVolumeNetto(volume-2);
        raidDaten.setAmount(volume / size);
        raidDaten.setEfficiency(50);
        raidDaten.setBreakdown(2);
        raidDaten.setError(false);
    }

    private boolean isValidTyp(int typ) {
        for (int l : level) {
            if (l == typ) {
                return true;
            }
        }
        return false;
    }

    public RaidDaten getRaidDaten() {
        return raidDaten;
    }
}