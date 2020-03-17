package za.ac.cput.adp3;

import sun.misc.Queue;

import java.util.Collection;
import java.util.PriorityQueue;

public class CollectionClass {
    private static PriorityQueue<Integer> q = new PriorityQueue<>();
    public static void main(String[] args) {
        colMethod();
        System.out.println(q.peek());

    }

    public static void colMethod(){
        for(int i=10;i>=1;i--) q.add(i);

    }
}
