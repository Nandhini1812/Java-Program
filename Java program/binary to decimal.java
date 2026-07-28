import java.util.*;
public class BinaryToDecimal{
    int num(int Binary){
        int decimal=0;
        int place=1;
        while(Binary>0){
            int rem =Binary%10;
            decimal=decimal+rem*place;
            place=place*2;
            Binary=Binary/10;
        }
        return decimal;
        
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int Binary=sc.nextInt();
        BinaryToDecimal obj=new BinaryToDecimal();
        System.out.println(obj.num(Binary));
    }
}