package day12.abstraction;

public abstract class AbstractClass2 {
    /**
     * 1- Abstract class can have abstract methods as well as non abstract (concrete) methods
     * 2- It can have constructors but we cannot create its object (cannot instatiate it)
     * 3- The child class of an abstract class MUST implement all abstract methods or else
     *   declare itself as abstract.
     *  4- Abstract classes have constructor even though we cannot create it's objects because ,
     *      the constructor would be called in the child class constructor.
     */

    public AbstractClass2(){ System.out.println("In no-arg parent's const"); }
    public AbstractClass2(int i){
        System.out.println("In one-arg parent's const");
    }


    public abstract void m1();
    public abstract int m2(String name);
    public abstract String m3(int i , String s);

    //non-abstract or concrete method
    public Object m4(int i){
        System.out.println("In Parent's  m4()");
        return new Object();
    }

    public static void main(String[] args) {
        //new AbstractClass2();//'AbstractClass2' is abstract; cannot be instantiated
    }

}

class AbstractClass2_child extends AbstractClass2{

    public AbstractClass2_child(){
        super();
        System.out.println("In no-arg child's const");
    }


    @Override
    public void m1() {
        System.out.println("In child's m1()");
    }

    @Override
    public int m2(String name) {
        System.out.println("In child's m2()");
        return 0;
    }

    @Override
    public String m3(int i, String s) {
        System.out.println("In child's m3()");
        return null;
    }

    public static void main(String[] args) {
        AbstractClass2_child obj = new AbstractClass2_child();
        obj.m1();
    }
}

