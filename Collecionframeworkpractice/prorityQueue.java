package Collecionframeworkpractice;

import java.util.Comparator;
import java.util.Iterator;
import java.util.PriorityQueue;

public class prorityQueue {


    public static void main(String[] args) {
    
        PriorityQueue<Integer> pq=new PriorityQueue<>();
//        PriorityQueue<Integer> pq=new PriorityQueue<>(Comparator.reverseOrder()); to reverse order

        pq.offer(40);
        pq.offer(24);
        pq.offer(20);
        pq.offer(30);

        System.out.println(pq);

        System.out.println(pq.poll());
        System.out.println(pq);
        System.out.println(pq.peek());
        System.out.println(pq);

    }
}
