package Collecionframeworkpractice;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Linkedlistpractice {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<Integer>();
        ll.addLast(5);
        ll.add(2);
        ll.add(3);
        ll.add(4);
        ll.add(6);
        ll.addFirst(7);
        ll.addFirst(8);
        ll.addFirst(9);
        ll.addFirst(10);
        ll.addFirst(11);
        System.out.println(ll);
        ll.removeLast();
        System.out.println(ll);
        ll.removeFirst();
        System.out.println(ll);
    }
}
