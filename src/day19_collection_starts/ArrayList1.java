package day19_collection_starts;


import java.util.ArrayList;
import java.util.List;

public class ArrayList1 {

    public static void main(String[] args) {
        ArrayList<String> cities = new ArrayList<>();
            cities.add("Pune");
            cities.add("Mumbai");
            cities.add("London");
            cities.add("Manchester");

        //foreach loop
        for (String cityName:cities) {
            System.out.println(cityName);
        }
        
        


    }
}
