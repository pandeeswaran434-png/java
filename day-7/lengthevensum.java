package day7;

public class lengthevensum {
    public static void main(String[] args){
        int[]id={12,567,89,3,67};
        int evensum=0;
        int oddsum=0;
        for(int num:id){
            int org=num;
            int count=0;
            while(num!=0){
                int pop=num%10;
                count+=pop;
                num/=10;


            }
            if(count%2==0){
                evensum+=org;
            }
            else{
                oddsum+=org;
            }
        }
        System.out.println(evensum);
        System.out.println(oddsum);
    }
}
