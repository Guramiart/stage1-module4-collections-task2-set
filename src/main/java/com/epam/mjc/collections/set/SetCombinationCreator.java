package com.epam.mjc.collections.set;

import java.util.*;

public class SetCombinationCreator {
    public Set<String> createSetCombination(Set<String> firstSet, Set<String> secondSet, Set<String> thirdSet) {
        Set<String> firstAndSecondDuplicateSet = new HashSet<>();
        for(String element : new ArrayList<>(firstSet)) {
            if(secondSet.contains(element)) {
                firstAndSecondDuplicateSet.add(element);
            }
        }

        Set<String> thirdUniqueSet = new HashSet<>();
        for(String element : new ArrayList<>(thirdSet)) {
            if(!firstSet.contains(element) && !secondSet.contains(element)) {
                thirdUniqueSet.add(element);
            }
        }

        thirdUniqueSet.addAll(firstAndSecondDuplicateSet);
        return thirdUniqueSet;
    }
}
