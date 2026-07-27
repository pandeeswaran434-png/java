package day10;

public class stringreverse {
    public static void main(String[] args){
        String str="helleh";
        char []arr=str.toCharArray();
        int Start=0,End=arr.length-1;
        while(Start<=End){
            char temp=arr[Start];
            arr[Start]=arr[End];
            Start++;
            End--;
        }
        String s=new String(arr);
       System.out.println(str.equals(s)?"yes":"no");


    }
}
