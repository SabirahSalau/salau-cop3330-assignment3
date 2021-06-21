package org.example.Solution41;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class OutputNames
{
    public void printSortedNames(String outputPath, List<String> nameList) throws IOException {
        //Create output file
        FileWriter outFile = new FileWriter(outputPath);

        //Write to console and output file.
        outFile.write("Total of " + nameList.size() + " names\n-----------------\n");
        System.out.println("Total of " + nameList.size() + " names\n-----------------");
        for(int i = 0; i < nameList.size(); i++)
        {
            outFile.write(nameList.get(i) + "\n");
            System.out.println(nameList.get(i));
        }

        //Close output file.
        outFile.close();
    }
}
