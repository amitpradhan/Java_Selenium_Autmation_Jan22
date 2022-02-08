package day3;

public class ObjectArray {

    /**
     * Class Object is the root of the class hierarchy. Every class has Object as a superclass.
     * All objects, including arrays, implement the methods of this class.
     * @param args
     */
    public static void main(String[] args) {
        //array creation
        Object[] objectArray = new Object[5];

        //assigning values
            objectArray[0] = "Java is easy.";
            objectArray[1] = 100;
            objectArray[2] = 12.44d;
            objectArray[3] = false;
            objectArray[4] = 'a';


         //iterating through the array..
        for (int i =0;i<objectArray.length;i++)
            System.out.println(objectArray[i]);

    }
}
