package readcsvTEST3;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.security.KeyStore;
import java.util.*;
public class readtableclass_final {
    HashMap<String,String> getguid() throws IOException {
        HashMap<String,String> hm1=new HashMap<String,String>();
        LinkedList<fileobjectc> ll=new LinkedList<fileobjectc>();
        String path="C:\\DummyDir\\PART-LIST-WITH-ID.csv";
        String line="";
            BufferedReader br = new BufferedReader(new FileReader(path));
            while((line= br.readLine()) != null)
            {
                String[] values=line.split(",");
                {
                    fileobjectc ob=new fileobjectc(values[0],values[1],values[2],values[3],values[4],values[5],values[6]);
//                    System.out.println(ob.mark+ob.profile);
                    ll.add(ob);

                    String a="SL NO: "+values[0]+"Mark ="+values[1]+"Profile ="+values[2]+"Quantity = "+values[3]+"   "+"Name = "+values[4]+"Material= "+values[5];
                    hm1.put(values[6],a);
//                    System.out.println(ll.stream().findAny());
                }
            }
        return hm1;
    }
    void gettingguid(String key) throws IOException {
        HashMap<String,String> hm2= getguid() ;
        System.out.println(hm2.get(key));
    }
//    class fileobject{
//        public fileobject(String serialno, String name, String mark, String quantity, String profile, String guid, String material) {
//            this.serialno = serialno;
//            this.name = name;
//            this.mark = mark;
//            this.quantity = quantity;
//            this.profile = profile;
//            this.guid = guid;
//            this.material = material;
//        }
//
//        String serialno;
//        String name;
//        String mark;
//        String quantity;
//        String profile;
//        String guid;
//        String material;
//
//
//
//    }
}