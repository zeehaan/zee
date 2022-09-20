package readcsvTEST3;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
public class sortbyprofile {
    LinkedList<String> name(){
        LinkedList<String> hm2=new LinkedList<>();
        String path="C:\\DummyDir\\PART-LIST-WITH-ID.csv";
        String line="";
        try {
            BufferedReader br = new BufferedReader(new FileReader(path));
            while((line= br.readLine()) != null)
            {
                String[] values=line.split(",");
                fileobject  ob=new fileobject(values[0],values[1],values[2],values[3],values[4],values[5],values[6]);
                hm2.add(ob.name+ob.serialno+ob.mark+ob.profile+ob.quantity+ob.material+ob.modelid );
            }
        }
        catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }
        Collections.sort(hm2);
        for (String s:hm2) {
            System.out.println(s);
        }
        return hm2;
    }
    LinkedList<String> mark() throws IOException {
        LinkedList<String> hm3=new LinkedList<>();
        String path="C:\\DummyDir\\PART-LIST-WITH-ID.csv";
        String line="";
            BufferedReader br = new BufferedReader(new FileReader(path));
            while((line= br.readLine()) != null)
            {
                String[] values=line.split(",");
                {
                   fileobject ob=new fileobject(values[0],values[1],values[2],values[3],values[4],values[5],values[6]);
                    hm3.add(ob.mark+ob.serialno+ob.profile+ob.quantity+ob.name+ob.material+ob.modelid);
                }
            }
        Collections.sort(hm3);
        for (String s:hm3) {
            System.out.println(s);
        }
        return hm3;
    }
    void NPM() throws IOException {
       LinkedList<String> n=name();

    }
    class fileobject {
        public fileobject(String serialno, String mark, String profile, String quantity, String name, String material, String modelid) {
            this.serialno = serialno;
            this.mark = mark;
            this.profile = profile;
            this.quantity = quantity;
            this.name = name;
            this.material = material;
            this.modelid = modelid;
        }

        String serialno;
        String mark;
        String profile;
        String quantity;
        String name;
        String material;

        String modelid;


    }
}



