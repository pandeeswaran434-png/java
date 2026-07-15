package day5;
import java.util.Scanner;

public class smallvalue {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.println("enter number:");
        int n=s.nextInt();
        int min=9;
        while(n!=0){
            int pop=n%10;
            if (pop<min){
                min=pop;
            }
            n/=10;

        }
        System.out.println(min);
    }
}
