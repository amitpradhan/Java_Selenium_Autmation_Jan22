package day6.statictest;

public class StaticTest2 {
    /**
     * 1- static members are common for all the objects/instances
     * 2- static keywords can be applied to classes, variables, methods, blocks
     * 3- static members should be accessed via static way ( e.g. using classname if its present in a different class)
     * 4- static members are class members i.e. only one copy of static members will be created in the memory.
     * 5- In non-static methods , we can access both static and non-static members directly (i.e. without an object reference)
     * 6- In static methods , we can ONLY access static members without object reference.
     */

           String city1 = "Mumbai"; //non-static
    static String city2  = "Pune";


    public static void printCity(){

        StaticTest2 staticTestObj = new StaticTest2();
//        System.out.println(city1);
        System.out.println(staticTestObj.city1);
        System.out.println(city2);
        m1();
        staticTestObj.m2();
    }

    public void printCity2(){
        System.out.println(city1);
        System.out.println(city2);
        m1();
        m2();
    }

    public static void m1(){
        System.out.println("In static m1()");
    }
    public void m2(){
        System.out.println("In non-static m2()..");
    }

    public static void main(String[] args) {
        StaticTest2 staticTestObj = new StaticTest2();
        staticTestObj.printCity2();
        printCity();

    }


}
