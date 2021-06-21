package org.example.Solution41;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SortNamesTest {

    @Test
    void sortNameList() 
    {
        SortNames sortNames = new SortNames();
        
        List<String> nameList = Arrays.asList("Johnson, Jim\n", "Ling, Mai\n", "Zarnecki, Sabrina");
        String expected = ("Ling, Mai\nohnson, Jim\nZarnecki, Sabrina");
        assertEquals(sortNames.sortNameList(nameList));
    }

    private void assertEquals(List<String> sortNameList) {
    }

}