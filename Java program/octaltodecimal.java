import java.util.*;
public class octaltodecimal{
    int num(int octal){
        int decimal=0;
        int place=1;
        while(octal>0){
            int rem =octal%10;
            decimal=decimal+rem*place;
            place=place*8;
            octal=octal/10;
        }
        return decimal;
        
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int octal=sc.nextInt();
        octaltodecimal obj=new octaltodecimal();
        System.out.println(obj.num(octal));
    }
}