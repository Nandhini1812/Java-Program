import java.util.Scanner;
public class Main{
    int number(int n){
        int sum;
        while(n>=10){
            sum=0;
            while(n!=0){
                int digit=n%10;
                sum=sum+digit;
                n=n/10;
                
            }
            n=sum;
        }
        return n;
        
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Main obj=new Main();
       System.out.println(obj.number(n));
        
    }
}