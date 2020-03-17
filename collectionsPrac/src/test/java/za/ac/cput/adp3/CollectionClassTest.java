package za.ac.cput.adp3;

import org.junit.Test;

import java.util.PriorityQueue;

import static org.junit.Assert.*;

public class CollectionClassTest {

    @Test
    public void colMethod() {
        PriorityQueue<Integer> q = new PriorityQueue<>();
        for(int i=10;i>=1;i--) q.add(i);

        assertNotSame(2,q.peek());
    }
}