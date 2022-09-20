package filehandling;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.SequenceInputStream;
import java.io.*;
public class Merging_csvfiles {
    public static void main(String[] args) throws IOException {
        FileInputStream f1=new FileInputStream("C:\\DummyDir\\csv-1.csv");
        FileInputStream f2=new FileInputStream("C:\\DummyDir\\csv-2.csv");
        FileOutputStream fout=new FileOutputStream("C:\\DummyDir\\csv-3.csv");
        SequenceInputStream comb=new SequenceInputStream(f1,f2);
        int j=0;
        while((j=comb.read())!=-1){
            fout.write(j);

        }

        System.out.println(j);
        comb.close();
        f1.close();
        f2.close();
        fout.close();
        System.out.println(j);
    }
}
