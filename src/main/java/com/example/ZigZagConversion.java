package com.example;

public class ZigZagConversion {
    public String convert(String s, int numRows) {
        if (s.length() < 2 || numRows < 2) {
            return s;
        }
        int length = s.length() / 2 + 1;
        char[][] chars = new char[numRows][length];
        int l = 0, i = 0, j = 0;
        while (l < s.length()) {
            // zig
            while (i < numRows && l < s.length()) {
                chars[i][j] = s.charAt(l);
                i++;
                l++;
            }
            i--;
            while (i > 0 && l < s.length()) {
                j++;
                i--;
                chars[i][j] = s.charAt(l);
                l++;
            }
            i++;
        }
        var r = new StringBuilder();
        for (int k = 0; k < numRows; k++) {
            for (int k2 = 0; k2 < length; k2++) {
                if (chars[k][k2] != '\0')
                    r.append(chars[k][k2]);
            }
        }
        return r.toString();
    }
}
