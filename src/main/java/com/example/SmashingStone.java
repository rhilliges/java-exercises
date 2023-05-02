package com.example;

import java.util.ArrayList;
import java.util.Arrays;

public class SmashingStone {
    public int lastStoneWeight(int[] stones) {
        Arrays.sort(stones);
        ArrayList<Integer> s = new ArrayList<>();
        for (Integer i : stones) {
            s.add(i);
        }
        while (s.size() > 1) {
            int size = s.size();
            int y = s.remove(size - 1);
            int x = s.remove(size - 2);
            int w = y - x;
            size = s.size();
            if (size == 0) {
                return w;
            }
            if (w == 0) {
                continue;
            }
            for (int i = 0; i < size; i++) {
                int w2 = s.get(i);
                if (i == size -1) {
                    if (w > w2) {
                        s.add(w);
                    } else {
                        s.add(i, w);
                    }
                    break;
                }
                if (w > w2) {
                    continue;
                }
                if (i > 0) {
                    s.add(i, w);
                } else {
                    s.add(0, w);
                }
                break;
            }
        }
        if (s.size() == 1) {
            return s.get(0);
        }
        return 0;
    }

    // private int findWeight(int[] stones) {
    // if (stones.length == 0) {
    // return 0;
    // }
    // if (stones.length < 2) {
    // return stones[0];
    // }
    // int y = stones[stones.length - 1];
    // int x = stones[stones.length - 2];
    // (new ArrayList()).remove(x)
    // Arrays.copyOfRange(stones, y, x)
    // }
}
