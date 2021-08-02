package org.example.Solution42;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class ParserTest {

    @Test
    void parseFile() throws IOException {
        //Empty string array for parsed values
        ArrayList<String> employees = new ArrayList<String>();
        File infile = new File("src/main/java/org/example/Solution42/exercise42_input.txt");
        String[] parser = new String[0];
        
        //Read file names
        Scanner input = new Scanner(infile);
        while (input.hasNext()) {
            employees.add(input.nextLine());
        }

        for (String i : employees) {
            parser = i.split(",");
        }


        Assertions.assertEquals("Zarnecki", parser[0]);

    }
}