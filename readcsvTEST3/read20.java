package readcsvTEST3;
import java.io.*;
import java.util.*;
public class read20 {
    public static void main(String[] args)  {
        int l=0;
//        String[] a = null;
        Set<String> hm1=new HashSet<String>();
        LinkedList<String> arr=new LinkedList<String>();
        HashMap<String,Integer> hm=new HashMap<String,Integer>();
//        TreeSet<String> hm1=new TreeSet<>();
//        String path="C:\\Users\\M Zeeshan\\PART-LIST-WITH-ID.csv";
        String path="C:\\Users\\M Zeeshan\\PART-LIST-WITH-ID.csv";
        String line="";

            try {
                BufferedReader br = new BufferedReader(new FileReader(path));
                while((line= br.readLine()) != null)
                {
                    String[] values=line.split(" ");
//                    System.out.println(line);
                    if(line.length()==127||line.length()==128||line.length()==129||line.length()==130){
//                        System.out.println(line);
                        System.out.println(l);
                        l++;
                        hm1.add(values[2]);
                    }

                }
            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            }
            catch (IOException e) {
                throw new RuntimeException(e);
            }
//      for (String m: hm.keySet()) {
//          if(l.nextIndex()){
//              System.out.println(l);
//          }
//            System.out.println("Profile is :"+m.getKey()+"Quantity :"+m.getValue());
//        while(ltr.hasNext()){
//            for (int i = 0; i < hm.size(); i++) {
//                for(int j=0;j<hm1.size();j++)
//                {
//                }
//            }
//            }
//        for (int i = 0; i < hm.size(); i++) {
//            {
//                int count=1;
//                for (int j = i+1; j <hm.size() ; j++) {
//                    {
//                        if(hm.get(i)==hm.get(j)){
//                            count++;}
//                            else {
//                            break;
//                        }
//                            if(count>1){
//                                System.out.println(hm.get(i)+"-->"+count);
//                                i+=(count-1);
//                            }
//
//                        }
//                    }
//                }
//        }
//        System.out.println(hm);
//        System.out.println(hm.size());

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
//        System.out.println("PROFILE"+"                  "+"QUANTITY");
//        for (Map.Entry entry:hm.entrySet()) {
//            System.out.println(entry.getKey()+" "+entry.getValue());
//        }
        System.out.println(hm1);
    }
    }
    //if(hm.keys().equals(hm1.keys())){
//          System.out.println(hm1);
          //if()
//      }

//        System.out.println(hm.size());

//    }

