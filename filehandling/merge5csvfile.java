package filehandling;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
public class merge5csvfile {
    public static void main(String[] args) throws IOException {
        PrintWriter pw=new PrintWriter(("C:\\DummyDir\\test4\\RESULTANT-FILE.csv"));
        BufferedReader br=new BufferedReader(new FileReader("C:\\DummyDir\\test4\\A05 - ASSEMBLY-PART-LIST.csv"));
        String line=br.readLine();
        int linecount=0;
        while(line!=null){
            if(linecount==15){
                System.out.println(line);
            }
            pw.println(line);
            line=br.readLine();
            linecount++;
        }
        br=new BufferedReader(new FileReader("C:\\DummyDir\\test4\\P02 - PART-LIST-WITH-ID WEIGHT.csv"));
        line=br.readLine();
        while(line!=null){
            pw.println(line);
            line=br.readLine();
        }
        br=new BufferedReader(new FileReader("C:\\DummyDir\\test4\\A13 - ASSEMBLY-PART-LIST-WITH-BOLT.csv"));
        line=br.readLine();
        while(line!=null){
            pw.println(line);
            line=br.readLine();
        }
        br=new BufferedReader(new FileReader("C:\\DummyDir\\test4\\B01 ASSEMBLY- BOLT-SUMMARY.csv"));
        line=br.readLine();
        while(line!=null){
            pw.println(line);
            line=br.readLine();
        }
        br=new BufferedReader(new FileReader("C:\\DummyDir\\test4\\I01 - ID-LOCATION-LIST WITH WEIGHT.csv"));
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
