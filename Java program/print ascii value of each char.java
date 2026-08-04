import java.util.*;
public class Main {
    public static void value(String s) {
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            System.out.println((int) ch);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        value(s);
    }
}