package test3stream;
import readcsvTEST3.readtableclass;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) throws IOException {

       List<Person> people =getpeople();
        List<Person> females=new ArrayList<>();
       String myguid="guid:104b0a86-2b30-4da7-92e5-7f87eae22933";
       //to get myguid
//         females = people.stream().filter(p -> p.getGuid().equals(myguid)).collect(Collectors.toList());
//        females.forEach(System.out::println);

        //to group
        females= (List<Person>) people.stream().collect(Collectors.groupingBy(Person::getMark));
        females.forEach(System.out::println);

    }
    private static List<Person> getpeople() throws IOException {
    List<Person> hm1=new ArrayList<>();
    String path="C:\\DummyDir\\PART-LIST-WITH-ID.csv";
    String line="";
    BufferedReader br = new BufferedReader(new FileReader(path));
    while((line= br.readLine()) != null)
    {
        String[] values=line.split(",");
        Person ob=new Person(values[0],values[1],values[2],values[3],values[4],values[5],values[6]);
        Person ob1=new Person(ob.getSerialno(), ob.getMark(), ob.getProfile(), ob.getQuantity(), ob.getName(), ob.getMaterial(), ob.getGuid());
        hm1.add(ob1);

//                    ll.add(ob);
//                    String a="SL NO: "+values[0]+"Mark ="+values[1]+"Profile ="+values[2]+"Quantity = "+values[3]+"   "+"Name = "+values[4]+"Material= "+values[5]+"guid :"+values[6];
//                    hm1.addAll(ob.serialno,ob.mark,ob.profile,ob.quantity,ob.name,ob.material,ob.guid);
//                    hm1.addAll(ob1);
    }
    return hm1;
}


}
