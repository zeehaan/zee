package demo;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;

public class practiceclass7 {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<Integer>();
        list.add(3);
        list.add(2);
        list.add(4);
        System.out.println(list);
        for (int i:
            list ) {
            System.out.print(i+" ");
        }

        Collections.sort(list);
        System.out.println(list);

    }
}
