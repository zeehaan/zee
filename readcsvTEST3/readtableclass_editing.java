package readcsvTEST3;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;

public class readtableclass_editing {
    ArrayList<String> tset() throws IOException {
        fileobjectc ob = null;
        HashMap<String,String> hm1=new HashMap<String,String>();
        ArrayList<String> ll=new ArrayList<>();
        String path="C:\\DummyDir\\PART-LIST-WITH-ID.csv";
        String line="";
            BufferedReader br = new BufferedReader(new FileReader(path));
            while((line= br.readLine()) != null)
            {
                String[] values=line.split(",");
                     ob=new fileobjectc(values[0],values[1],values[2],values[3],values[4],values[5],values[6]);
                   ll.add(ob.mark+" "+ob.profile+""+ob.guid+""+ob.name);
                   hm1.put(ob.mark,ob.profile+ob.material+ob.name+ob.quantity);
            }
     return ll;
    }
    void readtablePNGM() throws IOException {
        ArrayList<String> ll2=tset();
        System.out.println("Profile"+"                  "+"Name"+"                     "+"Grade"+"           "+"Mark");
        System.out.println("-----------------------------------------------------------------------------------------");
        for (String s:ll2) {
            System.out.println(s);
        }
    }
}
