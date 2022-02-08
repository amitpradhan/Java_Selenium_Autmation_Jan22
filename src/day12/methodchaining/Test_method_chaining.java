package day12.methodchaining;

public class Test_method_chaining {

    public Test_method_chaining m1(){
        System.out.println("In m1()..");
        return this;
    }

    public Test_method_chaining m2(){
        System.out.println("In m2()..");
        return this;
    }
    public Test_method_chaining m3(){
        System.out.println("In m3()..");
        return this;
    }
    public void m4(){
        System.out.println("In m4()..");
    }

    public static void main(String[] args) {
        Test_method_chaining obj = new Test_method_chaining();
        obj.m1().m2().m3().m4();

    }

}
