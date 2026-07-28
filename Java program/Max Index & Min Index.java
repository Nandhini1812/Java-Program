import java.util.Scanner;
public class Main {
    static void findMaxMinIndex(int arr[], int size) {
        int maxIndex = 0;
        int minIndex = 0;
        for (int i = 1; i < size; i++) {
            if (arr[i] > arr[maxIndex]) {
                maxIndex = i;
            }
            if (arr[i] < arr[minIndex]) {
                minIndex = i;
            }
        }
        System.out.println("Maximum element index = " + maxIndex);
        System.out.println("Minimum element index = " + minIndex);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        findMaxMinIndex(arr, size);
    }
}