package day5;
import java.util.Scanner;

public class amstrong {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int num=s.nextInt();
        int org=num;
        int sum=0;
        while(num!=0){
            int pop=num%10;
            sum+=pop*pop*pop;
            num=num/10;
        }
        if(sum==org){
            System.out.println("amstrong number");
        }
        else{
            System.out.println("not amstrong number");
        }
    }
}
