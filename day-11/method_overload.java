package oops_day1;

class B {
    int A() {
        return 1;
    }

    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }

    void display() {
        System.out.println("hello world");
    }
}

public class method_overload {
    public static void main(String[] args) {

        B a = new B();

        int e = a.A();      // Correct
        System.out.println(e);

        System.out.println(a.add(1, 2, 3));
        System.out.println(a.add(1, 2));

        a.display();
    }
}