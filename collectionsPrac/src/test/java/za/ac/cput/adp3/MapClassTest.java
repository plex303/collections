package za.ac.cput.adp3;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class MapClassTest {

    @Test
    public void mapMethod() {
        Map<String,String> m = new HashMap();
        m.put("name","Peter");
        m.put("surname", "Smith");

       Map p =m;

       assertSame(m,p);
    }
}