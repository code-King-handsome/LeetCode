package com.easy;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Q290 {

    public boolean wordPattern(String pattern, String str) {
        char[] keys = pattern.toCharArray();
        String[] words = str.split(" ");
        Map<Character, String> map = new HashMap<>();
        if (keys.length != words.length) {
            return false;
        }
        for (int i = 0; i < keys.length; i++) {
            char key = keys[i];
            if(map.containsKey(key)) {
                if (!map.get(key).equals(words[i])){
                    return false;
                }
            } else {
                map.put(key, words[i]);
            }
        }
        return true;
    }
}
