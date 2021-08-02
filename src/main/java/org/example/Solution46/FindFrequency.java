package org.example.Solution46;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

public class FindFrequency {
    public static int search(String filePath, String findWord) throws IOException {

        //Hashmap to store words.
        HashMap<String, Integer> map = new HashMap<>();
        String words[] = null;
        String line;
        int count = 0;

        FileReader fr = new FileReader(filePath);
        BufferedReader br = new BufferedReader(fr);

        while((line = br.readLine()) != null){
            words = line.split(" ");

            for(String word : words ){
                if(word.equals(findWord)){
                    count++;
                }
            }
        }

        fr.close();

        return count;
    }
}
