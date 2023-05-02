package com.example;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class LongestCommonPrefixTest {
    @Test
    public void testLongestPrefix() {
        String[] strs = new String[]{"flower","flow","flight"};
        LongestCommonPrefix converter = new LongestCommonPrefix();
        String actual = converter.commonPrefix(strs);
        assertEquals("fl", actual);
    }

    @Test
    public void testLongestPrefixV2() {
        String[] strs = new String[]{"cir","car"};
        LongestCommonPrefix converter = new LongestCommonPrefix();
        String actual = converter.commonPrefix(strs);
        assertEquals("c", actual);
    }
}
