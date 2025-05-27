package KontoProjekt;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Konto konto = new Konto(2000.0, 22334455, "Nam Pham");
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- Bankkonto-Menü ---");
            System.out.println("1. Kontostand anzeigen");
            System.out.println("2. Einzahlung");
            System.out.println("3. Auszahlung");
            System.out.println("4. Beenden");
            System.out.print("Wähle eine Option: ");

            int wahl = scanner.nextInt();

            switch (wahl) {
                case 1:
                    System.out.println("Aktueller Kontostand: " + konto.gibGuthaben() + " €");
                    break;
                case 2:
                    System.out.print("Einzahlungsbetrag: ");
                    double einzahlung = scanner.nextDouble();
                    konto.einzahlen(einzahlung);
                    System.out.println("Neuer Kontostand: " + konto.gibGuthaben() + " €");
                    break;
                case 3:
                    System.out.print("Auszahlungsbetrag: ");
                    double auszahlung = scanner.nextDouble();
                    if (auszahlung > konto.gibGuthaben()) {
                        System.out.println("Fehler: Nicht genug Guthaben!");
                    } else {
                        konto.abbuchen(auszahlung);
                        System.out.println("Neuer Kontostand: " + konto.gibGuthaben() + " €");
                    }
                    break;
                case 4:
                    System.out.println("Programm beendet.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Ungültige Auswahl! Bitte erneut wählen.");
            }
        }
    }
}
