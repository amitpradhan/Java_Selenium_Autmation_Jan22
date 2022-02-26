package day25;

import java.io.*;

public class Serialization_demo1 implements Serializable {
    /**
     * 1- Serialization is a mechanism to convert the state of an objec into a byte stream.
     * 2- De-Serialization is the reverse process i.e. byte stream is recreated to java objects
     * 3- Byte streams are platform independent. I.e. The Serialized objects can be created in one platform and
     *   can be de-Serialized in another platform.
     * 4- To serialize a java object we need to implement a marker interface java.io.Serializable
     *     (Marker interface - it doesn't have any data members or methods , they are only used to mark a class ,
     *  so that the class will get certain capability)
     *  5- ANY-ACCESS-MODIFIER static final long serialVersionUID = 42L;
     *     If a serializable class does not explicitly declare a serialVersionUID, then the serialization
     *     runtime will calculate a default serialVersionUID value for that class based on various aspects of the class
     *
     */

    //instance
    int a;
    int b;
    String name;

    public Serialization_demo1(int a , int b, String name){
        this.a = a;
        this.b = b;
        this.name = name;
    }

    public static void main(String[] args)  {
        Serialization_demo1 obj1 = new Serialization_demo1(100, 200, "Nibedita");
        String filename = System.getProperty("user.dir")+"\\src\\day25\\Serialization_demo1.ser";

        //Serialization
        try {

            FileOutputStream fileOutputStream = new FileOutputStream(filename);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(obj1);

            objectOutputStream.close();
            fileOutputStream.close();

            System.out.println("Object has been serialized.");

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        //De-serialization
        Serialization_demo1 obj2 = null;
        try {
            FileInputStream fileInputStream = new FileInputStream(filename);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

           obj2 =(Serialization_demo1) objectInputStream.readObject();

            fileInputStream.close();
            objectInputStream.close();

            System.out.println("Object has been de-serialized.");
            System.out.println("a = "+obj2.a);
            System.out.println("b = "+obj2.b);
            System.out.println("name = "+obj2.name);


        }  catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
