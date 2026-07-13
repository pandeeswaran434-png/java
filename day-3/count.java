
import java.util.Scanner;

public class count{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        int count=0;
        while(num!=0){
            int pop=num%10;
            count++;
            num/=10;
            System.out.println(count);
        }
    }
}
