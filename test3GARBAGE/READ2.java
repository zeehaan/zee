package test3GARBAGE;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
public class READ2 {
    public static void main(String[] args) throws FileNotFoundException {
        LinkedList<String> arr=new LinkedList<String>();
        HashMap<String,Integer> hm=new HashMap<String,Integer>();

        String path = "C:\\Users\\M Zeeshan\\PART-LIST-WITH-ID.csv";
        String line = "";
            try {
                BufferedReader br = new BufferedReader(new FileReader(path));
                while (((line = br.readLine()) != null))
                {
//                    System.out.println( br.readLine().length());
                    if (((br.readLine().length()) == 127)  || ((br.readLine().length()) == 128) || ((br.readLine().length()) == 129) || ((br.readLine().length()) == 130)) {
                        String[] values = line.split(",");
//                    System.out.println(line);
//                    System.out.println(values[2]+"  "+values[3]);
//                       hm.put(values[2], Integer.valueOf(values[3]));
                        arr.add(values[2]);
                    }
                    else {
                        continue;
                    }
                }
                } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        for (int i = 0; i <arr.size() ; i++)
        {
            if(hm.containsKey(arr.get(i)))
            {
                hm.put(arr.get(i),hm.get(arr.get(i))+1) ;
            }
            else
            {
                hm.put(arr.get(i),1);
            }

        }
        System.out.println("PROFILE"+"                  "+"QUANTITY");
        for (Map.Entry entry:hm.entrySet()) {
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
    }

    }







