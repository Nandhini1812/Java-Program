import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        convert(s);
    }
    static void convert(String s){
        int h = (s.charAt(0)-48)*10+(s.charAt(1)-48);
        if(s.charAt(8) == 'P' && h!=12){
            h=h+12;
        }
        if(s.charAt(8) == 'A' && h==12){
            h=0;
        }
        if(h<10){
            System.out.print("0");
        }
        System.out.print(h);
        for(int i=2;i<8;i++){
            System.out.print(s.charAt(i));
        }
    }
}