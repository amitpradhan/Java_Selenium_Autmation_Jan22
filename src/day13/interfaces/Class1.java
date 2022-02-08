package day13.interfaces;

public class Class1 implements Interface1{
    @Override
    public void m1(int i1) {
        //i = 100;

        System.out.println(i);
        System.out.println(s);
    }

    @Override
    public void m2(int i, String s) {
        System.out.println("in m2()");
    }

    @Override
    public int m3() {
        System.out.println("in m3()");

        return 0;
    }

    @Override
    public String m4() {
        System.out.println("in m4()");

        return s;
    }

    public static void main(String[] args) {
        Class1 class1 = new Class1();
        class1.m4();
    }
}
