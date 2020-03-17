package za.ac.cput.adp3;

import java.util.HashSet;
import java.util.Set;

public class SetClass {


    public static void main(String[] args) {

        System.out.println(setMethod());
    }

    public static Set setMethod(){

        Set<String> set = new HashSet<>();
        set.add("Peter");
        set.add("Peter");
        set.add("Sam");
        set.add("Joe");
        set.add("Joe");

        return set;
    }
}
