import java.util.Scanner;
public class Main {
    public static void shiftZeroToEnd(int arr[], int size) {
        int index = 0;
        for (int i = 0; i < size; i++) {
            if (arr[i] != 0) {
                arr[index] = arr[i];
                index++;
            }
        }
        while (index < size) {
            arr[index] = 0;
            index++;
        }
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        shiftZeroToEnd(arr, size);
    }
}