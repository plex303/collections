package za.ac.cput.adp3;

import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.*;

public class SetClassTest {

    @Test
    public void main() {

    }

    @Test
    public void setMethod() {
        Set<String> s = new HashSet<>();
        s.add("Peter");
        s.add("Sam");
        s.add("Joe");


        Set<String> set = new HashSet<>();
        set.add("Peter");
        set.add("Peter");
        set.add("Sam");
        set.add("Joe");
        set.add("Joe");

        assertEquals(s,set);
    }
}