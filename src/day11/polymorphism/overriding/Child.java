package day11.polymorphism.overriding;

public class Child extends Parent{
    /**
     * Overriding - method signature remains same but implementation differs in child class
     * overriding happens in child class i.e. wheneever inheritance happens
     * signature remains same but implementation differs in case of overriding
     */

    @Override
    public void m1() {
        System.out.println("In Child's m1()-overridden");
    }

    public void m1(int i) {
        System.out.println("In Child's m1()-overridden");
    }
    @Override
    public void m2() {
        System.out.println("In Child's m2()-overridden");
    }
    public void m5() {
        System.out.println("In Child's m5()-child specific");
    }
    public void m6() {
        System.out.println("In Child's m6()-child specific");
    }
}

class Test{

    public static void main(String[] args) {
        Child child = new Child();
        Parent parent = new Parent();

        System.out.println("Child's Object...");
        child.m1();
        child.m2();
        child.m5();
        child.m6();

        System.out.println("Parent's Object");
        parent.m1();
        parent.m2();

    }


}

