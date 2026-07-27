package day10;

public class spilt {
    public static void main(String[] args){
        String str="apple,banana,orange";
        String[] fruits=str.split(",");
        for(String strings:fruits) {
            System.out.print(strings +" ");
        }
    }
}
