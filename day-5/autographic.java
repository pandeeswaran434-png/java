package day5;
import java.util.Scanner;

public class autographic {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int sq=n*n;
        int temp=n;
        while(temp>0){
            if(temp%10!=sq%10){
                System.out.println("not autographic number:");
            }
            temp=temp/10;
            sq=sq/10;

                System.out.println("autographic number");

        }
    }
}
