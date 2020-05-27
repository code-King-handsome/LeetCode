package com.easy;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Q202 {

    public boolean isHappy(int n) {
        if (n == 0) {
            return false;
        }
        Set<Integer> set = new HashSet<>();
        while (true) {
            List<Integer> tmp = new ArrayList<>();
            while (n != 0) {
                tmp.add(n % 10);
                n /= 10;
            }
            if (tmp.stream().mapToInt(Integer::intValue).sum() == 1) {
                return true;
            } else {
                n = tmp.stream().map(i -> i * i).mapToInt(Integer::intValue).sum();
                if (set.contains(n)) {
                    return false;
                } else {
                    set.add(n);
                }
            }

        }
    }

    public static void main(String[] args) {
        System.out.println(new Q202().isHappy(20));
    }

}
