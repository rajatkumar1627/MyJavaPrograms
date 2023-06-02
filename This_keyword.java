class A {
    public A() {
        super();
        System.out.println("In A");
    }

    public A(int n) {
        super();
        System.out.println("In A int");
    }
}

class B extends A {
    public B() {
        super(3);
        System.out.println("In B");
    }

    public B(int n) {
        this(); // Corrected the order of this() call
        System.out.println("In B int");
    }
}

public class This_keyword {
    public static void main(String[] args) {
        B obj = new B();
        B obj1 = new B(6);
        obj.getClass();
        obj1.getClass();
    }
}
