package day12.abstraction;

public abstract class AbstractClass {

    /**
     * Abstract methods - only has signature but no body (or implementation)
     *                  - it has a abstract keyword in front of it
     */

    public void m(){}

    public abstract void m1();
    public abstract int m2(String name);
    public abstract String m3(int i , String s);
    public abstract Object m4(int i);

}

 class  AbstractClass_Child extends AbstractClass{
     public  void m1(){
         System.out.println("In Child's overridden m1()");
     }
     public int m2(String name){
         System.out.println("In Child's overridden m2()");
         return 10;

     }
     public  String m3(int i , String s){
         System.out.println("In Child's overridden m3()");
         return "Hi..";

     }
     public Object m4(int i){
         System.out.println("In Child's overridden m4()");
         return new Object();
     }

//    public abstract void m5();

     public static void main(String[] args) {
         AbstractClass_Child obj = new AbstractClass_Child();
         obj.m1();
     }

}
