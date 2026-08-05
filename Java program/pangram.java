import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        pangram(s);
    }
    public static void pangram(String s) {
        int[] freq = new int[26];
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                freq[ch - 'a'] = 1;
            } else if (ch >= 'A' && ch <= 'Z') {
                freq[ch - 'A'] = 1;
            }
        }
        for (int i = 0; i < 26; i++) {
            if (freq[i] == 0) {
                System.out.print("Not Pangram");
                return;
            }
        }
        System.out.print("Pangram");
    }
}