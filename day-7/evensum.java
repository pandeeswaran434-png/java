package day7;
import java.util.Scanner;

public class evensum {
    public static void main(String[]args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[]arr=new int[n];
        int evensum=0;
        int oddsum=0;
        for(int i=0;i<n;i++){
            int a=s.nextInt();
            arr[i]=a;

        }
        for(int num:arr){
            if(num%2==0){
                evensum+=num;
            }
            else{
                oddsum+=num;
            }

        }
        System.out.println(evensum);
        System.out.println(oddsum);


    }
}
