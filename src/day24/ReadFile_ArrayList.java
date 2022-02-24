package day24;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadFile_ArrayList {


    public static void main(String[] args) {

        File file = new File(System.getProperty("user.dir")+"\\src\\day24\\ArrayList.txt");

        //create file
        try {
            if(file.exists())
                file.delete();
            file.createNewFile();

            //write
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            bufferedWriter.write("Hi , this is my first line.");
            bufferedWriter.newLine();
            bufferedWriter.write("Hi , this is my second line.");
            bufferedWriter.newLine();
            bufferedWriter.write("Hi , this is my third line.");
            bufferedWriter.newLine();
            bufferedWriter.write("Hi , this is my fourth line.");
            bufferedWriter.newLine();
            bufferedWriter.write("Hi , this is my fifth line.");
            bufferedWriter.newLine();
            bufferedWriter.write("Hi , this is my sixth line.");
            bufferedWriter.newLine();
            bufferedWriter.write("Hi , this is my seventh line.");
            bufferedWriter.newLine();
            bufferedWriter.write("Hi , this is my eighth line.");
            bufferedWriter.newLine();
            bufferedWriter.write("Hi , this is my ninth line.");
            bufferedWriter.newLine();
            bufferedWriter.write("Hi , this is my tenth line.");
            bufferedWriter.newLine();
            bufferedWriter.write("Hi , this is my 11th line.");
            bufferedWriter.newLine();
            bufferedWriter.write("Hi , this is my last line.");

            bufferedWriter.close();
            fileWriter.close();

            //read
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            List<String> myList = new ArrayList<>();
            String str = null;
            while ((str = bufferedReader.readLine())!=null){
//                System.out.println(str);
                //added each line into the list
                myList.add(str);
            }
            System.out.println("***********************************");
//            System.out.println("Size of the list ->"+myList.size());
//            System.out.println(myList);

//            for (String line:myList) {
//                System.out.println(line);
//            }

            for (int i = myList.size()-1; i>= myList.size()-6; i--){
                System.out.println(myList.get(i));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
