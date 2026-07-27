package oops_day2;
class animal{
    void makesound(){
        System.out.println("animal sound");
    }


}
class dog extends animal{
    @Override
    void makesound(){
        System.out.println("sound made my dog");
    }

}


public class main {
    public static void main(String[] args){
        dog e=new dog();
         e.makesound();


    }
}
