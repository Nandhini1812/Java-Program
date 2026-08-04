import java.util.*;
public class Main {
    public static void value(String s) {
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (!((ch >= '0' && ch <= '9') ||
                  (ch >= 'A' && ch <= 'Z') ||
                  (ch >= 'a' && ch <= 'z'))) {
                System.out.print(ch);
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        value(s);
    }
}