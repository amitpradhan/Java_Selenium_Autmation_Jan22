package day9.private_constructor;

public class C {

    private int i = 10;
    private void m(){
        System.out.println("In private m()");
    }


    private C(){
        System.out.println("In C's default const..");
    }

    public C(int i){
        this();
        System.out.println("In C's one arg const..");
    }

    protected C(int i, int j){
        this();
        System.out.println("In C's two arg protected const..");
    }
}

class TestC{
    public static void main(String[] args) {
//        new C();//private const is not accessible outside the class
        new C(10);
    }
}