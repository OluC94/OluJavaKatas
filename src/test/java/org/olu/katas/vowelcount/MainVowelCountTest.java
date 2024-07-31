package org.olu.katas.vowelcount;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainVowelCountTest {

    @Test
    void returnsZeroForEmptyString() {
        assertEquals(0, MainVowelCount.vowelCount(""));
    }
}