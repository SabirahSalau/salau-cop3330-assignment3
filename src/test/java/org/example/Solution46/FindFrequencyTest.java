package org.example.Solution46;

import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class FindFrequencyTest {

    @Test
    void searchFrequencyTest() throws IOException {
        String path = "src/main/java/org/example/Solution46/exercise46_input.txt";
        int expected = 1;
        int actual = FindFrequency.search(path, "snake");

        assertEquals(expected, actual);
    }
}