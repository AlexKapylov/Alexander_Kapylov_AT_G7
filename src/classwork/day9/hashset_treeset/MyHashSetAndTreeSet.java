package classwork.day9.hashset_treeset;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class MyHashSetAndTreeSet {

    public static void main(String[] args) {
        Set<String> myList1 = new HashSet<>();
        Set<String> myList2 = new TreeSet<>();

        long t1 = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            myList1.add("hello" + i);
        }
        System.out.printf("HashSet %s", System.currentTimeMillis() - t1).println();

        t1 = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            myList2.add("hello" + i);
        }
        System.out.printf("TreeSet %s", System.currentTimeMillis() - t1).println();
    }

}
