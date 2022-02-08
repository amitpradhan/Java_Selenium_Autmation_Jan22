package day9.private_constructor;

public class D extends C{

    public D(){
        super(100);
        System.out.println("In D's default const..");
    }

    public D(int i , int j){
        super(1000);
        System.out.println("In D's two arg const");
    }

    public static void main(String[] args) {
        D d = new D();
        System.out.println();


        C c  = new C(10, 20);
    }
}
