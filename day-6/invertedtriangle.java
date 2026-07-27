package day6;
import java.util.Scanner;

public class invertedtriangle {
    public static void main(String[] args){
        int n=5;
        for(int i=0;i<n;i++){
    for(int j=n;j>i;j--){
        System.out.print("*");
    }
    System.out.println();
        }
    }
}
