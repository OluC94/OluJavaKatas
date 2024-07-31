package org.olu.katas.vowelcount;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainVowelCountTest {

    @Test
    void returnsZeroForEmptyString() {
        assertEquals(0, MainVowelCount.vowelCount(""));
    }

    @Test
    void correctResultForUniqueVowels() {
        assertEquals(1, MainVowelCount.vowelCount("a"));
        assertEquals(4, MainVowelCount.vowelCount("unique"));
        assertEquals(2, MainVowelCount.vowelCount("vowel"));
        assertEquals(3, MainVowelCount.vowelCount("with space"));
    }

    @Test
    void correctResultForNonUniqueVowels() {
        assertEquals(7, MainVowelCount.vowelCount("aaaaaaa"));
        assertEquals(5, MainVowelCount.vowelCount("repitition"));
        assertEquals(21, MainVowelCount.vowelCount("oooiieeuuaqwptrmnaiiiaaaoooe"));
    }

    @Test
    void zeroForNoVowelsPresent(){
        assertEquals(0, MainVowelCount.vowelCount("rhythm"));
        assertEquals(0, MainVowelCount.vowelCount("xyz"));
    }
}