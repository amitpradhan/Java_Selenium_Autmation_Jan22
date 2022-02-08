package day6.statictest;

public class TestAB {

    public static void main(String[] args) {
        A.m1();
        B.m1();
        System.out.println(A.i + B.i);

        A a = new A();
        B b = new B();

        a.m2();
        b.m2();


    }
}
