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


    }
}
