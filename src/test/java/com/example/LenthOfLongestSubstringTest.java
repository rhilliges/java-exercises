package com.example;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class LenthOfLongestSubstringTest {
    @Test
    public void lengthOfLongestSubstring3() {
        LengthOfLongestSubstring converter = new LengthOfLongestSubstring();
        int r = converter.lengthOfLongestSubstring("abcabcbb");
        assertEquals(3, r);
    }

    @Test
    public void lengthOfLongestSubstring1() {
        LengthOfLongestSubstring converter = new LengthOfLongestSubstring();
        int r = converter.lengthOfLongestSubstring("bbbbbbbb");
        assertEquals(1, r);
    }
    
    @Test
    public void lengthOfLongestSubstring3V2() {
        LengthOfLongestSubstring converter = new LengthOfLongestSubstring();
        int r = converter.lengthOfLongestSubstring("pwwkew");
        assertEquals(3, r);
    }

        
    @Test
    public void lengthOfLongestSubstring3V3() {
        LengthOfLongestSubstring converter = new LengthOfLongestSubstring();
        int r = converter.lengthOfLongestSubstring("dvdf");
        assertEquals(3, r);
    }
        
    @Test
    public void lengthOfLongestSubstring2V2() {
        LengthOfLongestSubstring converter = new LengthOfLongestSubstring();
        int r = converter.lengthOfLongestSubstring("au");
        assertEquals(2, r);
    }
            
    @Test
    public void lengthOfLongestSubstring1V2() {
        LengthOfLongestSubstring converter = new LengthOfLongestSubstring();
        int r = converter.lengthOfLongestSubstring("aa");
        assertEquals(1, r);
    }

                
    @Test
    public void lengthOfLongestSubstring2V3() {
        LengthOfLongestSubstring converter = new LengthOfLongestSubstring();
        int r = converter.lengthOfLongestSubstring("aaf");
        assertEquals(2, r);
    }
}
