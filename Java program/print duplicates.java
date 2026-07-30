import java.util.Scanner;

public class Main {

    public static void printDuplicates(int arr[], int n) {

        for (int i = 0; i < n; i++) {

            boolean printed = false;

            // Check if already printed
            for (int k = 0; k < i; k++) {
                if (arr[i] == arr[k]) {
                    printed = true;
                    break;
                }
            }

            if (printed)
                continue;

            // Check for duplicate
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    System.out.print(arr[i] + " ");
                    break;
                }
            }
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        printDuplicates(arr, n);
    }
}