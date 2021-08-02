package org.example.Solution41;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SortNamesTest {

    @Test
    void sortNameList() 
    {
        SortNames sortNames = new SortNames();
        
        List<String> nameList = Arrays.asList("ABC", "CBA", "BCA");
        List<String> expected = Arrays.asList("ABC", "BCA", "CBA");
        List<String> actual = (sortNames.sortNameList(nameList));

        assertEquals(expected, actual);
    }



}