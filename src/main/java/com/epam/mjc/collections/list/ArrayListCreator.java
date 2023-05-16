package com.epam.mjc.collections.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListCreator {
    public ArrayList<String> createArrayList(List<String> sourceList) {
        ArrayList<String> list = new ArrayList<>(sourceList);
        ArrayList<String> list1 = new ArrayList<>();
        for (int i = 0; i <= list.size(); i++) {
            if ((i + 1) % 3 == 0) {
                list1.add(list1.get(i));
                list1.add(list1.get(i));
            }
        }
        return list1;
    }
}
