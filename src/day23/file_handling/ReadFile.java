package day23.file_handling;

import java.io.*;

public class ReadFile {
    public static void main(String[] args) {
        File file = new File(System.getProperty("user.dir")+"\\src\\day23\\file_handling\\read_file.txt");
        try{
            //created a file
            file.createNewFile();

            //write into a file
            FileWriter fileWriter= new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write("Hi , this is a new file.");
            bufferedWriter.newLine();
            bufferedWriter.write("My second line..");
            bufferedWriter.newLine();
            bufferedWriter.write("Last line");
            bufferedWriter.close();
            fileWriter.close();

            //read file
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            System.out.println(bufferedReader.read());
            System.out.println(bufferedReader.readLine());

            bufferedReader.close();
            fileReader.close();


        }catch (IOException ioException){
            System.out.println("Invalid file path.");
        }catch (NullPointerException nullPointerException
        ){
            System.out.println("NullPointerException catch block");
        }
    }
}
