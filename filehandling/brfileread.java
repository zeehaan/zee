package filehandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class brfileread {
    public static void main(String[] args) throws IOException {
        PrintWriter pw=new PrintWriter(("C:\\DummyDir\\bufferfile3.txt"));
        BufferedReader br=new BufferedReader(new FileReader("C:\\DummyDir\\bufferfile1.txt"));
        String line=br.readLine();
        while(line!=null){
            pw.println(line);
            line=br.readLine();
        }
       br=new BufferedReader(new FileReader("C:\\DummyDir\\bufferfile2.txt"));
        line=br.readLine();
        while(line!=null){
            pw.println(line);
            line=br.readLine();
        }
        pw.flush();
        br.close();
        pw.close();
    }
}
