package day23.file_handling;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {
    public static void main(String[] args) {
        File file= new File(System.getProperty("user.dir")+"\\src\\day23\\file_handling\\myfile.txt");
        if (file.exists())
            file.delete();
        try {
            file.createNewFile();
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            bufferedWriter.write("HI, first statement.");
            bufferedWriter.newLine();
            bufferedWriter.write("HI, Second statement.");
            bufferedWriter.newLine();
            bufferedWriter.write("HI, third statement.");

            bufferedWriter.close();
            fileWriter.close();
        }catch (IOException ioException){
            System.out.println("Invalid file path.");
        }


    }
}
