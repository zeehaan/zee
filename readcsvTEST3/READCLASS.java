package readcsvTEST3;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
public class READCLASS {
    LinkedList<String> readfile() throws IOException {

        BufferedReader br=new BufferedReader(new FileReader("C:\\DummyDir\\PART-LIST-WITH-ID.csv"));
        LinkedList<String> arr=new LinkedList<String>();
        List<String> l=new LinkedList<String>();

        String line="";
        while((line=br.readLine())!=null){
            String[] value=line.split(",");
            arr.add(value[2]);
        }
        return arr;
    }

    void displaycompletefile() throws IOException {
        BufferedReader br=new BufferedReader(new FileReader("C:\\Users\\M Zeeshan\\PART-LIST-WITH-ID.csv"));
        String line="";
        while((line=br.readLine())!=null) {
            System.out.println(line);
        }
    }
    HashMap<String,Integer> modify() throws IOException {
       LinkedList<String> r2=readfile();
        HashMap<String,Integer> hm=new HashMap<String,Integer>();

        for (int i = 0; i < r2.size(); i++) {
            if (hm.containsKey(r2.get(i))) {
                hm.put(r2.get(i), hm.get(r2.get(i)) + 1);
            } else {
                hm.put(r2.get(i), 1);
            }

        }
        return hm;
    }
    void displayfile() throws IOException {
     HashMap hm1=modify();
HashMap<String,Integer> hm2=new HashMap<>();
                 hm2.putAll(hm1);
        System.out.println("PROFILE" +"                  "+"QUANTITIES");
        for (Map.Entry m:hm2.entrySet()) {
            System.out.println(m.getKey()+" "+m.getValue());

        }
    }
}
