package Programmen;

public class Unterprogramm {

    // Funktion hoch
    public int hoch(int basis, int exponent){

        int result = 0;

        for (int i = 0; i < exponent; i++) {

            result = (int) Math.pow(basis,exponent);

            // Alternative
            // result = result * basis;

        }

        return result;
    }

    public int drawFan(int t){




        return 0;
    }

}