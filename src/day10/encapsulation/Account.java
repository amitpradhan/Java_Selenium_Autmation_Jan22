package day10.encapsulation;

public class Account {
    private double balance = 1000;

    public double withdraw(double amount){
        return balance -= amount;
    }
    public double getBalance() {
        return balance;
    }
}

class TestAccount{
    public static void main(String[] args) {
        Account account = new Account();
        account.withdraw(100);
        System.out.println(account.getBalance());
    }
}
