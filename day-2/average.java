package day2;
import java.util.Scanner;

public class average {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.println("enter tam mark:");
        int a=s.nextInt();
        System.out.println("enter eng mark:");
        int b=s.nextInt();
        System.out.println("enter phy mark:");
        int c=s.nextInt();
        System.out.println("enter chm mark:");
        int d=s.nextInt();
        System.out.println("enter mat mark:");
        int e=s.nextInt();
        int sum=a+b+c+d+e;
        float average=sum/5;
        System.out.println(average);
    }
}
