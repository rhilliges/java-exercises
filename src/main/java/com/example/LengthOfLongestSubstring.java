package com.example;

import java.util.HashSet;
import java.util.Set;

public class LengthOfLongestSubstring {
    public int lengthOfLongestSubstring(String s) {
        int left = 0;
        int ans = 0;
        Set<Character> set = new HashSet<>();

        if (s.length() < 2) {
            return s.length();
        }

        for (int right = 0; right < s.length(); right++) {
            if (!set.contains(s.charAt(right))) {
                set.add(s.charAt(right));
                ans = Math.max(ans, right - left + 1);
            } else {
                while (s.charAt(left) != s.charAt(right)) {
                    set.remove(s.charAt(left));
                    left++;
                }
                set.remove(s.charAt(left));
                left++;
                set.add(s.charAt(right));

            }

        }
        return ans;
    }
}
