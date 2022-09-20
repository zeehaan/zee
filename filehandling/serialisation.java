package filehandling;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class serialisation {
    public static void main(String[] args) throws IOException {
        dog d=new dog();
        File f=new File("pqr.txt");
        f.createNewFile();
        FileOutputStream fs=new FileOutputStream("pqr.txt");
        ObjectOutputStream ob=new ObjectOutputStream(fs);
        ob.writeObject(d);
    }
}
