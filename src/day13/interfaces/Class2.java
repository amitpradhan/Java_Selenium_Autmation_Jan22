package day13.interfaces;

public class Class2 implements Interface2{
    @Override
    public void m1(int i) {
        System.out.println("In class2-m1()");
    }

    @Override
    public void m2(int i, String s) {
        System.out.println("In class2-m2()");
    }

    @Override
    public int m3() {
        System.out.println("In class2-m3()");
        return 0;
    }

    @Override
    public String m4() {
        System.out.println("In class2-m4()");
        return null;
    }

    @Override
    public void m5(int i, int j, int k) {
        System.out.println("In class2-m5()");

    }

    public static void main(String[] args) {
        Class2 class2 = new Class2();
        class2.m1(10);
    }
}
