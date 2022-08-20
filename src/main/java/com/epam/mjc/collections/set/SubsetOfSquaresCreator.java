package com.epam.mjc.collections.set;

import java.util.*;

public class SubsetOfSquaresCreator {
    public Set<Integer> createSubsetOfSquares(List<Integer> sourceList, int lowerBound, int upperBound) {
        List<Integer> list = new ArrayList<>();
        for (Integer integer : sourceList) {
            list.add((int) Math.pow(integer, 2));
        }
        NavigableSet<Integer> set = new TreeSet<>(list);
        return set.subSet(lowerBound, upperBound + 1);
    }
}
