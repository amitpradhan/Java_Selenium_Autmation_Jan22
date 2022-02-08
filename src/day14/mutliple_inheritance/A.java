package day14.mutliple_inheritance;

public class A {
    public void m(){
        System.out.println("In A-m()");
    }
}

class B{
    public void m(){
        System.out.println("In B-m()");
    }
}

class C extends B{

    public static void main(String[] args) {
        C c = new C();
        c.m();
    }
}
