package day23.file_handling;

import java.io.File;
import java.io.IOException;

public class CreateFile {

    public static void main(String[] args)  {
        File file = new File("myFile.txt");
        System.out.println(System.getProperty("user.dir"));
        file = new File(System.getProperty("user.dir")+"\\src\\day234\\file_handling\\myfile2.txt");
        try {
            if(file.exists())
                file.delete();
            file.createNewFile();
            System.out.println(file.getAbsoluteFile());
            System.out.println(file.getName());
        }catch (IOException ioException){
            System.out.println("In catch block..Invalid file path");
        }
    }
}
