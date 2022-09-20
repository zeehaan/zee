package test5_Grouptable;
import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.groupingBy;
public class groupclass2 {
    List<objectfile2> readingTable2() throws IOException {

        List<objectfile2> ll = new LinkedList<objectfile2>();
        String path = "C:\\DummyDir\\P02.csv";
        String line = "";
        BufferedReader br = new BufferedReader(new FileReader(path));
        while ((line = br.readLine()) != null) {
            String[] values = line.split(",");
            objectfile2 ob = new objectfile2(values[0], values[1], values[2], values[3], values[4], values[5], values[6], values[7], values[8], values[9]);
            objectfile2 ob1 = new objectfile2(ob.serialno, ob.mark, ob.profile, ob.qty, ob.name, ob.material, ob.modelID, ob.unitwgt, ob.assembly, ob.guid);
            ll.add(ob1);
        }
        List<objectfile2> tab1 = ll.stream().sorted(Comparator.comparing(objectfile2::getAssembly)).toList();
        return tab1;
    }
    public Map<String, List<objectfile2>> groupingTable2() throws IOException {
        List<objectfile2> tab = readingTable2();
        ArrayList<String> tab2=new ArrayList<>();
        String s="\n"+"\n";
        for (int i = 0; i < tab.size(); i++) {
            tab2.add(String.valueOf(tab.get(i)));
            tab2.add(s);
        }
        Map<String, List<objectfile2>> profile = new HashMap<>();
        for (objectfile2 p : tab) {
            if (!profile.containsKey(p.getAssembly())) {
                profile.put(p.getAssembly(), new ArrayList<>());
            }
            profile.get(p.getAssembly()).add(p);
//            profile.get(p.getAssembly()).add(p.space);
        }
//        System.out.println("my type "+profile.getClass());
        profile = tab.stream().collect(Collectors.groupingBy(objectfile2::getAssembly));
        return profile;
    }
    void m1(Map<String, List<objectfile2>> val){

        for (Map.Entry<String, List<objectfile2>> x: val.entrySet()) {
            System.out.println(x.getKey() +" " + x.getValue());
//            for (objectfile2 data: x.getValue()) {
//                data +=
//            }
        }


    }
    public TreeMap<String, List<objectfile2>> sortbykey2() throws IOException {
        {
            Map<String, List<objectfile2>> profile1 = groupingTable2();
            TreeMap<String, List<objectfile2>> sorted = new TreeMap<>();
            sorted.putAll(profile1);
            for (Map.Entry<String, List<objectfile2>> entry : sorted.entrySet()) {
            }
            return sorted;
        }
    }
    public AbstractMap<String, String> modifykey2() throws IOException {

        TreeMap<String, List<objectfile2>> key = sortbykey2();
        Vector<String> arrar = new Vector<>();
        int i = 0;
        for (List<objectfile2> xc : key.values()) {
            arrar.add(i, String.valueOf(xc));
            i++;
        }
        LinkedHashMap<String, Double> lm = new LinkedHashMap<>();
        HashMap<String, String> finallist = new HashMap<>();
        Collection<List<objectfile2>> x = key.values();
        for (Map.Entry<String, List<objectfile2>> x1 : key.entrySet()) {
            List<objectfile2> x2 = x1.getValue().stream().toList();
            Double unotwgt = (double) 0;
            for (objectfile2 data : x2) {
                final String val = data.getUnitwgt();
                unotwgt += Double.parseDouble(val);
            }
            lm.put(x1.getKey(), unotwgt);
        }
        for (Map.Entry<String, Double> x1 : lm.entrySet()) {
        }
        int j = 0;
        for (Map.Entry<String, Double> y : lm.entrySet()) {
            finallist.put(y.getKey()
                    + "                              Quantity Sum :"
                    + y.getValue(),arrar.get(j));
            j++;
        }
        return finallist;
    }

    public void gettable2() throws IOException {
        AbstractMap<String, String> mo = modifykey2();
        TreeMap<String, String> lm = new TreeMap<>();
        lm.putAll(mo);
        System.out.println(" ASSEMBLY LIST WITH PARTS (BOM)\n" +
                " PROJECT NAME:  PROJ-NAME\n" +
                " JOB NUMBER  :  PROJ-NUM                                                                                 Date: 08/23/2022\n" +
                " MODEL NAME  :  3785_6                                                                                   Time: 06:56:53pm\n" +
                " ------------------------------------------------------------------------------------------------------------------------\n" +
                "\n" +
                " S.NO.,MARK,QTY,PROFILE,NAME,MATERIAL,GUID,UNIT wt,ASSEMBLY,GUID");
        for (Map.Entry<String, String> cm : lm.entrySet()) {
            System.out.println(cm.getKey() + "\n" + "\n" + cm.getValue()+"\n"+"\n");
        }
        try {
            PrintStream myconole = new PrintStream(new File("C:\\DummyDir\\FINALOUTPUT1.csv"));
            System.setOut(myconole);
            List<String> ll=new LinkedList<String>();

            for (Map.Entry<String, String> cm : lm.entrySet()) {
                // myconole.print(cm.getKey() + "\n" + "\n" + cm.getValue()+"\n"+"\n");
                ll.add(cm.getKey() +"\n"+ cm.getValue()+"\n");
            }
        } catch (FileNotFoundException e) {
            System.out.println(e);

        }

    }
}



