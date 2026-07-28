import java.util.Scanner;
public class Main {
    static boolean searchElement(int arr[], int size, int key) {
        for (int i = 0; i < size; i++) {
            if (arr[i] == key) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        int key = sc.nextInt();
        if (searchElement(arr, size, key)) {
            System.out.println("Element Found");
        } else {
            System.out.println("Element Not Found");
        }
    }
}