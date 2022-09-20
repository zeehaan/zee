package Collecionframeworkpractice;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class hashset {
    public static void main(String[] args) {
        Set<Integer> hs=new HashSet<>();
        hs.add(13);
        hs.add(13);
        hs.add(13);
        hs.add(14);

        hs.add(16);
        hs.add(17);
        hs.add(19);
        System.out.println(hs);
    }
}
