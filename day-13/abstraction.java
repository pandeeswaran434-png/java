package oops_day3;
abstract class animal1{
    void makingsound(){
        System.out.println("making sound");
    }
}
class dog extends animal1{
    public void makesound(){
        System.out.println(" bow bow");
    }
}
class cat extends animal1{
    public void makesound(){
        System.out.println("meow meow");
    }

}

public class abstraction {
    public static void main(String[] args){
        animal1 dog=new dog();
        animal1 cat=new cat();
        dog.makingsound();
        cat.makingsound();
    }
}
