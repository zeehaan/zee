package filehandling;
import java.io.File;
import java.io.FileReader;

public class filereader {
    public static void main(String[] args) throws Throwable {
        File f=new File("abc.txt");
       FileReader fr=new FileReader(f);
        for (int i = 0; i <f.length() ; i++) {
            System.out.println((char)fr.read());
        }
        fr.close();
    }
}
