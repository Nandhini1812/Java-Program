import java.util.*;
public class Main {
    public static void value(String s) {
        System.out.print(s.length());
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        value(s);
    }
}