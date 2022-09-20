//package readcsvTEST3;
//import java.io.BufferedReader;
//import java.io.FileNotFoundException;
//import java.io.FileReader;
//import java.io.IOException;
//import java.util.*;
//public class fourthansclas {
//    public HashMap<String, Integer> hm() throws IOException {
//        BufferedReader br = new BufferedReader(new FileReader("C:\\DummyDir\\PART-LIST-WITH-ID.csv"));
//        LinkedList<String> arr = new LinkedList<String>();
//        String line = "";
//        while ((line = br.readLine()) != null) {
//            String[] value = line.split(",");
//            arr.add(value[2]);
//        }
//        HashMap<String, Integer> k1v1 = new HashMap<String, Integer>();
//        for (int i = 0; i < arr.size(); i++) {
//            if (k1v1.containsKey(arr.get(i))) {
//                k1v1.put(arr.get(i), k1v1.get(arr.get(i)) + 1);
//            } else {
//                k1v1.put(arr.get(i), 1);
//            }
//        }
////       System.out.println(k1v1);
//        return k1v1;
//    }
//
//    public ArrayList<String> hm2() {
//        ArrayList<String> hm3 = new ArrayList<>();
//        String path = "C:\\DummyDir\\PART-LIST-WITH-ID.csv";
//        String line = "";
//        try {
//            BufferedReader br = new BufferedReader(new FileReader(path));
//            while ((line = br.readLine()) != null) {
//                String[] values = line.split(",");
//                {
//                    fourthansclas1 ob = new fourthansclas1(values[0], values[1], values[2], values[3], values[4], values[5], values[6]);
//                    hm3.add(ob.mark + ob.serialno + ob.profile + ob.quantity + ob.name + ob.material + ob.modelid);
//
//                }
//            }
//        } catch (FileNotFoundException e) {
//            throw new RuntimeException(e);
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//        Collections.sort(hm3);
//        return hm3;
//    }
//
//    class fourthansclas1 {
//        String serialno;
//        String mark;
//        String profile;
//        String quantity;
//        String name;
//        String material;
//        String modelid;
//
//        public fourthansclas1(String serialno, String mark, String profile, String quantity, String name, String material, String modelid) {
//            this.serialno = serialno;
//            this.mark = mark;
//            this.profile = profile;
//            this.quantity = quantity;
//            this.name = name;
//            this.material = material;
//            this.modelid = modelid;
//        }
//    }
//
//    public void group() throws IOException {
//        HashMap<String, Integer> k = hm();
//        ArrayList<String> v = hm2();
////        ArrayList<String> items =
////                new  ArrayList<String>(Arrays.asList(v.spl);
////        System.out.println(v);
////        BufferedReader br = new BufferedReader(new FileReader("v"));
//////       LinkedList<String> arr=new LinkedList<String>();
////        String line = "";
////        while ((line = br.readLine()) != null) {
////
//////            String[] value = line.split(",");
////            int a = 1;
//////            System.out.println(a);
////            if (k.keySet().contains(v.get(2))) {
//////                System.out.println(k.keySet());
//////           }
////            }
////        }
//        BufferedReader br = new BufferedReader(new FileReader("C:\\DummyDir\\PART-LIST-WITH-ID.csv"));
//        StringBuffer sb=new
//        String line = "";
//        while ((line = br.readLine()) != null) {
//            String[] value = line.split(",");
//
//        }
//        System.out.println(arr);
//    }
//}
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
