package day29_lambda;

public class MethodReference_Ex {

    /**
     * Method reference is used to refer method of functional reference.
     *
     */
    //1- Reference to a static method
    public  static void  hello(){
        System.out.println("Hello Java! I am a static method");
    }

    public static void main(String[] args) {
        I1 i1 = MethodReference_Ex::hello;
        i1.hi();
    }



}

@FunctionalInterface
interface I1{
    void hi();
}