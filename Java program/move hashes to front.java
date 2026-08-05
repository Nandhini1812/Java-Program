import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        moveHashes(s);
    }
    public static void moveHashes(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '#') {
                count++;
            }
        }
        for (int i = 0; i < count; i++) {
            System.out.print("#");
        }
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != '#') {
                System.out.print(s.charAt(i));
            }
        }
    }
}