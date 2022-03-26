package day29_lambda;

public class MethodReference_2 {
    public void hello(){
        System.out.println("Hello. I am a non-static method.");
         }

    public static void main(String[] args) {
        MethodReference_2 obj = new MethodReference_2();
        //refer using object ref
        I2 hello = obj::hello;
        hello.hi2();

        I2 hello2 =  new MethodReference_2()::hello;
        hello2.hi2();
    }
    
}

@FunctionalInterface
interface I2{
    void hi2();

}
