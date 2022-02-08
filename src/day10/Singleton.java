package day10;

public class Singleton {
    /**
     * Singleton design pattern - allowed to create only one instance of the class
     */

    //1- make default constructor private
    private Singleton(){
        System.out.println("Inside Private constructor");
    }

    //2- create a static ref var of the class
    private static Singleton singletonInstance = null;

    //3- create public method to create instance
    public static Singleton getSingletonInstance(){
        if(singletonInstance == null)
            singletonInstance = new Singleton();
        return singletonInstance;
    }



}

class TestSingleton{
    public static void main(String[] args) {
        Singleton instance1 = Singleton.getSingletonInstance();
        Singleton instance2 = Singleton.getSingletonInstance();
        Singleton instance3 = Singleton.getSingletonInstance();
        Singleton instance4 = Singleton.getSingletonInstance();

        System.out.println("Hashcode of instance1 ->"+instance1.hashCode());
        System.out.println("Hashcode of instance2 ->"+instance2.hashCode());
        System.out.println("Hashcode of instance3 ->"+instance3.hashCode());
        System.out.println("Hashcode of instance4 ->"+instance4.hashCode());

    }
}
