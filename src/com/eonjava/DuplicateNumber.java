package com.eonjava;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DuplicateNumber {
    public Integer findDuplicateNumber1(List<Integer> numbers) {
        Set<Integer> hashSet = new HashSet<>();

        int i = 0;
        for (i = 0; i < numbers.size(); i++) {
            if (!hashSet.add(numbers.get(i))) {
                System.out.println("Duplicate found: " + numbers.get(i));
                break;
            }
        }

        return numbers.get(i);
    }

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();

        for (int i = 0; i < 20; i++) {
            numbers.add(i);
        }

        //add duplicate
        numbers.add(18);

        DuplicateNumber dup = new DuplicateNumber();
        dup.findDuplicateNumber1(numbers);
    }
}
