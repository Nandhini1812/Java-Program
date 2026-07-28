import java.util.Scanner;

public class Main {

    int octalToBinary(int octal) {
        int decimal = 0;
        int place = 1;

        // Octal to Decimal
        while (octal > 0) {
            int rem = octal % 10;
            decimal = decimal + (rem * place);
            place = place * 8;
            octal = octal / 10;
        }

        // Decimal to Binary
        int binary = 0;
        place = 1;

        while (decimal > 0) {
            int rem = decimal % 2;
            binary = binary + (rem * place);
            place = place * 10;
            decimal = decimal / 2;
        }

        return binary;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int octal = sc.nextInt();

        Main obj = new Main();

        System.out.println(obj.octalToBinary(octal));
    }
}