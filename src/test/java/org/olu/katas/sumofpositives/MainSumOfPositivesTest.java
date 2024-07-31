package org.olu.katas.sumofpositives;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainSumOfPositivesTest {

    @Test
    void returnZeroForEmptyArray() {
        assertEquals(0, MainSumOfPositives.sumOfPositives(new int[0]));
    }

    @Test
    void returnCorrectResultForPositives() {
        assertEquals(15, MainSumOfPositives.sumOfPositives(new int[] { 1, 2, 3, 4, 5 }));
        assertEquals(100, MainSumOfPositives.sumOfPositives(new int[] { 100 }));
        assertEquals(1381, MainSumOfPositives.sumOfPositives(new int[] { 10, 543, 828 }));
    }

    @Test
    void returnCorrectResultForNegatives() {
        assertEquals(8, MainSumOfPositives.sumOfPositives(new int[] { 1, -2, 3, 4, -5 }));
        assertEquals(10, MainSumOfPositives.sumOfPositives(new int[] { 10, -10}));
        assertEquals(0, MainSumOfPositives.sumOfPositives(new int[] { -1, -200 }));
        assertEquals(200, MainSumOfPositives.sumOfPositives(new int[] { -1, 200, -50 }));
    }
}