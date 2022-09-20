package practicepackages;
import java.lang.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class comparator2 {
     public static void main(String[] args) {
         ArrayList<Student1> arr = new ArrayList<Student1>();
arr.add(new Student1("zee","123"));
         arr.add(new Student1("zee","888"));
         arr.add(new Student1("shan","333"));
         arr.add(new Student1("ana","444"));
         arr.add(new Student1("bavash","143"));
         arr.add(new Student1("alia","222"));

         Collections.sort(arr,new sortbyname());
        arr.forEach(System.out::println);
     }
}

class Student1{
    @Override
    public String toString() {
        return "Student1{" +
                "sname='" + sname + '\'' +
                ", srollno='" + srollno + '\'' +
                '}';
    }

    String sname;
    String srollno;
     Student1(String sname, String srollno) {
        this.sname = sname;
        this.srollno = srollno;
    }




}
class sortbyname implements Comparator<Student1>{

    @Override
    public int compare(Student1 o1, Student1 o2) {
        return o1.sname.compareTo(o2.sname);
    }
}