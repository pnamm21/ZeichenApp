package Notedurchschnitt;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Noten noten = new Noten(0, 0);
        Scanner scanner = new Scanner(System.in);

        while(true){

            System.out.println("\n--- Noten ---");
            System.out.println("1. Ex-Noten hinzufügen");
            System.out.println("2. Schulaufgabe-Noten hinzufügen");
            System.out.println("3. Die gesamte Note anzeigen");

            int wahl = scanner.nextInt();

            switch(wahl){

                case 1:
                    System.out.println("Ex-Note: ");
                    int Ex_note = scanner.nextInt();
                    noten.neueEx(Ex_note);
                    break;
                case 2:
                    System.out.println("Schulaufgabe-Note: ");
                    int Schul_note = scanner.nextInt();
                    noten.neueEx(Schul_note);
                    break;
                case 3:
                    System.out.println("Die gesamte Note: " + noten.gibGesamtNote());
                    scanner.close();
                    return;
                default:
                    System.out.println("Ungültige Auswahl! Bitte erneut wählen.");
            }
        }


    }
}
