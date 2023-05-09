package com.example;

import java.util.ArrayList;
import java.util.List;

public class LetterCombinations {
    public List<String> letterCombinations(String digits) {
        char[] digitsArr = digits.toCharArray();
        List<char[]> letters = new ArrayList<>();
        for (int i = 0; i < digitsArr.length; i++) {
            switch (digitsArr[i]) {
                case '2':
                    letters.add(new char[] { 'a', 'b', 'c' });
                    break;
                case '3':
                    letters.add(new char[] { 'd', 'e', 'f' });
                    break;
                case '4':
                    letters.add(new char[] { 'g', 'h', 'i' });
                    break;
                case '5':
                    letters.add(new char[] { 'j', 'k', 'l' });
                    break;
                case '6':
                    letters.add(new char[] { 'm', 'n', 'o' });
                    break;
                case '7':
                    letters.add(new char[] { 'p', 'q', 'r', 's' });
                    break;
                case '8':
                    letters.add(new char[] { 't', 'u', 'v' });
                    break;
                case '9':
                    letters.add(new char[] { 'w', 'x', 'y', 'z' });
                    break;
            }
        }
        List<String> result = new ArrayList<>();
        add(letters, 0, "", result);
        return result;
    }

    private void add(List<char[]> letters, int depth, String r, List<String> results) {
        if (depth >= letters.size() - 1) {
            if (letters.size() == 0) {
                return;
            }
            for (char c : letters.get(depth)) {
                results.add(r + c);
            }
            return;
        }
        for (char c : letters.get(depth)) {
            add(letters, depth + 1, r + c, results);
        }
    }
}
