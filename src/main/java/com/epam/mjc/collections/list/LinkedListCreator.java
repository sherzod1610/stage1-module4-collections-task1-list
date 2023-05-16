package com.epam.mjc.collections.list;

import java.util.LinkedList;
import java.util.List;

public class LinkedListCreator {
    public LinkedList<Integer> createLinkedList(List<Integer> sourceList) {
        List<Integer> list = new LinkedList<>(sourceList);
        LinkedList<Integer> list1 = new LinkedList<>();
        for (Integer integer : list) {
            if (integer % 2 == 0) {
                list1.addLast(integer);
            } else {
                list1.addFirst(integer);
            }
        }
        return list1;
    }
}
