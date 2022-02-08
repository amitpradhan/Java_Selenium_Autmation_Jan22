package day21.map;

import java.util.*;

public class Map1 {
    public static void main(String[] args) {
        Map<String , String> automationFramework = new HashMap<>();
        automationFramework.put("language", "Java");
        automationFramework.put("testing library", "Selenium");
        automationFramework.put("BDD", "Cucumber");
        automationFramework.put("Unit testing tool", "TestNG");
        automationFramework.put("framework", "Hybrid");
        automationFramework.put("build tool", "Maven");
        automationFramework.put("CI tool", "Jenkins");
        automationFramework.put("repo", "GIT");
        automationFramework.put("report", "extent");
        automationFramework.put("log", "log4J");

        System.out.println(automationFramework.get("language"));

        System.out.println(automationFramework.entrySet());

        Set<String> keys = automationFramework.keySet();
        System.out.println(keys);

        Collection<String> values = automationFramework.values();
        System.out.println(values);

        System.out.println();
        System.out.println("Using foreach loop");


        for (String key:keys) {
            System.out.println(automationFramework.get(key));

        }

    }
}
