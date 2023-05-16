package com.epam.mjc.collections.list;

import java.util.Comparator;
import java.util.List;

public class ListSorter {
    public void sort(List<String> sourceList) {
        sourceList.sort(new ListComparator());
    }
}

class ListComparator implements Comparator<String> {
    @Override
    public int compare(String a, String b) {
        int valueA = calculateFunction(a);
        int valueB = calculateFunction(b);

        if (valueA != valueB){
            return Integer.compare(valueA, valueB);
        }
        return a.compareTo(b);
    }

    public int calculateFunction(String value){
        int x = Integer.parseInt(value);
        return 5*x*x+3;
    }
}
