package za.ac.cput.adp3;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import static org.junit.Assert.*;

public class ListClassTest {


    @Test
    public void removeItem() {
        String items[]={"Beef", "Soap", "Chips", "Cards"};
        List<String> l1 = new ArrayList<>();

        for (String l:items){
            l1.add(l);
        }

        String items2[]={"Beef", "Soap","Cards"};
        List<String> l2 = new ArrayList<>();

        for (String l:items2){
            l2.add(l);
        }

        List<String> result = new ArrayList<>();



        Iterator<String> i = l1.iterator();

        while(i.hasNext()){
            if(l2.contains(i.next())){
                i.remove();
            }
        }

        for (int j=0;j<l1.size();j++){

            result.add(l1.get(j));

        }

        assertEquals(result,l1);
    }


}