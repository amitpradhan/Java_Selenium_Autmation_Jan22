package day29_lambda;

public class StaticMethod_Interface implements I4 {

    @Override
    public void m() {
        System.out.println("I am an abstract method from I4 interface.");
    }

    public static void main(String[] args) {
        StaticMethod_Interface staticMethod_interface = new StaticMethod_Interface();
        staticMethod_interface.m();
        staticMethod_interface.hi();
        I4.hello();
    }
}

interface I4 {
    default void hi(){
        System.out.println("Hi , i am a default method.");
    }
    void m();

    static void hello(){
        System.out.println("Hello, i am a static method.");
    }
}
