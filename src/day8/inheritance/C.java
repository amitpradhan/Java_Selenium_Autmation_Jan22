package day8.inheritance;

public class C extends B{


    int k = 30;   /**
     * 1 - class can be inherited using extends keyword
     * 2. Multiple inheritance is NOT allowed in JAVA
     * 3- CHild class may have more stuff/capabilities or properties than parent class
     * 4- When a class inherits another class , the non-private members of parent will automatically be available in Child class
     * 5- Vice-versa (CHild to parent) is not true
     * 6- Object class from java.lang package is the root class or default super class of all the classes
     */
        public void m3(){
            System.out.println("In C-M3()");
        }
    public static void main(String[] args) {
        C c = new C();
        c.m1();
        c.m2();
        c.m3();
        System.out.println(c.i);
    }
}
