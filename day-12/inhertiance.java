package oops_day2;
class A{
    void display(){
        System.out.println("hello world");
    }
}
class B extends A{
    void show(){
        System.out.println("welcome to show");
    }
}



public class inhertiance {
    public static void main(String[] args){
        A a=new A();
        B b=new B();

        b.display();


    }
}
