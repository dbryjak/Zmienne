public class Typy_Proste_Konwertowanie {
    public static void main(String[] args) {
        int i = 6;
        double d = 2.2;

        double d2 = i;              // konwertowanie niejawne
        double d3 = (double) i;     // konwertowanie jawne (rzutowanie)

        byte by = 100;
        int i2 = by;

        float f = 123.123f;
        d2 = (double) f;

        long zmiennaLong = 123;                 // konwertowanie niejawne - nie musieliśmy pisać tego w nawiasie
        int zmiennaInt = (int) zmiennaLong;     // konwertowanie jawne (rzutowanie)

       // zmiennaLong = 1234567891;               // 10 cyfr traktuje jako 'int'
       // zmiennaLong = 12345678912;              // każda następna jest już za duża do konwertowania na 'longa'
       // zmiennaLong = 12345678912L;             // dodanie 'L' tworzy wartość 'longa' i można konwertować.
       // zmiennaLong = 1234L;                    // dodane 'L' tworzy każdą liczbę jako 'long'

    //-------------------------------------------------------------------------------------------------------------
        int intObliczenia = 6;
        double doubleObliczenia = 2.2;

        double wynik = (double) intObliczenia / doubleObliczenia;       // (double) - kon. niejawne
        System.out.println("Wynik: " + wynik);
        // Wynik: 2.727272727272727

        int wynik1 = intObliczenia / (int) doubleObliczenia;            // konwertowanie jawne
        //                           (int) zrzutować na 'int' aby były same 'inty'
        System.out.println("Wynik1: " + wynik1);
        // Wynik1: 3

    }
}
