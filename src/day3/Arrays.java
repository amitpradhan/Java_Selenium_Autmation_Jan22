package day3;

public class Arrays {

    public static void main(String[] args) {
       int[] intArray = new int[5];
           intArray[0] = 11;
           intArray[1] = 22;
           intArray[2] = 33;
           intArray[3] = 444;
           intArray[4] = 5559;

        System.out.println("Third element in the array ->"+intArray[2]);

        System.out.println("Size of the array -> "+intArray.length);

        for(int i =0; i< intArray.length ;i++){
            System.out.println(i+ " element of the array-->"+intArray[i]);
//            System.out.println("\n Array Value is "+ i +"->"  +intArray[i]);
        }


    }
}
