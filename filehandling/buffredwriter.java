package filehandling;
import java.io.*;


public class buffredwriter {
    public static void main(String[] args) throws IOException {
       FileWriter fr=new FileWriter("C:\\DummyDir\\trail.txt");
       BufferedWriter br=new BufferedWriter(fr);
       br.write(23);
       br.newLine();
       br.write("zee");
       br.newLine();
       char[] ch={'j','a','v','a'};
       br.write(ch);
       br.write("I AM CLOSING THE SERVICE.....Thank you");
       br.write(ch);
       br.newLine();
       br.flush();
       br.close();
    }
}