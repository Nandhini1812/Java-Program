import java.util.Scanner;

public class Main {

    int binaryToOctal(int binary) {
        int decimal = 0;
        int place = 1;

        // Binary to Decimal
        while (binary > 0) {
            int rem = binary % 10;
            decimal = decimal + rem * place;
            place = place * 2;
            binary = binary / 10;
        }

        // Decimal to Octal
        int octal = 0;
        place = 1;

        while (decimal > 0) {
            int rem = decimal % 8;
            octal = octal + rem * place;
            place = place * 10;
            decimal = decimal / 8;
        }

        return octal;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int binary = sc.nextInt();

        Main obj = new Main();

        System.out.println(obj.binaryToOctal(binary));
    }
}