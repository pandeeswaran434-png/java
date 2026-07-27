package day8;

public class searchinarray {
    public static void main(String[]args){
        String name="hello world";
        char[] name1=name.toCharArray();
        char target='d';
        if(ls(name1,target)){
            System.out.println("found");
        }
        else{
            System.out.println("not found");
        }
    }
    public static boolean ls(char[]name1,char target){
        for(char n:name1){
            if(n==target){
                return true;
            }
        }
        return false;
    }
}
