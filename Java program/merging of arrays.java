import java.util.Scanner;
public class Main {
    public static void mergeArray(int arr1[], int n, int arr2[], int m) {
        int merge[] = new int[n + m];
        int i = 0, j = 0, k = 0;
        while (i < n && j < m) {
            if (arr1[i] <= arr2[j]) {
                merge[k] = arr1[i];
                i++;
            } else {
                merge[k] = arr2[j];
                j++;
            }
            k++;
        }

        while (i < n) {
            merge[k] = arr1[i];
            i++;
            k++;
        }
        while (j < m) {
            merge[k] = arr2[j];
            j++;
            k++;
        }
        for (i = 0; i < n + m; i++) {
            System.out.print(merge[i] + " ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr1[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }
        int m = sc.nextInt();
        int arr2[] = new int[m];
        for (int i = 0; i < m; i++) {
            arr2[i] = sc.nextInt();
        }
        mergeArray(arr1, n, arr2, m);
    }
}