package filehandling;

import java.io.File;
import java.io.IOException;

public class filecreation {
    public static void main(String[] args) throws IOException {
        File fw=new File("abc.txt");
        System.out.println(fw.exists());
        fw.createNewFile();
        System.out.println(fw.exists());


    }
}
