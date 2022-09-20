package filehandling;
import java.io.*;
public class merging_copyoffiles {
    public static void main(String[] args) throws IOException {
        FileInputStream f1 = new FileInputStream("C:\\DummyDir\\Copy of csv-1 - csv-1.csv");
        FileInputStream f2 = new FileInputStream("C:\\DummyDir\\csv-2 - csv-2.csv");
        FileOutputStream f3 = new FileOutputStream("C:\\DummyDir\\copyof3.csv");
        SequenceInputStream sinput = new SequenceInputStream(f1, f2);
       int k = 0;
        while ((k = sinput.read()) != -1) {
            f3.write(k);
        }
        f1.close();
        f2.close();
        f3.close();
        sinput.close();
    }
}

