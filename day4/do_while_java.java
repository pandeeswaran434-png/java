package day4;
import java.util.Random;
import java.util.Scanner;

public class do_while_java {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        Random r=new Random();
        int key=r.nextInt(100);
        int guess;
        do{
            System.out.println("enter the value of your guess");
            guess=s.nextInt();
            if(guess>key){
                System.out.println("guess to high");
            }
            else if(guess<key){
                System.out.println("guess to low");
            }

        }
        while(key!=guess);
        System.out.println("you guessed it");

    }
}
