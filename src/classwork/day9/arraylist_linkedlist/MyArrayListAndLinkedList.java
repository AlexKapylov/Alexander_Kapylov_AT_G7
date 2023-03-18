package classwork.day9.arraylist_linkedlist;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MyArrayListAndLinkedList {

    public static void main(String[] args) {
        List<String> myList1 = new ArrayList<>();
        List<String> myList2 = new LinkedList<>();

        long t1 = System.currentTimeMillis();
        for (int i = 0; i < 10000000; i++) {
            myList1.add("hello");
        }
        long t2 = System.currentTimeMillis() - t1;
        System.out.printf("ArrayList: %s", t2).println();

        t1 = System.currentTimeMillis();
        for (int i = 0; i < 10000000; i++) {
            myList2.add("hello");
        }
        t2 = System.currentTimeMillis() - t1;
        System.out.printf("linkedList: %s", t2);
    }

}
