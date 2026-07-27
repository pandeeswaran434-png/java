package day7;
import java.util.Scanner;
public class array {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        String[]name=new String[5];
        for(int i=0;i<5;i++) {
            String a = s.next();
            name[i] = a;
        }
        for(String str:name ){
            System.out.print(str+" ");
        }
    }
}
