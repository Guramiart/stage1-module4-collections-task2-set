package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.List;

public class HashSetCreator {
    public HashSet<Integer> createHashSet(List<Integer> sourceList) {
        HashSet<Integer> resultSet = new HashSet<>();
        for (Integer el : sourceList) {
            if(el % 2 == 0) {
                int value = el;
                resultSet.add(value);
                while (value % 2 == 0) {
                    value /= 2;
                    resultSet.add(value);
                }
            } else {
                resultSet.add(el);
                resultSet.add(el * 2);
            }
        }
        return resultSet;
    }
}
