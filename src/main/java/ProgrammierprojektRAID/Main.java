package ProgrammierprojektRAID;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        RaidRechner raidRechner = new RaidRechner();
        RaidDaten raidDaten = new RaidDaten();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Wähl die Nummer aus: 1 -> Berechne Volumen oder 2 -> Berechne Anzahl der Platte");
        int auswahl = scanner.nextInt();

        if (auswahl == 1) {

            System.out.println("Gib Raid type ein (0 1 5 6 51): ");
            int raidTyp = scanner.nextInt();

            System.out.print("Gib das Gesamtvolumen in GB ein: ");
            int volume = scanner.nextInt();

            System.out.print("Gib die Größe einer einzelnen Platte in GB ein: ");
            int size = scanner.nextInt();

            raidRechner.berechnenAusVolume(raidTyp, volume, size);
        } else if (auswahl == 2) {
            System.out.println("Gib Raid type ein (0 1 5 6 51): ");
            int raidTyp = scanner.nextInt();

            System.out.print("Gib die Anzahl der Platten ein: ");
            int amountPlatte = scanner.nextInt();

            System.out.print("Gib die Größe einer einzelnen Platte in GB ein: ");
            int size = scanner.nextInt();

            raidRechner.berechnenAusPlatte(raidTyp, amountPlatte, size);
        } else {
            System.out.println("Ungültige Auswahl!");
        }

        System.out.println("Berechnung abgeschlossen. Ergebnisse:");
        System.out.println("RAID-Typ: " + raidRechner.getRaidDaten().getTyp());
        System.out.println("Bruttovolumen: " + raidRechner.getRaidDaten().getVolumeBrutto() + " GB");
        System.out.println("Nettovolumen: " + raidRechner.getRaidDaten().getVolumeNetto() + " GB");
        System.out.println("Anzahl der Platten: " + raidRechner.getRaidDaten().getAmount());
        System.out.println("Effizienz: " + raidRechner.getRaidDaten().getEfficiency() + "%");
        System.out.println("Ausfallsicherheit: " + raidRechner.getRaidDaten().getBreakdown() + " Platte(n)");

        scanner.close();
    }
}
