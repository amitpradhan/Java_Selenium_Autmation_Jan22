package day5;

import day4.Car;

public class Animal {
    /**
     * 1- class is a blueprint/template to create objects
     * 2- class is a logical entity
     * 3- class can contain variables (properties) , methods(behavior) , static and non-static blocks,
     *    constructors.
     * 4- In one .java file , we can have ONLY one public class and may or may not have multiple non-public
     *    class.
     */
    //properties can be represented by variable
    String color; //default -> null
    int legs; //default -> 0
    double weight; //default -> 0.0
    int ear; //default -> 0
    int tail;//default -> 0

    //behavior can be represented by methods
    public void sleep(String name){
        System.out.println(name + " sleeping.");
    }
    public void eat(String name){
        System.out.println(name + " eating.");
    }
    public void run(String name){
        System.out.println(name + " running.");
    }

    //non-static block gets executed everytime an object is created
    {  System.out.println("In non-static block");}

    //static blocks will get executed once at the beginning
    static { System.out.println("In static block");}


    public static void main(String[] args) {
        /**
         * 1- Objects are instance of a class
         * 2- Object is physical representaion of a class i.e. it occupies memory
         * 3- We can create n no of objects of  class.
         * 4- There are ways to restrict the no of object creation. E.g. Singleton class which restricts
         *      to create only one object.
         *  5- new keyword allocates memory for the object
         *  6- Constructor - special method which doesn't have any return type ,
         *       will initialize the instance variables for the object
         */

        int i = 10;
        Animal dog = new Animal();
        dog.ear =2;
        dog.color = "Black";
        dog.legs = 4;
        dog.weight = 10;

        Animal tiger = new Animal();
        tiger.weight = 100;
        tiger.ear = 2;
        tiger.color = "Green";
        tiger.legs = 4;

        System.out.println("Dog object->"+ dog.color+ " --"+dog.ear+ "--"+dog.legs+"--"+dog.weight);
        System.out.println("Tiger Object->"+tiger.color+ " --"+tiger.ear+ "--"+tiger.legs+"--"+tiger.weight);

        dog.eat("Dog");
        tiger.eat("Tiger");

        Animal lion = new Animal();
        System.out.println(lion.ear);
//        lion.ear =2;


    }


}

 class Test{

}


