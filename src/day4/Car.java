package day4;

public class Car {
    //variables - properties
    int noOfWheel = 4;

    public static void main(String[] args) {
        Car maruti = new Car();
        Car tata = new Car();
        maruti.start("Maruti Alto");
        maruti.stop("Maruti wagonR");
        tata.start("Nexon");
        tata.start("Indica");
        System.out.println(tata.noOfWheel);

        run("tata nexon");
    }

    //methods - behaviour
    public void start(String carName){
        System.out.println(carName + " starting.");
    }

    public void stop(String carName){
        System.out.println(carName + " stopping.");
    }

    public static void run(String carName){
        System.out.println(carName + " running.");
    }

}
