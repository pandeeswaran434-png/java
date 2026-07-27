package oops_day1;
import java.util.*;
class F{
    int a;
    int b;
    String c;
    String d;
    F(int a){
        this.a=a;
    }
    void display(int a){
        System.out.println(a);
    }
    F(){

    }
    void display(){
        System.out.println("display");
    }
    F(int a ,int b ){
        this.a=a;
        this.b=b;
    }
    void display(int a,int b){
        System.out.println(a+" "+b);
    }
    F(int a,String c){
        this.a=a;
        this.c=c;
    }
    void display(int a,String c){
        System.out.println(a+" "+c);
    }
    F(String c){
        this.c=c;
    }
    void display(String c){
        System.out.println(c);
    }
}

public class oops {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int input=s.nextInt();
        //int input1=s.nextInt();
        String input2=s.next();
        F obj=new F(input ,input2);
        obj.display(input ,input2);

    }
}
