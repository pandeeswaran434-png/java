package day2;
import java.util.Scanner;

public class divisble {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        if (a%5==0){
            System.out.println("divisble:");
        }
        else {
            System.out.println("not divisble:");
        }
    }
}
