package Collecionframeworkpractice;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class hashmap {
    public static void main(String[] args) {
        LinkedList<String> ll=new LinkedList<String>();
        HashMap<String,Integer> hm1=new HashMap<String,Integer>();
        ll.add("zee");
        ll.add("zee");
        ll.add("moin");
        ll.add("moin");
        ll.add("moin");
        ll.add("zee");
        ll.add("moin");
        ll.add("zee");
        ll.add("zee");
        for (int i = 0; i < ll.size(); i++) {
            if(hm1.containsKey(ll.get(i))){
                hm1.put(ll.get(i),hm1.get(ll.get(i))+1);
            }
            else {
                hm1.put(String.valueOf(ll.get(i)),1);
            }
        }
        System.out.println("NAME"+"     "+"TIMES");
        for (Map.Entry entry:hm1.entrySet()) {
            System.out.println(entry.getKey()+"     "+entry.getValue());
        }
    }
}
