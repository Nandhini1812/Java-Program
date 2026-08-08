import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine()+" ";
        reverseWord(s);
    }
    static void reverseWord(String s){
        String word = " ";
        for(int i=s.length()-1;i>=0;i--){
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