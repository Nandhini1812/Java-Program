import java.util.Scanner;
public class Main {
    static double averageOfArray(int arr[], int size) {
        int sum = 0;
        for (int i = 0; i < size; i++) {
            sum = sum + arr[i];
        }
        return (double) sum / size;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        double avg = averageOfArray(arr, size);
        System.out.print(avg);
    }
}