import java.util.Scanner;

public class KalkulatorStatis {
    public static void main(String[] args) {
        // a. Statis
        Scanner Input = new Scanner(System.in);
        System.out.print("Masukkan nomor1: ");
        int nomor1 = Input.nextInt();
        System.out.print("Masukkan nomor2: ");
        int nomor2 = Input.nextInt();
        System.out.println(nomor1 * nomor2);
        Input.close();
    }
}
