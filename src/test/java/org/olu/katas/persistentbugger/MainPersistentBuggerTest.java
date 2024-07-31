package org.olu.katas.persistentbugger;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.olu.katas.persistentbugger.MainPersistentBugger.persistentBugger;

class MainPersistentBuggerTest {

    @Test
    void returnsZeroForSingleDigit() {
        assertEquals(0, persistentBugger(5));
        assertEquals(0, persistentBugger(9));
        assertEquals(0, persistentBugger(3));
    }

    @Test
    void returnsCorrectResultForTwoDigits() {
        assertEquals(1, persistentBugger(10));
        assertEquals(3, persistentBugger(39));
    }

    @Test
    void returnsCorrectResultForMultipleDigits() {
        assertEquals(4, persistentBugger(999));
        assertEquals(2, persistentBugger(7512));
    }
}