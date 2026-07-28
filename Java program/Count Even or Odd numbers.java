import java.util.Scanner;
public class Main {
    static void countEvenOddNumbers(int arr[], int size) {
        int Even = 0;
        int Odd = 0;
        for (int i = 0; i < size; i++) {
            if (arr[i] % 2 != 0) {
                Odd++;
            } else {
                Even++;
            }
        }
        System.out.println(Even);
        System.out.println(Odd);
    }
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int size = obj.nextInt();      
        int arr[] = new int[size];     
        for (int i = 0; i < size; i++) {
            arr[i] = obj.nextInt();
        }
        countEvenOddNumbers(arr, size); 
    }
}