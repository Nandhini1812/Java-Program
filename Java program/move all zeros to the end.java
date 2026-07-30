import java.util.Scanner;

public class Main {

    public static void moveZeros(int arr[], int n) {

        int j = 0;

        // Move non-zero elements to the front
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                arr[j] = arr[i];
                j++;
            }
        }

        // Fill remaining positions with 0
        while (j < n) {
            arr[j] = 0;
            j++;
        }

        // Print the array
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        moveZeros(arr, n);
    }
}