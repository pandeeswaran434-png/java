package day4;
import java.util.Scanner;

public class check_if_contains_zero {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int key=s.nextInt();
        int count=0;
        while(a!=0){
            int pop=a%10;

            if(pop==key){
               count++;
            }
            a=a/10;

        }
        System.out.println(count);
    }
}
