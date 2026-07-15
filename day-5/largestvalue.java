package day5;
import java.util.Scanner;

public class largestvalue {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.println("enter number");
        int num=s.nextInt();
        int max=0;
        while(num!=0){
            int pop=num%10;
            if(num>max){
                max=pop;

            }
            num/=10;
        }
        System.out.println(max);
    }
}
