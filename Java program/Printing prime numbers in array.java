import java.util.Scanner;
public class Main {
    static void printPrimeNumbers(int arr[], int size) {
        for (int i = 0; i < size; i++) {
            int count = 0;
            if (arr[i] > 1) {
                for (int j = 1; j <= arr[i]; j++) {
                    if (arr[i] % j == 0) {
                        count++;
                    }
                }
                if (count == 2) {
                    System.out.print(arr[i] + " ");
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        printPrimeNumbers(arr, size);
    }
}