package day21.map;

import java.util.HashMap;
import java.util.Map;

public class Map2 {

    public static void main(String[] args) {
        Map<String , String> automationFramework = new HashMap<>();
        automationFramework.put("language", "Java");
        automationFramework.put("testing library", "Selenium");
        automationFramework.put("BDD", "Cucumber");
        automationFramework.put("Unit testing tool", "TestNG");
        automationFramework.put("testing library", "RestAssured");
        automationFramework.put("testing library2", "RestAssured");

        System.out.println(automationFramework.size());
        System.out.println(automationFramework.get("testing library2"));

//map of map
//map of list/set
//file handling
//data from a file and store in a java object

}}
