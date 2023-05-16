package com.epam.mjc.collections.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListCreator {
    public ArrayList<String> createArrayList(List<String> sourceList) {
        ArrayList<String> list = new ArrayList<>(sourceList);
        ArrayList<String> list1 = new ArrayList<>();
        if (list.size() == 0) {
            return list1;
        }
        for (int i = 0; i <= list.size()-1; i++) {
            if ((i+1) % 3 == 0) {
                list1.add(list.get(i));
                list1.add(list.get(i));
            }
        }
        return list1;
    }
}
