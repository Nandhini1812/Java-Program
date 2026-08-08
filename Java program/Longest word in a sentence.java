import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine()+" ";
        longestWord(s);
    }
    static void longestWord(String s){
        String word = " ";
        String longest = " ";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!=' '){
                word = word+s.charAt(i);
            }
            else{
                if(word.length()>longest.length()){
                    longest = word;
                }
                word = " ";
            }
        }
        System.out.print(longest);
    }
}