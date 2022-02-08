package day8.inheritance;

public class B extends A{
//   Below code is invisbly present in calss B
//    int i = 10;
//
//    public void m1(){
//        System.out.println("In parent ..A-m1()");
//    }

    int j = 20;
    public void m2(){
        System.out.println("In B-m2()..");
    }

    public static void main(String[] args) {

        System.out.println("Child's Object");
        B b = new B();
        b.m1();
        b.m2();
        b.i = 40;
        System.out.println(b.i + "--"+b.j);

        System.out.println("Parent's Object..");
        A a = new A();
        a.m1();
//        a.m2()

    }
}
