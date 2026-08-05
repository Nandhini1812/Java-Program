import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        checkEqual(s1, s2);
    }
    public static void checkEqual(String s1, String s2) {
        if (s1.length() != s2.length()) {
            System.out.print("false");
            return;
        }
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                System.out.print("false");
                return;
            }
        }
        System.out.print("true");
    }
}