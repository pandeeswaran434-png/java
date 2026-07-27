package day10;

public class stringbuilder {
    public static void main(String[]args){
       StringBuilder name=new StringBuilder("hello");
       name.append(" world");
       name.insert(0,'y');

        System.out.println(name);
    }
}
