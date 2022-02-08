package day10.encapsulation;

public class Improper_Encapsulation {
    public double balance = 1000;

    public double withdraw(double amount){
        return balance -= amount;
    }
    //getter
    public double getBalance() {
        return balance;
    }
}

class Test_Improper_Encapsulation{
    public static void main(String[] args) {
        Improper_Encapsulation improper_encapsulation = new Improper_Encapsulation();
        System.out.println("Balance before withdrawl ->"+improper_encapsulation.getBalance());
        improper_encapsulation.withdraw(100);
        System.out.println("Balance after withdrawl ->"+improper_encapsulation.getBalance());
        improper_encapsulation.balance = 1000;
        System.out.println("Balance after withdrawl ->"+improper_encapsulation.getBalance());

    }
}