package za.ac.cput.adp3;

import java.util.HashMap;
import java.util.Map;

public class MapClass {
    private static Map<String,String> m = new HashMap();

    public static void main(String[] args) {
        mapMethod();
        System.out.println(m);
    }

    public static Map mapMethod(){

        m.put("name","Peter");
        m.put("surname", "Smith");

        return m;
    }
}
