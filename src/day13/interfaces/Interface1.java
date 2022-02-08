package day13.interfaces;

public interface Interface1 {
    /**
     * 1- interface has keyword interface
     * 2- It can ONLY contain public abstract methods i.e. it implements 100% abstraction
     * 3- All methods in interface are by default abstract and public i.e. we don't have to provide abstract or public keyword
     * 4- Interfaces can have ONLY public static final variables.
     * 5- Interfaces do not have any constructors and we cant create object of an interface
     * 6- Class can extends another class
     *    - interafce can extends another intreface. One interface also can extends multiple interfaces.
     *    - class can implements an interface
     *    - a class can implmenet mulltiple interfaces
     * 7- Interface supports multiple inheritance
     *
     */


    void m1(int i);
    void m2(int i , String s);
    int m3();
    String m4();


    int i =10; //constant
    public static final String s ="Java";



}
