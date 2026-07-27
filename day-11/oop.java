package oops_day1;

class A {
    int id;
    String name;
    String name1;

    A(int id) {
        this.id = id;
    }

    A(String name) {
        this.name = name;
    }

    A(String name1, String name2) {
        this.name1 = name1;
        this.name = name2;
    }

    A(int id, String name) {
        this.id = id;
        this.name = name;
    }

    void display() {
        System.out.println(id + " " + name);
    }
}

public class oop {
    public static void main(String[] args) {

        A obj1 = new A(10);
        obj1.display();

        A obj2 = new A(10, "hh");
        obj2.display();
    }
}