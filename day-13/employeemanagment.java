package oops_day3;
abstract class empolyee{
    protected String name;
    protected int id;
    protected int salary;
    empolyee(String name,int id,int salary){
        this.name=name;
        this.id=id;
        this.salary=salary;
    }
    abstract  void bonus();


}
class manager extends empolyee{
    manager(String name,int id,int salary){
        super(name,id ,salary);

    }
    void bonus(){
        System.out.println(salary+salary*0.10);
    }

}
class developer extends empolyee{
    developer(String name,int id,int salary){
        super(name,id ,salary);

    }
    void bonus(){
        System.out.println(salary+salary*0.5);
    }
}
class intern extends empolyee{
    intern(String name,int id,int salary){
        super(name,id,salary);

    }
    void bonus(){
        System.out.println(salary);
    }
}

public class employeemanagment {
    public static void main(String[] args)
    {
        empolyee e=new manager("pandi" ,10,1200);
        empolyee w=new developer("vetri kondan",26,900);
        empolyee s=new intern ("marran",35,500);
        e.bonus();
        w.bonus();
        s.bonus();
    }
}
