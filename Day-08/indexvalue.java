package day8;
import java.util.Scanner;

public class indexvalue {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[]arr=new int[n];
        int target=s.nextInt();
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        System.out.println(linearsearch(arr, target));
    }
    static int linearsearch(int[]arr,int target){
        for(int i=0;i<arr.length; i++){
            if(arr[i]==target){
                return i;
            }
        }
        return -1;
    }

}
