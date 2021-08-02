package org.example.Solution45;

import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class ReplacerTest {

    @Test
    void replace() throws IOException {
        Replacer.Replace("src/main/java/org/example/Solution45/exercise45_input.txt", "utilize", "use", "src/main/java/org/example/Solution45/exercise45_testOutput.txt");
        File infile = new File("src/main/java/org/example/Solution45/exercise45_testOutput.txt");

        String[] words = null;
        FileReader fr = new FileReader(infile);
        BufferedReader br = new BufferedReader(fr);

        String checker;
        String searchFor = "utilize";

        int count = 0;
        while((checker = br.readLine()) != null)
        {
            words = checker.split(" ");
            for(String word : words){
                if(word.equals(searchFor)){
                    count ++;
                }
            }
        }

        assertEquals(0, count);


    }
}