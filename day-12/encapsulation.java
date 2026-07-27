package oops_day2;
class C{
    private int a;
    private  int b;
    private String name;
    C(int a,int b,String name){
        this.a=a;
        this.b-=a;
        this.name=name;
    }
    void setID(int a,int b){
        this.a=a;
        this.b=b;
    }
    int getA(){
        return this.a;
    }
    int getB(){
        return this.b;
    }
    void display(){
        System.out.println(a+" "+b+" "+name);
    }

}

public class encapsulation {
    public static void main(String[] args){
        C c=new C(10,20,"pandi");
        c.display();
    }
}
