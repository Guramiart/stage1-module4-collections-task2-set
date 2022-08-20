package com.epam.mjc.collections.set;

import java.util.*;

public class SetCombinationCreator {
    public Set<String> createSetCombination(Set<String> firstSet, Set<String> secondSet, Set<String> thirdSet) {
        Set<String> firstCopySet = new HashSet<>(firstSet);
        Set<String> secondCopySet = new HashSet<>(secondSet);
        Set<String> thirdCopySet = new HashSet<>(thirdSet);

        Set<String> firstAndSecondDuplicateSet = new HashSet<>();
        for(String element : new ArrayList<>(firstCopySet)) {
            if(!secondCopySet.add(element)) {
                firstAndSecondDuplicateSet.add(element);
            } else {
                secondCopySet.remove(element);
            }
        }

        Set<String> thirdUniqueSet = new HashSet<>();
        for(String element : new ArrayList<>(thirdCopySet)) {
            if(firstCopySet.add(element) && secondCopySet.add(element)) {
                thirdUniqueSet.add(element);
            }
            firstCopySet.remove(element);
            secondCopySet.remove(element);
        }

        thirdUniqueSet.addAll(firstAndSecondDuplicateSet);
        return thirdUniqueSet;
    }
}
