//package test5_Grouptable;
//
//import java.io.*;
//import java.util.*;
//import java.util.stream.Collectors;
//
//
//import static java.util.stream.Collectors.groupingBy;
//public class groupingclass_finaledited {
//    List<objectnew1> readingTable1() throws IOException {
//        List<objectfile_final> ll = new LinkedList<objectfile_final>();
//        String path = "C:\\DummyDir\\P02.csv";
//        String line = "";
//        BufferedReader br = new BufferedReader(new FileReader(path));
//        while ((line = br.readLine()) != null) {
//            String[] values = line.split(",");
//            objectfile_final ob = new objectfile_final(values[0].trim(), values[1].trim(), values[2].trim(), values[3].trim(), values[4].trim(), values[5].trim(), values[6].trim(), values[7].trim(), values[8].trim(), values[9].trim());
//            objectfile_final ob1 = new objectfile_final(ob.serialno, ob.mark, ob.profile, ob.qty, ob.name, ob.material, ob.modelID, ob.unitwgt, ob.assembly, ob.guid);
//            ll.add(ob1);
//        }
//        return ll.stream().sorted(Comparator.comparing(objectfile_final::getAssembly)).toList();
//    }
//
//    public Map<String, List<objectfile_final>> groupingTable1() throws IOException {
//        List<objectfile_final> tab = readingTable1();
//        Map<String, List<objectfile_final>> profile = new HashMap<>();
//        for (objectfile_final p : tab) {
//            if (!profile.containsKey(p.getAssembly())) {
//                profile.put(p.getAssembly(), new ArrayList<>());
//            }
//            profile.get(p.getAssembly()).add(p);
//        }
//        profile = tab.stream().collect(Collectors.groupingBy(objectfile_final::getAssembly));
//        return profile;
//    }
//
//    public TreeMap<String, List<objectfile_final>> sortbykey1() throws IOException {
//        {
//            Map<String, List<objectfile_final>> profile1 = groupingTable1();
//            TreeMap<String, List<objectfile_final>> sorted = new TreeMap<>(profile1);
//            return sorted;
//        }
//    }
//
//    public AbstractMap<String, String> modifykey1() throws IOException {
//        TreeMap<String, List<objectfile_final>> key = sortbykey1();
//        Vector<String> arrar = new Vector<>();
//        int i = 0;
//        for (List<objectfile_final> xc : key.values()) {
//            arrar.add(i, String.valueOf(xc));
//            i++;
//        }
//        LinkedHashMap<String, Double> lm = new LinkedHashMap<>();
//        HashMap<String, String> finallist = new HashMap<>();
//        Collection<List<objectfile_final>> x = key.values();
//        for (Map.Entry<String, List<objectfile_final>> x1 : key.entrySet()) {
//            List<objectfile_final> x2 = x1.getValue().stream().toList();
//            double unitwgt = (double) 0;
//            for (objectfile_final data : x2) {
//                final String val = data.getUnitwgt();
//                unitwgt += Double.parseDouble(val);
//            }
//            lm.put(x1.getKey(), unitwgt);
//        }
//        int j = 0;
//        for (Map.Entry<String, Double> y : lm.entrySet()) {
//            finallist.put(y.getKey() + "  Qty_Sum :" + y.getValue(), arrar.get(j));
//            j++;
//        }
//        return finallist;
//    }
//
//    public void gettable1() throws IOException {
//        AbstractMap<String, String> mo = modifykey1();
//        TreeMap<String, String> lm = new TreeMap<>(mo);
////        System.out.println(" ASSEMBLY LIST WITH PARTS (BOM)\n" +
////                " PROJECT NAME:  PROJ-NAME\n" +
////                " JOB NUMBER  :  PROJ-NUM                                                                                 Date: 08/23/2022\n" +
////                " MODEL NAME  :  3785_6                                                                                   Time: 06:56:53pm\n" +
////                " ------------------------------------------------------------------------------------------------------------------------\n" +
////                "S.NO,MARK,PROFILE,QTY,NAME,MATERIAL,                GUID,                   UNIT wt,ASSEMBLY");
////        for (Map.Entry<String, String> cm : lm.entrySet()) {
////            System.out.println(cm.getKey() + "\n"+ cm.getValue()+"\n");
////        }
//        try {
//            PrintStream myconole = new PrintStream(new File("C:\\DummyDir\\FINAL-OUTPUT6.csv"));
//            System.setOut(myconole);
//            List<String> ll = new LinkedList<String>();//
//            for (Map.Entry<String, String> cm : lm.entrySet()) {
//                myconole.print(cm.getKey() + cm.getValue() + "\n" + "\n");
////                ll.add(cm.getKey() +"\n"+ cm.getValue()+"\n");
//            }
//        } catch (FileNotFoundException e) {
//            System.out.println(e);
//        }
//    }
//
//    public void read_2ndtable1() throws IOException {
//        List<objectnew> newfile = new LinkedList<objectnew>();
//        String path = "C:\\DummyDir\\B01-NEWFILE.csv";
//        String line = "";
//        BufferedReader br = new BufferedReader(new FileReader(path));
//        while ((line = br.readLine()) != null) {
//            String[] values = line.split(",");
//            objectnew ob = new objectnew(values[0], values[1], values[2], values[3], values[4], values[5], values[6]);
//            objectnew ob1 = new objectnew(ob.serialno2, ob.standard, ob.site_shop, ob.size, ob.qty, ob.length, ob.mainpart);
//            System.out.println(ob1);
//            newfile.add(ob1);
//        }
//        System.out.println(newfile);
//
////    public void read2ndtable1() throws IOException {
////        List<objectnew> newfile = new LinkedList<objectnew>();
////        String path = "C:\\DummyDir\\B01-NEWFILE.csv";
////        String line = "";
////        BufferedReader br = new BufferedReader(new FileReader(path));
////        while ((line = br.readLine()) != null) {
////            String[] values = line.split(",");
////            objectnew ob = new objectnew(values[0], values[1], values[2], values[3], values[4], values[5], values[6]);
////            objectnew ob1 = new objectnew(ob.serialno2, ob.standard, ob.site_shop, ob.size, ob.qty, ob.length, ob.mainpart);
////          System.out.println(ob1);
////            newfile.add(ob1);
////
////        }
////        System.out.println("l");
////        System.out.println(newfile.toString());
//////        return newfile;
////    }
//
////    public List<objectnew> sumofqnt1() throws IOException {
////        List<List<objectnew>> subvalue = new ArrayList<>();
////        List<objectnew> secndtable = read2ndtable1();
////        List<objectnew> arr8 = new ArrayList<>();
////        LinkedHashMap<objectnew, Integer> lm4 = new LinkedHashMap<>();
//////            Map<String, List<objectnew>> grplist=secndtable.stream().collect(groupingBy(objectnew::getMainpart));
//////                    Map<String, Map<String, List<objectnew>>> profile1 =  secndtable.stream().collect(groupingBy(objectnew::getMainpart, groupingBy(objectnew::getSize)));
//////            System.out.println(profile1);
////        Map<String, List<objectnew>> profile2 = secndtable.stream().collect(groupingBy(objectnew::getMainpart));
////
////
////        for (Map.Entry<String, List<objectnew>> vy : profile2.entrySet()) {
////            subvalue.add(vy.getValue());
//////                System.out.println(vy.getKey()+vy.getValue()+"\n"+"\n");
////            String x3 = vy.getKey();
////            List<objectnew> x2 = vy.getValue().stream().toList();
//////                System.out.println(x2);
////            int unitwgt = (Integer) 0;
////            int l = 0;
////            for (objectnew data : x2) {
////                final String val = data.getQty();
////                unitwgt += Integer.parseInt(val);
////                lm4.put(data, unitwgt);
////
////            }
////            System.out.println(subvalue.get(0));
////        }
////        int k = 0;
////        //                System.out.println(lk.getKey()+"     "+lk.getValue());
////        LinkedHashMap<objectnew, Integer> lm5 = new LinkedHashMap<>(lm4);
////        for (Map.Entry<objectnew, Integer> bj : lm5.entrySet()) {
////            arr8.add(bj.getKey());
////            arr8.get(k).setSumqnt(String.valueOf(bj.getValue()));
////            k++;
////        }
////        //lm4=Assembly    and sum of qnt
//////        System.out.println(arr8.toString());
////        return arr8;
////    }
////    public void eleminateunwantedvalue1() throws IOException {
////        List<objectnew> ob08= sumofqnt1();
////        List<String> ob09=new LinkedList<>();
////        int i=0;
////
////        for ( objectnew ob07:ob08) {
//////            arr8.add(bj.getKey());
////            ob09.add(ob07.getMainpart());
////            ob09.add(ob07.getSize());
////            ob09.add(ob07.getSumqnt());
////            ob09.add(ob07.getStandard());
////            ob09.add(ob07.getSite_shop());
////            ob09.add(ob07.getLength());
////
////
////
//////            System.out.println(ob09.get(i));
//////            ob09.get(i).setSize(ob07.size);
//////            ob09.get(i).setSumqnt(ob07.sumqnt);
//////            ob09.get(i).setStandard(ob07.standard);
//////            ob09.get(i).setSite_shop(ob07.site_shop);
//////            ob09.get(i).setLength(ob07.length);
////            i++;
////
////        }
////        for (String s : ob09) {
////            System.out.print(s + " " + "\n");
////
////        }
////
//////           ob09.stream().sorted(Comparator.comparing(objectnew::getSize))
////
////    }
//    }
//}