package test3GARBAGE;

import java.io.*;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;
public class read {
    public static void main(String[] args)  {
        LinkedList<String> s=new LinkedList<String>();
//        String path="C:\\Users\\M Zeeshan\\PART-LIST-WITH-ID.csv";
        String path="C:\\DummyDir\\PART-LIST-WITH-ID.csv";
        String line="";

        {
            try {
               BufferedReader br = new BufferedReader(new FileReader(path));
                while((line= br.readLine()) != null)
                {
//                    System.out.println(line);
                    String[] values=line.split(",");
//                    System.out.println(values[2]);
                    s.add(values[2]);

                   }
            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            }
            catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
//        for (String str:s) {
//            System.out.print(str);
//            System.out.println(" ");
//
//        }
//        System.out.println(s);
        for (int i = 0; i < s.size(); i++) {
            int count=0;
            for (int j = i+1; j < s.size(); j++) {
                if(s.get(i).equals(s.get(j))){
                    count++;
                    System.out.println(s.get(i));
                }
                System.out.println(s.get(i)+i);
            }
        }
    }
}
