package day21;

public class Animal {
    int legs;
    double weight;

    public void run(String animalName){
        System.out.println(animalName + " running.");
    }
}

class Dog extends Animal{
    public Dog(String name){
        System.out.println("Dog-one-arg const");
    }

    public void bark(){
        System.out.println("Dog barking..");
    }
}

class Cat extends Animal{
    public Cat(String name){
        System.out.println("Cat-one-arg const");
    }

    public void sleep(){
        System.out.println("Cat Sleeping..");
    }
}
