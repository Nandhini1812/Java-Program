import java.util.*;
public class DecimalToBinary{
    int num(int decimal){
        int binary=0;
        int place=1;
        while(decimal>0){
            int rem =decimal%2;
            binary=binary+rem*place;
            place=place*10;
            decimal=decimal/2;
        }
        return binary;
        
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int decimal=sc.nextInt();
        DecimalToBinary obj=new DecimalToBinary();
        System.out.println(obj.num(decimal));
    }
}