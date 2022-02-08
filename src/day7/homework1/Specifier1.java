package day7.homework1;



public class Specifier1 {

    protected int team = 11;
    public int team1 = 22;
               int team2 = 33;
    private int team3 = 33;


    protected void inter() {
        System.out.println("This is a protected method in different class in different package");

    }

    private  void acMilan(){

        System.out.println("This is a private method in different class in dfferent package");
    }

    void juventus(){

        System.out.println("This is a default method in different class in different package");

    }


    public void roma(){

        System.out.println("This is public method in different class in different package");
    }
}

