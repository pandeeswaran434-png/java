package day10;

public class insert {
    public static void main(String[] args){
        StringBuilder name=new StringBuilder("hello");
        name.append(" world");
       // name.replace(0,9,"hello guys");
        //name.insert(2,'u');
        name.delete(6,10);

        System.out.println(name);
    }
}
