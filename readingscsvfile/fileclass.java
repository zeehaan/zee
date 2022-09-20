//package readingscsvfile;
//
//import test5_Grouptable.objectfile_final;
//
//import java.io.*;
//import java.util.*;
//import java.util.stream.Collectors;
//
//public class fileclass {
//    List<ofile> readingTable() throws IOException {
//        List<ofile> ll = new LinkedList<ofile>();
//        String path = "C:\\DummyDir\\P02.csv";
//        String line = "";
//        BufferedReader br = new BufferedReader(new FileReader(path));
//        while ((line = br.readLine()) != null) {
//            String[] values = line.split(",");
//            ofile ob = new ofile(values[0].trim(), values[1].trim(), values[2].trim(), values[3].trim(), values[4].trim(), values[5].trim(), values[6].trim(), values[7].trim(), values[8].trim(), values[9].trim());
//            ofile ob1 = new ofile(ob.serialno, ob.mark, ob.profile, ob.qty, ob.name, ob.material, ob.modelID, ob.unitwgt, ob.assembly, ob.guid);
//            ll.add(ob1);
//        }
//        List<ofile> tab1 = ll.stream().sorted(Comparator.comparing(ofile::getAssembly)).toList();
//        return tab1;
//    }
//
//    public Map<String, List<ofile>> groupingTable() throws IOException {
//        List<ofile> tab = readingTable();
//        Map<String, List<ofile>> profile = new HashMap<>();
//        for (ofile p : tab) {
//            if (!profile.containsKey(p.getAssembly())) {
//                profile.put(p.getAssembly(), new ArrayList<>());
//            }
//            profile.get(p.getAssembly()).add(p);
//        }
//        profile = tab.stream().collect(Collectors.groupingBy(ofile::getAssembly));
//        return profile;
//    }
//
//    public TreeMap<String, List<ofile>> sortbykey() throws IOException {
//        {
//            Map<String, List<ofile>> profile1 = groupingTable();
//            TreeMap<String, List<ofile>> sorted = new TreeMap<>();
//            sorted.putAll(profile1);
//            for (Map.Entry<String, List<ofile>> entry : sorted.entrySet()) {
//            }
//            return sorted;
//        }
//    }
//
//    public AbstractMap<String, String> modifykey() throws IOException {
//        TreeMap<String, List<ofile>> key = sortbykey();
//        Vector<String> arrar = new Vector<>();
//        int i = 0;
//        for (List<ofile> xc : key.values()) {
//            arrar.add(i, String.valueOf(xc));
//            i++;
//        }
//        LinkedHashMap<String, Double> lm = new LinkedHashMap<>();
//        HashMap<String, String> finallist = new HashMap<>();
//        Collection<List<ofile>> x = key.values();
//        for (Map.Entry<String, List<ofile>> x1 : key.entrySet()) {
//            List<ofile> x2 = x1.getValue().stream().toList();
//            double unitwgt = (double) 0;
//            for (ofile data : x2) {
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
//    public void gettable() throws IOException {
//        AbstractMap<String, String> mo = modifykey();
//        TreeMap<String, String> lm = new TreeMap<>(mo);
//        System.out.println(" ASSEMBLY LIST WITH PARTS (BOM)\n" +
//                " PROJECT NAME:  PROJ-NAME\n" +
//                " JOB NUMBER  :  PROJ-NUM                                                                                 Date: 08/23/2022\n" +
//                " MODEL NAME  :  3785_6                                                                                   Time: 06:56:53pm\n" +
//                " ------------------------------------------------------------------------------------------------------------------------\n" +
//                "S.NO,MARK,PROFILE,QTY,NAME,MATERIAL,                GUID,                   UNIT wt,ASSEMBLY");
//        for (Map.Entry<String, String> cm : lm.entrySet()) {
//            System.out.println(cm.getKey() + "\n"+ cm.getValue()+"\n");
//        }
////        Hashtable<String, String> secondfinallist = eleminateunwantedvalue();
////        System.out.println(secondfinallist.keySet());
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
//}
