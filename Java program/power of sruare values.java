import java.util.Scanner;

public class Main {

    void number(int start, int second) {
        int result = 1;

        for (int i = 1; i <= second; i++) {
            result = result * start;
        }

        System.out.print(result);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int start = sc.nextInt();
        int second = sc.nextInt();

        Main obj = new Main();
        obj.number(start, second);
    }
}