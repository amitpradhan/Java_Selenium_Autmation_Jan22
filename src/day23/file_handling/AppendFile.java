package day23.file_handling;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class AppendFile {
    public static void main(String[] args) {
        File file= new File(System.getProperty("user.dir")+"\\src\\day23\\file_handling\\myfile_append.txt");


        try {
            file.createNewFile();
            FileWriter fileWriter = new FileWriter(file,true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write("Third line");
            bufferedWriter.newLine();
            bufferedWriter.close();
            fileWriter.close();
            System.out.println("File added successfully.");

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
