package test1;

import java.util.LinkedList;

public class lisrtpractice2 {
    public static void main(String[] args) {
        LinkedList<String> firstlist=new LinkedList<String>();
        firstlist.add("is");
        firstlist.add("a");
        System.out.println(firstlist );
        firstlist.addLast("ZEE");
        firstlist.addFirst("mohammed ");

        System.out.println(firstlist);
        System.out.println(firstlist.size());
        for(int i=0;i<firstlist.size();i++)
        {
            System.out.println(firstlist.get(i)+"-->");
        }
        firstlist.removeFirst()  ;
        System.out.println(firstlist);
        firstlist.removeLast();
        System.out.println(firstlist );
        firstlist.remove(1);
        System.out.println(firstlist);
    }
}
