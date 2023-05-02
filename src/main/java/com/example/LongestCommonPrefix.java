package com.example;

import java.util.Arrays;

public class LongestCommonPrefix {
    public String commonPrefix(String[] strs) {
        int index = -1;
        Arrays.sort(strs, (a, b) -> Integer.compare(a.length(), b.length()));
        for (int i = strs[0].length() - 1; i >=0; i--) {
            if (this.stringsHaveCharAtIndex(strs, strs[0].charAt(i), i)) {
                if(i > index) {
                    index = i;
                }
            } else{
                index = -1;
            }
        }
        if (index == -1) {
            return "";
        }
        return strs[0].substring(0, index+1);
    }

    private boolean stringsHaveCharAtIndex(String[] strs, char c, int i) {
        for (String str : strs) {
            if (str.charAt(i) != c) {
                return false;
            }
        }
        return true;
    }
}
