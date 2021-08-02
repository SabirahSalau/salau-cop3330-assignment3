package org.example.Solution44;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    void productNotFound() {
        String expected = "false";
        String actual = App.reader("someProduct");

        assertEquals(expected, actual);
    }

}