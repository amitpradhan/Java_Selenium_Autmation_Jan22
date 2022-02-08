package day6.statictest;

public class StaticTest1 {

    int i = 10;
    static int j = 20;

    public void m1(){
        System.out.println("In non-static m1()");
    }
    public static void m2(){
        System.out.println("In static m2()");
    }

    public static void main(String[] args) {
        StaticTest1 staticTest11 = new StaticTest1();
        staticTest11.i = 100;
        StaticTest1 staticTest12 = new StaticTest1();
        System.out.println(staticTest12.i); //10

        j = 300;
        System.out.println(j);
        m2();

    }


}
