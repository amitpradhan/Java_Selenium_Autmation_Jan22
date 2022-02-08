package day11.polymorphism.dynamic_dispatching;

public class B extends A{




    @Override
    public void m1() {
        System.out.println("In B's m1()-overridden");
    }
    @Override
    public void m2() {
        System.out.println("In B's m2()-overridden");
    }
    public void m5() {
        System.out.println("In B's m5()-child specific");
    }
    public void m6() {
        System.out.println("In B's m6()-child specific");
    }

}

class C extends A{
    @Override
    public void m1() {
        System.out.println("In C's m1()-overridden");
    }
    @Override
    public void m2() {
        System.out.println("In C's m2()-overridden");
    }

    public void m7() {
        System.out.println("In C's m7()-child specific");
    }
    public void m8() {
        System.out.println("In C's m8()-child specific");
    }

}
class Test{
    public static void main(String[] args) {
        //Dynamic Dispatching  (run-time polymorphism)- Parent's reference will point to child's object
        //We cannot call child specific method using parent's reference variable
        //Overridden methods from child class will be called
        //loose coupling

        A obj = new B();
        obj.m1();
        obj.m2();
        obj.m3();
        obj.m4();
        //        obj.m7(); - not allowed


        System.out.println("**********************************************");
        obj = new C();
        obj.m1();
        obj.m2();
        obj.m3();
        obj.m4();
//        obj.m5(); - not allowed

//
//        WebDriver driver = new ChromeDriver();
//        driver = new FirefoxDfriver()
    }
}