package day6;
import java.util.Scanner;

public class alphabet {
    public static void main(String[] args){
        char ch='a';
        for(int i=1;i<=5;i++){
            for(int j=1;j<=5;j++){
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }
}
