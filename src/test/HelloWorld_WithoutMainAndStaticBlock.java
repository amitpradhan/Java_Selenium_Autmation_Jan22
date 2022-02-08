package test;

public class HelloWorld_WithoutMainAndStaticBlock {

    public static int m(){
        System.out.println("Hello world");
        return 0;
    }

    public static int i = m();


    public static void main(String[] args) {

    }
}
