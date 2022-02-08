package day19_collection_starts;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayList2 {
    public static void main(String[] args) {
        //loosely-coupled approach
        //dynamic dispatching or run-time polymorphism
        List<Integer> phoneNo = new ArrayList<>(5);
//                      phoneNo = new LinkedList<>();

        System.out.println("Before any element is added : "+phoneNo.size());
        phoneNo.add(12345);
        phoneNo.add(123456);
        phoneNo.add(1234566);
        phoneNo.add(1234566);
        phoneNo.add(1234566);
        phoneNo.add(123456634);
        System.out.println("After an element is added :"+phoneNo.size());

        for (int i = 0; i<phoneNo.size();i++){
            if(phoneNo.get(i) >= 1234566)
                System.out.println(phoneNo.get(i));
        }

    }
}
