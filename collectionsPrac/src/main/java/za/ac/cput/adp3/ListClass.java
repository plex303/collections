package za.ac.cput.adp3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class ListClass {
    public static void main(String[] args) {
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

        removeItem(l1,l2);
        for (int i=0;i<l1.size();i++){
            System.out.println("The list contains "+l1.get(i));
        }
    }

    public static void removeItem(Collection<String> l1, Collection<String> l2){
        Iterator<String> i = l1.iterator();

        while(i.hasNext()){
            if(l2.contains(i.next())){
                i.remove();
            }
        }
    }
}
