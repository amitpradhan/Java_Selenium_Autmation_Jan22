package day10;

public class NoOfObjects {
    public static  int count = 0;

    public NoOfObjects(){
        count++;
    }


}

class TestNoOfObjects{
    public static void main(String[] args) {
        new NoOfObjects();
        new NoOfObjects();
        new NoOfObjects();
        new NoOfObjects();


        System.out.println("No of objects created ->"+NoOfObjects.count);
    }
}
