package day23;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapOfList {

    public static void main(String[] args) {
        List<String> cities = new ArrayList<>();
        cities.add("Pune");
        cities.add("Mumbai");
        cities.add("Delhi");
        cities.add("London");

        List<String> states = new ArrayList<>();
        states.add("Maharashtra");
        states.add("Tamil Nadu");
        states.add("Kerala");

        Map<String,List<String>> listMap=  new HashMap<>();
        listMap.put("cityNames", cities);
        listMap.put("stateName", states);

        System.out.println(listMap.get("cityNames"));
        System.out.println(listMap.get("stateName"));
        System.out.println(listMap.get("stateName").get(2));


        for (String city :listMap.get("cityNames")) {
            System.out.println(city);
        }




    }
}
