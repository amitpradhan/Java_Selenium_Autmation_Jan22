package day5;

public class Laptop {
    double weight ;
    int ramSize;
    String brand;

    public void startUp(String laptopName){
        System.out.println(laptopName + " starting.");
    }

    public void shutDown(String laptopName){
        System.out.println(laptopName + " shutting down.");
    }

    public static void main(String[] args) {
        Laptop hp = new Laptop();
        hp.brand = "HP";
        hp.ramSize = 512;
        hp.weight = 1000;

        Laptop dell = new Laptop();
        dell.weight = 1200;
        dell.ramSize = 512;
        dell.brand = "Dell";

        System.out.println(hp.brand + "--"+hp.ramSize+ "--"+hp.weight);
        System.out.println(dell.brand + "--"+dell.ramSize+ "--"+dell.weight);

        hp.startUp("HP");
        dell.shutDown("Dell Inspirion");
    }

}
