import java.util.*;
public class decimalTooctal{
    int num(int decimal){
        int octal=0;
        int place=1;
        while(decimal>0){
            int rem =decimal%8;
            octal=octal+rem*place;
            place=place*10;
            decimal=decimal/8;
        }
        return octal;
        
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int decimal=sc.nextInt();
        decimalTooctal obj=new decimalTooctal();
        System.out.println(obj.num(decimal));
    }
}