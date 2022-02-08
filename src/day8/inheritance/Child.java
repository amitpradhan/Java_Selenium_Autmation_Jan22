package day8.inheritance;

public class Child extends Parent{

    public static void main(String[] args) {
        Child childObject = new Child();

        Class childClass = childObject.getClass();
        Class parentClass = childClass.getSuperclass();

        System.out.println("Class of child object ->"+childClass);
        System.out.println("Super class or parent  of Child class is ->"+ parentClass);
        System.out.println("Grand parent of Child class is -> "+parentClass.getSuperclass());



    }


}
