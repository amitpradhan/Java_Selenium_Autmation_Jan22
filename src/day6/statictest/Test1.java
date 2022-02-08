package day6.statictest;

public class Test1 {

    static {
        System.out.println("In static block");
    }
    {
        System.out.println("In non-static block");
    }

    public static void main(String[] args) {
        StaticTest1 staticTest11 = new StaticTest1();
        staticTest11.m1();
        System.out.println(staticTest11.i);

        StaticTest1 staticTest12 = new StaticTest1();
        staticTest12.m1();
        System.out.println(staticTest12.i);

        System.out.println(staticTest11.j);
        staticTest11.m2();

        System.out.println(StaticTest1.j);
        StaticTest1.m2();

//        StaticTest1 staticTest11 = new StaticTest1();


    }
}
