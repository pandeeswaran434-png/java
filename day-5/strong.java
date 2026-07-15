package day5;

import java.util.Scanner;

public class strong {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int n = s.nextInt();

        if (isStrong(n)) {
            System.out.println("It is a Strong Number");
        } else {
            System.out.println("It is not a Strong Number");
        }
    }

    public static boolean isStrong(int num) {

        int sum = 0;
        int temp = num;

        while (num != 0) {

            int pop = num % 10;
            int number = fact(pop);
            sum += number;
            num = num / 10;
        }

        return sum == temp;
    }

    public static int fact(int n) {

        int fact = 1;

        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }

        return fact;
    }
}