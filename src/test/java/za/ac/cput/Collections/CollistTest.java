package za.ac.cput.Collections;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;
import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class CollistTest {
    @BeforeEach


    @Test
    public void addCollection() {
       Collection collection = new HashSet();

        collection.add(c);
        System.out.println(collection);

        collection.remove(c);
        System.out.println(collection);
    }
    @Test
    public void addMap() {

            HashMap collistMap = new HashMap();

        collistMap.put(80, "Zizi");
        collistMap.put(81, "Likha");
        collistMap.put(82, "Libo");
        collistMap.put(83, "Druz");

        System.out.println(collistMap);

        //remove
        collistMap.remove(82);
        System.out.println(collistMap);

        //find
        collistMap.containsKey(81);
        System.out.println(collistMap.containsKey(81));

    }

    @Test
    void addSet() {
        Set<Integer> hashset = new HashSet<>();
        hashset.add(15);
        hashset.add(10);
        hashset.add(5);
        hashset.add(5);

        for (int element : hashset) {
            System.out.println(element + " ");
        }
        System.out.println();
        //remove
        hashset.remove(10);
        System.out.println(Hashset);

        //find
        hashset.contains(15);
        System.out.println(hashset.contains(15));

        System.out.println();

        //elements in a sorted order
        Set<Integer> treeSet;
        treeSet = new TreeSet<>();
        treeSet.add(15);
        treeSet.add(10);
        treeSet.add(5);
        treeSet.add(5);
        for (int element : treeset) {
            System.out.println(element + " ");
        }

        @Test
        public void addList(){
            ArrayList arraylist = new Arraylist();
            arraylist.add(50);
            arraylist.add(12.5);
            arraylist.add("hello");
            arraylist.add(true);
            System.out.println(arraylist);

            //remove
            arraylist.remove(1);
            System.out.println("Display after element is removed:" + arraylist);

            //find
            arraylist.contains(12.5);
            System.out.println(arraylist.contains("12.5"));
        }
    }
}
