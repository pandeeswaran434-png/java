package day4;
import java.util.Scanner;

public class harshadnum {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
            int n=s.nextInt();
            int temp=n;
            int sum=0;
            while(temp!=0) {
                int a = temp % 100;
                sum += a;
                temp = temp / 100;
            }
                if(n%sum==0){
                    System.out.println("harshad number");
                }
                else
                {
                    System.out.println("not harshad number");
                }





    }
}
