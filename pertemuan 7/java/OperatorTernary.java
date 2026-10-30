import java.util.Scanner;

public class OperatorTernary {
    public static void main(String[] args) {
        // Operator Ternary
        double input, x;

        Scanner inputUser = new Scanner(System.in);
        System.out.print("masukkan nilai : ");
        input = inputUser.nextInt();

        x = (input == 10) ? (input * input) : (input / 2);

        System.out.println("hasilnya = " + x);
        inputUser.close();
    }
}
