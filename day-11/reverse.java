package oops_day1;
import java.util.*;
class D{
    int rev_int(){
        Scanner s=new Scanner(System.in);
        int num=s.nextInt();
        int rev=0;
        while(num!=0){
            int pop=num%10;
            rev=rev*10+pop;
            num/=10;
        }
        return rev;
    }
}

public class reverse {
    public static void main(String[] args){
        D a=new D();
        System.out.println(a.rev_int());
    }
}
