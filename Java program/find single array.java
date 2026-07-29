import java.util.Scanner;
public class Main {
    static int findSingle(int arr[], int n) {
        int result = 0;
        for (int i = 0; i < n; i++) {
            result = result ^ arr[i];
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(findSingle(arr, n));
    }
}