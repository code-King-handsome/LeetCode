package com.easy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Q118 {

    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>(numRows);
        if (numRows > 0) {
            result.add(Collections.singletonList(1));
        }
        List<Integer> previous;
        for (int i = 1; i < numRows; i++) {
            previous = result.get(i-1);
            List<Integer> current = new ArrayList<>(i+1);
            current.add(1);
            for (int j = 1; j < i; j++) {
                current.add(previous.get(j-1)+ previous.get(j));
            }
            current.add(1);
            result.add(current);
        }
        return result;
    }

    public static void main(String[] args) {
        new Q118().generate(5);
    }
}
