package day3;
import java.util.Scanner;

public class whileloop {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int num=s.nextInt();
        while(num>0){
            System.out.println(num);
            num--;
        }
    }
}
