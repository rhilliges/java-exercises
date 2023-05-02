package com.example;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SmashingStoneTest {

    @Test
    public void lastStoneWeightTest() {
        int[] stones = new int[] { 2, 7, 4, 1, 8, 1 };
        SmashingStone converter = new SmashingStone();
        int w = converter.lastStoneWeight(stones);
        System.out.println(w);
        assertEquals(1, w);
    }

    @Test
    public void lastStoneWeightTestV2() {
        int[] stones = new int[] { 1,3 };
        SmashingStone converter = new SmashingStone();
        int w = converter.lastStoneWeight(stones);
        System.out.println(w);
        assertEquals(2, w);
    }

    @Test
    public void lastStoneWeightTestV3() {
        int[] stones = new int[] { 3,7,8 };
        SmashingStone converter = new SmashingStone();
        int w = converter.lastStoneWeight(stones);
        System.out.println(w);
        assertEquals(2, w);
    }

    @Test
    public void lastStoneWeightTestV4() {
        int[] stones = new int[] { 7,6,7,6,9 };
        SmashingStone converter = new SmashingStone();
        int w = converter.lastStoneWeight(stones);
        System.out.println(w);
        assertEquals(3, w);
    }

    @Test
    public void lastStoneWeightTestV5() {
        int[] stones = new int[] { 5,1,8,10,7 };
        SmashingStone converter = new SmashingStone();
        int w = converter.lastStoneWeight(stones);
        System.out.println(w);
        assertEquals(1, w);
    }
    
    @Test
    public void lastStoneWeightTestV6() {
        int[] stones = new int[] { 6,8,10,1,10,2,7,4 };
        SmashingStone converter = new SmashingStone();
        int w = converter.lastStoneWeight(stones);
        System.out.println(w);
        assertEquals(0, w);
    }
}
