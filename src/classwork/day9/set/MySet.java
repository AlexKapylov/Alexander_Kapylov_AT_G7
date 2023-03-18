package classwork.day9.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class MySet {

    public static void main(String[] args) {
        Set<String> mySet = new HashSet<>();
        String[] mamaArray = "мама мыла раму мыла".split(" ");
        for (String item : mamaArray) {
            mySet.add(item);
        }
        for (String item : mySet) {
            System.out.println(item);
        }
        System.out.println();
        Iterator<String> myIterator = mySet.iterator();
        while (myIterator.hasNext()) {
            System.out.println(myIterator.next());
        }
    }

}
