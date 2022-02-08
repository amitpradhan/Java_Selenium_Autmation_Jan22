package day11.polymorphism.overloading;

public class Method_Overloading_Child  extends Method_Overloading1{

    public static void main(String[] args) {
        Method_Overloading_Child  obj = new Method_Overloading_Child();
        obj.m();
        obj.m("hi");
        obj.m(10,20);
        main("From child class");
    }

}
