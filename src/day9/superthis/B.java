package day9.superthis;

public class B extends A {

    int i = 20;
    public void m(){
        System.out.println("In B's m()..");
    }

    private B(){
        super();
        System.out.println("In B's default constructor");
    }

    public B(int i){
        super();
        System.out.println("In B's default constructor");
    }
    public  void test(){
        System.out.println("B's test() starts ...");
        super.m();
        this.m();
        System.out.println("Super class i-> " +super.i);
        System.out.println("Child class i->"+this.i);
        System.out.println("B's test() ends ...");


        int i = 10;
//        new B();
        B b = new B();
    }


    public static void main(String[] args) {
//        super.m();
        B bObject = new B();
//        bObject.m();
//        System.out.println(bObject.i);

        System.out.println("***********************************");
        bObject.test();

    }

}

class Test{
    public static void main(String[] args) {
        new B(10);
    }
}
