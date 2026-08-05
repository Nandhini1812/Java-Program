import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        extraCharacter(s1, s2);
    }
    public static void extraCharacter(String s1, String s2) {
        int result = 0;
        for (int i = 0; i < s1.length(); i++) {
            result ^= s1.charAt(i);
        }
        for (int i = 0; i < s2.length(); i++) {
            result ^= s2.charAt(i);
        }
        System.out.print((char) result);
    }
}