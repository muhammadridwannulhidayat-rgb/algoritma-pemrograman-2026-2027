public class MetodeMatematika {
    public static void main(String[] args) {
        // 1. Absolute = Mutlak
        int nomor = -6;
        System.out.println(Math.abs(nomor));

        // 2. Pow = Pangkat
        int nomor2 = 3;
        System.out.println(Math.pow(nomor2, 3));

        // 3. Sqrt = Akar kuadrat
        int nomor3 = 64;
        System.out.println(Math.sqrt(nomor3));

        // 4. Min = Minimal
        int angka1 = 2;
        int angka2 = 10;
        System.out.println(Math.min(angka1, angka2));

        // 5. Max = Maksimal
        int angka3 = 15;
        int angka4 = 25;
        System.out.println(Math.max(angka3, angka4));

        // 6. a. Round = dibulatkan ke BAWAH
        double angka5 = 5.4;
        System.out.println(Math.round(angka5));

        // 6. b. Round = dibulatkan ke ATAS
        double angka6 = 5.7;
        System.out.println(Math.round(angka6));
    }
}
