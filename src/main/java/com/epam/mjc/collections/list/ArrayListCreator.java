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
        for (int i = 1; i <= list.size(); i++) {
            if ((i) % 3 == 0) {
                list1.add(list1.get(i));
                list1.add(list1.get(i));
            }
        }
        return list1;
    }
}
