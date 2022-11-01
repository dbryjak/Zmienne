public class Typy_Proste {
    public static void main(String[] args) {
        // ang. primitive types

        // info: 1 bajt = 8 bitów

        // Liczby calkowite
        byte zmiennaByte = 10;
        System.out.println("Byte: " + zmiennaByte);
        System.out.println(Byte.MIN_VALUE + " " + Byte.MAX_VALUE);

        short zmiennaShort = 200;
        System.out.println("Short: " + zmiennaShort);
        System.out.println(Short.MIN_VALUE + " " + Short.MAX_VALUE);

        int zmiennaInt = 1000000;
        System.out.println("Int: " + zmiennaInt);
        System.out.println(Integer.MIN_VALUE + " " + Integer.MAX_VALUE);

        long zmiennaLong = 10000000000L;
        System.out.println("Long: " + zmiennaLong);
        System.out.println(Long.MIN_VALUE + " " + Long.MAX_VALUE);

        // liczby zmiennoprzecinkowe

        float zmiennaFloat = 12.34123456789f;
        System.out.println("Float: " + zmiennaFloat);
        // System.out.println(Float.MIN_VALUE + " " + Float.MAX_VALUE);

        double zmiennaDouble = 12.34123456789;
        System.out.println("Double: " + zmiennaDouble);

        // float - 32 bity - mniej precyzynje - 6 miejsc po przecinku
        // double - 64 bity - bardziej precyzyjne - 11 miejsc po przecinku

        // Pojedyńcze znaki
        char zmiennaChar = 'A';
        System.out.println("Char: " + zmiennaChar);

        // Wartości logiczne
        boolean zmiennaBoolean = false;
        System.out.println("Boolean: " + zmiennaBoolean);
    }
}
