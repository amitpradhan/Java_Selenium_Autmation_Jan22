package day10.encapsulation;

public class Encapsulation {
    /**
     * 1- make data or variable private
     * 2- access data through public methods
     *
     */

   private String name = "Amit";
   private int phoneNo = 121212;

    public String getName() {
        return name;
    }

    public int getPhoneNo() {
        return phoneNo;
    }
}


class TestEncapsulation{

    public static void main(String[] args) {
        Encapsulation encapsulationObject = new Encapsulation();
        System.out.println(encapsulationObject.getName());
        System.out.println(encapsulationObject.getPhoneNo());
    }
}

