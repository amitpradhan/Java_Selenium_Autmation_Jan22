package day25;

import java.io.*;

public class Serialization_Demo2 implements Serializable {
    public static final long serialVersionUID = 42444L;
    int pin_code;
    String name;
    static int x;
    /**
     * The transient keyword in Java is used to avoid serialization.
     * If any object of a data structure is defined as a transient , then it will not be serialized.
     */
    transient int y;

    public Serialization_Demo2(int pin_code, String name,int x, int y) {

        this.pin_code = pin_code;
        this.name = name;
        this.x = x;
        this.y = y;
    }



    public static void main(String[] args) {
        Serialization_Demo2 obj1 = new Serialization_Demo2(1234, "Himanshu", 11,22);
        String filename = System.getProperty("user.dir")+"\\src\\day25\\Serialization_demo2.txt";

      //Serialization
        try {

            FileOutputStream fileOutputStream = new FileOutputStream(filename);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(obj1);

            objectOutputStream.close();
            fileOutputStream.close();

            System.out.println("Object has been serialized.");

            obj1.x = 3000;

    } catch (IOException e) {
            e.printStackTrace();
        }

        //De-serialization
        Serialization_Demo2 obj2 = null;
        try {
            FileInputStream fileInputStream = new FileInputStream(filename);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

            obj2 =(Serialization_Demo2) objectInputStream.readObject();

            fileInputStream.close();
            objectInputStream.close();



            System.out.println("Object has been de-serialized.");
            System.out.println("x = "+obj2.x);
            System.out.println("y = "+obj2.y);
            System.out.println("name = "+obj2.name);
            System.out.println("pincode = "+obj2.pin_code);


        }  catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }


    }

}
