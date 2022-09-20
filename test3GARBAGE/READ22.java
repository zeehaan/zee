package test3GARBAGE;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class READ22 {
    public static void main(String[] args) throws FileNotFoundException {
        Set<String> s = new HashSet<String>();
        String path = "C:\\Users\\M Zeeshan\\PART-LIST-WITH-ID.csv";
        String line = "";
        int count=0;

        {
            try {
                BufferedReader br = new BufferedReader(new FileReader(path));
                while ( ((line=br.readLine())!=null) ) {
                    if((br.readLine().length()==128) || (br.readLine().length()==129) || (br.readLine().length()==130)){
                        String[] values = line.split(",");
//                    System.out.println(line);
                        System.out.println(values[2]+"  "+values[3]);



//                    s.add(values[2]);
//                        System.out.println(values[2]);
                    }
                    else{
                        continue;
                    }
//                    for (String str : s) {
//                        System.out.print(str);
//                        System.out.println(" ");
//                    }
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        for (String sr:s) {
            System.out.print(sr+" ");
            System.out.println(" ");
        }
//        System.out.println(count);
    }
//      Set<String> getset() {
//        Set<String> s ;
//        return s;
//    }
}
