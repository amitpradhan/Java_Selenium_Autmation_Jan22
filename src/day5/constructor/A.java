package day5.constructor;

public class A {
    /**
     * 1- As soon as we create a class a default constructor is created
     *   E.g. Class A will have a default constructor A()
     *   i) Default constructor: A constructor is called "Default Constructor" when it doesn't have any parameter.
     *    ii) Parameterized constructor: A constructor which has a specific number of parameters is called a parameterized constructor.
     * 2- constructor is called during object creation or instantiation
     * 3- Constructor name must be the same as its class name
     * 4- A Constructor must have no explicit return type
     * 5- A Java constructor cannot be abstract, static, final, and synchronized
     * 6- If there is no constructor in a class, compiler automatically creates a default constructor.
     * 7- We can overload a const by changing no of arguments , type of arguments and sequence of arguments
     *
     * 8- Java provides a Constructor class which can be used to get the internal information of a constructor in the class.
     *    It is found in the java.lang.reflect package.
     */
//    int i;
//    public void A(){
//
//    }

    //write my own default const
    public A(){
        System.out.println("In default or no arg const..");
    }
    //constrctor overloading , paramaterized const
    public A(int i){
        System.out.println("In one-arg const..");
    }

    public A(int i, int j){
        System.out.println("In two-arg INT-INT const..");
    }

    //constrctor overloading
    public A(int i,String name){
        System.out.println("In two-arg INT-STRING const.."+name);
    }

    public A(String name,int i){
        System.out.println("In two-arg STRING-INT const.."+name);
    }
    public static void main(String[] args) {
        System.out.println("Main starts..");
        //default const
        A a1= new A();
        new A(); //this object do not have a refrence var, so this will get caught by Garbage Collector(GC) and destryed
        new A();

        A a2 = new A(10);
        A a3 = new A(10 , "Amit");
        A a4 = new A("Roselin", 100);
        System.out.println("Main ends..");
    }



}
