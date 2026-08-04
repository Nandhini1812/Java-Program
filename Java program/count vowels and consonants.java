import java.util.*;
public class Main {
    public static void values(String s) {
        int vowel = 0;
        int consonant = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'||
                ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
                vowel++;
            }
            else if ((ch >= 'A' && ch <= 'Z') ||
                     (ch >= 'a' && ch <= 'z')) {
                consonant++;
            }
        }
        System.out.println(vowel);
        System.out.println(consonant);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        values(s);
    }
}