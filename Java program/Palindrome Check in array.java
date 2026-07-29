import java.util.Scanner;
public class Main {
    static boolean palindromeCheck(int arr[], int n) {
        for (int i = 0, j = n - 1; i < j; i++, j--) {
            if (arr[i] != arr[j]) {
                return false;
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
        if (palindromeCheck(arr, n)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
}