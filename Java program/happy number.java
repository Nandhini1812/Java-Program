import java.util.Scanner;

class Main {
    static int squareSum(int num) {
        int sum = 0;

        while (num != 0) {
            int digit = num % 10;
            sum = sum + (digit * digit);
            num = num / 10;
        }

        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        while (num != 1 && num != 4) {
            num = squareSum(num);
        }

        if (num == 1)
            System.out.println("Happy Number");
        else
            System.out.println("Not a Happy Number");
    }
}