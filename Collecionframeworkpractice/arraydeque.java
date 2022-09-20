package Collecionframeworkpractice;

import java.util.AbstractQueue;
import java.util.ArrayDeque;

public class arraydeque {
    public static void main(String[] args) {
        ArrayDeque<Integer> ad=new ArrayDeque<Integer>();
        ad.offerLast(200);
        ad.offer(12);
        ad.offer(34);
        ad.offer(45);
        ad.offer(78);
        ad.offer(98);
        ad.offerFirst(100);
        ad.offer(13);
        System.out.println(ad);
        System.out.println(ad.peekFirst());
        System.out.println(ad.peekLast());
        System.out.println(ad.pollFirst());
        System.out.println(ad);
        System.out.println(ad.pollLast());
        System.out.println(ad);
    }
}
