package filehandling;

import java.io.FileWriter;
import java.io.IOException;

public class filewriter {
    public static void main(String[] args) throws IOException {
        FileWriter fw=new FileWriter(("abc.txt"));
       
        fw.write(26);
        fw.write("\n");
        fw.write("i m zee");
        fw.write("\n");
        char[] ch={'j','a','v','a'};
        fw.write(ch);
        fw.flush();
        fw.close();
    }
}
