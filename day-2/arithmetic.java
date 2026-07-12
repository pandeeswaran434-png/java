package day2;
import java.util.Scanner;

public class arithmetic {
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();
        int c=a+b;
        int d=a-b;
        int e=a*b;
        int f=a/b;
        int h=a++;
        System.out.println( "add:" +c);
        System.out.println( "sub:" +d);
        System.out.println( "mul:" +e);
        System.out.println( "div:" +f);
        System.out.println( "inc:" +h);



    }


}
