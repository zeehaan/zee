package test5_Grouptable;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;
public class groupclass3 {
    public List<objectfile3> readfile() throws IOException {
       List<objectfile3> ll = new LinkedList<objectfile3>();
       String path = "C:\\DummyDir\\P02.csv";
       String line = "";
       BufferedReader br = new BufferedReader(new FileReader(path));
       while ((line = br.readLine()) != null) {
           String[] values = line.split(",");
           objectfile3 ob = new objectfile3(values[0], values[1], values[2], values[3], values[4], values[5], values[6], values[7], values[8], values[9]);
           objectfile3 ob1 = new objectfile3(ob.serialno, ob.mark, ob.profile, ob.qty, ob.name, ob.material, ob.modelID, ob.unitwgt, ob.assembly, ob.guid);
           ll.add(ob1);
       }
       List<objectfile3> tab1 = ll.stream().sorted(Comparator.comparing(objectfile3::getAssembly)).toList();
       System.out.println(tab1);
//       tab1.stream().sorted(Comparator.comparing(objectfile3::getAssembly));
//        System.out.println(tab1);
//        Map<String, List<objectfile>> profile1 = tab1.stream().collect(Collectors.groupingBy(objectfile::getAssembly));
//        System.out.println(profile1);
//        Map<String, List<objectfile>> profile2 = tab1.stream().collect(Collectors.groupingBy(objectfile::getAssembly));
        Map<String, List<objectfile3>> profile = tab1.stream().collect(Collectors.groupingBy(objectfile3::getAssembly));
        System.out.println(profile);
        //sorted values..

        return ll;
    }
    Object makingkey( List<objectfile3> sortedvalue){
        List<objectfile3> value = sortedvalue;
        ArrayList<String> arr=new ArrayList<>();

//        for (  List<objectfile>  :
//             ) {
//
//        }

        return value;
    }
}
