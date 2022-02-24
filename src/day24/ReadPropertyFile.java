package day24;

import java.io.*;
import java.util.Properties;

public class ReadPropertyFile {

    public static void main(String[] args) {
        String propFileName=System.getProperty("user.dir")+"\\src\\day24\\demo.properties";
        System.out.println(getProperty(propFileName,"appUrl"));
        System.out.println(getProperty(propFileName,"env"));
        System.out.println(getProperty(propFileName,"port"));

    }

    public static String getProperty(String propFile, String propertyKey)  {
        FileReader fileReader = null;
        String propValue= null;
        try {
            fileReader = new FileReader(propFile);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            //create properties object
            Properties properties = new Properties();
            properties.load(bufferedReader);
            propValue= properties.getProperty(propertyKey);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return propValue;
    }

}
