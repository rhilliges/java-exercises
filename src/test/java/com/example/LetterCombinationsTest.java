package com.example;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;

public class LetterCombinationsTest {

    @Test
    public void testLetterCombinations() {
        LetterCombinations converter = new LetterCombinations();
        List<String> result = converter.letterCombinations("23");
        assertEquals("[ad, ae, af, bd, be, bf, cd, ce, cf]", result.toString());
    }    

    @Test
    public void testLetterCombinationsV2() {
        LetterCombinations converter = new LetterCombinations();
        List<String> result = converter.letterCombinations("");
        assertEquals("[]", result.toString());
    }
}
