package readcsvTEST3;
import com.google.gson.internal.bind.util.ISO8601Utils;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.function.BiConsumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;
public class readtableclass {

    List<fileobject> ll=new LinkedList<fileobject>();
    List<fileobject> getguid() throws IOException {
        List<fileobject> hm1=new LinkedList<>();
        String path="C:\\DummyDir\\PART-LIST-WITH-ID.csv";
        String line="";
            BufferedReader br = new BufferedReader(new FileReader(path));
            while((line= br.readLine()) != null)
            {
                String[] values=line.split(",");
                fileobject ob=new fileobject(values[0],values[1],values[2],values[3],values[4],values[5],values[6]);
                fileobject ob1=new fileobject(ob.serialno,ob.mark,ob.profile,ob.quantity,ob.name,ob.material,ob.guid);
                 hm1.add(ob1);
//                    ll.add(ob);
//                    String a="SL NO: "+values[0]+"Mark ="+values[1]+"Profile ="+values[2]+"Quantity = "+values[3]+"   "+"Name = "+values[4]+"Material= "+values[5]+"guid :"+values[6];
//                    hm1.addAll(ob.serialno,ob.mark,ob.profile,ob.quantity,ob.name,ob.material,ob.guid);
//                    hm1.addAll(ob1);
            }
        return hm1;
    }
   fileobject gettingguid(String myguid) throws IOException {
      List<fileobject> hm2= getguid();
       //to get myguid
       List<fileobject> finalguid = hm2.stream().filter(p -> p.getGuid().equals(myguid)).collect(Collectors.toList());
       finalguid.forEach(System.out::println);
//       List<fileobject> sortnpm=  hm2.sort(Comparator.comparing(fileobject::getName).thenComparing(Comparator.comparing(fileobject::getProfile).thenComparing(Comparator.comparing(fileobject::getMark))));
//       System.out.println(sortnpm.toString());

return (fileobject) hm2;
   }

//   fileobject getuhjy(){
//
//           HashMap<String,String> hm1=new HashMap<String,String>();
////        ArrayList<fileobject> ts=new ArrayList<fileobject>();
//           ArrayList<String> ll=new ArrayList<>();
//           String path="C:\\DummyDir\\PART-LIST-WITH-ID.csv";
//           String line="";
//           BufferedReader br = new BufferedReader(new FileReader(path));
//           while((line= br.readLine()) != null)
//           {
//               String[] values=line.split(",");
//               ob=new fileobject(values[0],values[1],values[2],values[3],values[4],values[5],values[6]);
//               ll.add(ob.mark+" "+ob.profile+""+ob.guid+""+ob.name);
//               hm1.put(ob.mark,ob.profile+ob.material+ob.name+ob.quantity);
//           }
//           return ll;
//   }
   List<fileobject> sortprofile() throws IOException {
       List<fileobject> p1 = getguid();
        List<fileobject> P2=p1.stream().sorted(Comparator.comparing(fileobject::getProfile)).collect(Collectors.toList());
       System.out.println(P2.toString());

        return P2;
   }
    List<fileobject> sortname() throws IOException {
        List<fileobject> p = getguid();
        List<fileobject> P3=p.stream().sorted(Comparator.comparing(fileobject::getName)).collect(Collectors.toList());
        System.out.println(P3.toString());
        return P3;
    }

   List<fileobject> getsortednpm() throws IOException {
       List<fileobject> hm5= getguid();
       List<fileobject> sortnpm=  hm5.stream().sorted(Comparator.comparing(fileobject ::getName)).sorted(Comparator.comparing(fileobject::getProfile)).sorted(Comparator.comparing(fileobject::getMark)).collect(Collectors.toList());
       System.out.println(sortnpm.toString());
        return sortnpm;
   }
   void group() throws IOException {
       List<fileobject> value= getguid();
//       List<fileobject> G1=(List<fileobject>) value.stream().collect(Collectors.partitioningBy((fileobject f)-> f.getProfile().equals("C10X15.3")));
//       System.out.println(G1);
//       List<fileobject> G2= (List<fileobject>) value.stream().collect(Collectors.groupingBy((fileobject p)->p.getProfile()));
//       List<fileobject> G3= (List<fileobject>) value.stream().collect(Collectors.groupingBy(fileobject ->fileobject.getProfile(),Collectors.toList()));
       Map<String,List<fileobject>> profile = new HashMap<>();

       for(fileobject p : value)
       {
           if(!profile.containsKey(p.getProfile()))
           {
               profile.put(p.getProfile(), new ArrayList<>());
           }
           profile.get(p.getProfile()).add(p);
       }
       profile =  value.stream().collect(Collectors.groupingBy(fileobject::getProfile));

       for ( Map.Entry<String, List<fileobject>> s:profile.entrySet()) {
////
           System.out.println("Profile :"+s.getKey().toString());
           System.out.println(s.getValue());
////             System.out.println(s.toString());
////
//////           System.out.printf("%20s%20s%20s%20s%20s%20s%20s","","mark","profile","quantity","name","material","guid");
//////           System.out.println(" ");
////           System.out.println("===========================================================================================================");
       }
//       System.out.println(profile.size()+"Profile grouping:-------------------------------------------------------------------------------------------------------------------- "+"\n" + profile.toString());
//       return (List<fileobject>) profile;
    }
    class fileobject implements List<fileobject> {
        public fileobject(String serialno,String mark,String profile , String quantity,String name ,String material, String guid ) {
            this.serialno = serialno;
            this.mark = mark;
            this.profile = profile;
            this.quantity = quantity;
            this.name = name;
            this.material = material;
            this.guid = guid;
        }

        String serialno;
        String name;
        String mark;

        public String getSerialno() {
            return serialno;
        }

        public String getName() {
            return name;
        }

        public String getMark() {
            return mark;
        }

        public String getQuantity() {
            return quantity;
        }

        public String getProfile() {
            return profile;
        }

        public String getGuid() {
            return guid;
        }

        public String getMaterial() {
            return material;
        }

        String quantity;
        String profile;
        String guid;
        String material;
        @Override
        public String toString() {
            return "file [serialno=" + serialno + ", mark=" + mark + ", profile=" + profile + ", quantity=" + quantity
                    + ", name=" + name + ", material=" + material + ", guid=" + guid + "]";
        }

        @Override
        public int size() {
            return 0;
        }

        @Override
        public boolean isEmpty() {
            return false;
        }

        @Override
        public boolean contains(Object o) {
            return false;
        }

        @Override
        public Iterator<fileobject> iterator() {
            return null;
        }

        @Override
        public Object[] toArray() {
            return new Object[0];
        }

        @Override
        public <T> T[] toArray(T[] a) {
            return null;
        }

        @Override
        public boolean add(fileobject fileobject) {
            return false;
        }

        @Override
        public boolean remove(Object o) {
            return false;
        }

        @Override
        public boolean containsAll(Collection<?> c) {
            return false;
        }

        @Override
        public boolean addAll(Collection<? extends fileobject> c) {
            return false;
        }

        @Override
        public boolean addAll(int index, Collection<? extends fileobject> c) {
            return false;
        }

        @Override
        public boolean removeAll(Collection<?> c) {
            return false;
        }

        @Override
        public boolean retainAll(Collection<?> c) {
            return false;
        }

        @Override
        public void clear() {

        }

        @Override
        public fileobject get(int index) {
            return null;
        }

        @Override
        public fileobject set(int index, fileobject element) {
            return null;
        }

        @Override
        public void add(int index, fileobject element) {

        }

        @Override
        public fileobject remove(int index) {
            return null;
        }

        @Override
        public int indexOf(Object o) {
            return 0;
        }

        @Override
        public int lastIndexOf(Object o) {
            return 0;
        }

        @Override
        public ListIterator<fileobject> listIterator() {
            return null;
        }

        @Override
        public ListIterator<fileobject> listIterator(int index) {
            return null;
        }

        @Override
        public List<fileobject> subList(int fromIndex, int toIndex) {
            return null;
        }
    }
}
