import java.util.Scanner
public class SortedNot {
    static boolean isSorted(int arr[], int n) {
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        if (isSorted(arr, n)) {
            System.out.println("Sorted");
        } else {
            System.out.println("Not Sorted");
        }
    }
}