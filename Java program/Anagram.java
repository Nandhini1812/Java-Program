import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        anagram(s1, s2);
    }
    public static void anagram(String s1, String s2) {
        if (s1.length() != s2.length()) {
            System.out.print("Not Anagram");
            return;
        }
        int[] freq = new int[256];
        for (int i = 0; i < s1.length(); i++) {
            freq[s1.charAt(i)]++;
            freq[s2.charAt(i)]--;
        }
        for (int i = 0; i < 256; i++) {
            if (freq[i] != 0) {
                System.out.print("Not Anagram");
                return;
            }
        }
        System.out.print("Anagram");
    }
}