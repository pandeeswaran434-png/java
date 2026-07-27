package day7;

public class average {
    public static void main(String[] args){
        int[]n={1,2,3,4,5,6,7,8,9,10};
        int length=n.length;
        int sum=0;
        for(int num:n ){
            sum+=num;
        }
        float avg=(float)sum/length;
        System.out.println(sum);
        System.out.println(avg);
    }
}
