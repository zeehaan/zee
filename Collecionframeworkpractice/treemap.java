package Collecionframeworkpractice;

import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

public class treemap {
    public static void main(String[] args) {
        Map<String,Integer> m=new TreeMap<String,Integer>();
        m.put("'one'",1);
        m.put("'two'",2);
        m.put("'three'",3);
        m.put("'four'",4);
        m.putIfAbsent("'one'",10);
        m.putIfAbsent("'six'",10);

        System.out.println(m);
        System.out.println(m.replace("'one'",1,34));
        System.out.println(m.containsValue(4));
        System.out.println(m.entrySet());



//        System.out.println(Collections.);

    }
}
