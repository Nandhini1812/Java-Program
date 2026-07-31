import java.util.Scanner;
public class Main {
    public static void majorityElement(int arr[], int size) {
        int majority = -1;
        for (int i = 0; i < size; i++) {
            int count = 0;
            for (int j = 0; j < size; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            if (count > size / 2) {
                majority = arr[i];
                break;
            }
        }
        if (majority != -1) {
            System.out.println(majority);
        } else {
            System.out.println("No Majority Element");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        majorityElement(arr, size);
    }
}