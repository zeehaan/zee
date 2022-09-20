//package test3stream;
//
//import readcsvTEST3.sortbyprofile;
//
//import java.io.BufferedReader;
//import java.io.FileNotFoundException;
//import java.io.FileReader;
//import java.util.LinkedList;
//
//public enum  Gguid {
//    LinkedList<Person> hm4=new LinkedList<>();
//    String path="C:\\DummyDir\\PART-LIST-WITH-ID.csv";
//    String line="";
//    BufferedReader br;
//
//    {
//        try {
//            br = new BufferedReader(new FileReader(path));
//        } catch (FileNotFoundException e) {
//            throw new RuntimeException(e);
//        }
//    }
//            while((line= br.readLine()) != null)
//
//    {
//        String[] values = line.split(",");
//
//            Person ob = new Person(values[0], values[1], values[2], values[3], values[4], values[5], values[6]);
//            hm4.add(ob.getMark() + ob.getSerialno() + ob.getProfile() + ob.getQuantity() + ob.getName() + ob.getMaterial() + ob.getGuid());
//
//    }
//
//
//}
