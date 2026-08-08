import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine()+" ";
        reverseEachWord(s);
    }
    static void reverseEachWord(String s){
        String word = " ";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!=' '){
                word = s.charAt(i)+word;
            }
            else{
                if(word.length()>0){
                    System.out.print(word+" ");
                    word = " ";
                }
            }
        }
    }
}