package Collecionframeworkpractice;
import java.util.ArrayList;
import java.util.Iterator;

public class Arraylistpractice {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(12);
        al.add(13);
        al.add(14);
        al.add(15);
        al.add(16);
        al.add(17);
        al.add(18);
        System.out.println(al);
        al.add(6, 100);
        al.add(1, 1000);
        al.set(2, 15);
        System.out.println(al);
        ArrayList<Integer> al2 = new ArrayList<Integer>(al);
        System.out.println(al2);
        al.remove(0);
        System.out.println(al);
        al.remove(Integer.valueOf(1000));
        System.out.println(al);
        System.out.println(al.contains(17));
//        System.out.println(al.get(6));
//        al.clear();
//        System.out.println(al.isEmpty());
//        Iterator<Integer> it=al.iterator();
//       while(it.hasNext()){
//          int value=it.next();
//          if(){
//              it.remove();
//          }
//           it.remove();
//           it.remove();
//           System.out.println(it.hasNext());
    }
//        System.out.println("The list remaining "+al.isEmpty());

}
