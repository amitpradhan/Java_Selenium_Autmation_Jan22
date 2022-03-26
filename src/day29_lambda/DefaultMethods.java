package day29_lambda;

public class DefaultMethods implements I3{


    @Override
    public void m2() {
        System.out.println("I am an abstract method");
    }
    //default methods can be overridden
    @Override
    public void m3(){
        System.out.println("I am overridden default method");
    }


    public static void main(String[] args) {
        DefaultMethods defaultMethods = new DefaultMethods();
        defaultMethods.m1();
        defaultMethods.m2();
        defaultMethods.m3();
    }
}

interface I3{
    default void m1(){
        System.out.println("I am a default method");
    }
    void m2();
    default void m3(){
        System.out.println("I am another default method");
    }
}
