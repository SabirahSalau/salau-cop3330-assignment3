/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution 41
 *  Copyright 2021 Sabirah Salau
 */

package org.example.Solution41;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReadNames
{

    public static void main(String[] args) throws IOException
    {   //Create array list to store names.
        ArrayList<String> nameList = new ArrayList<String>();

        //Add input file path and create output file path.
        File inFile = new File("src/main/java/org/example/Solution41/exercise41_input.txt");
        String outputPath = ("src/main/java/org/example/Solution41/exercise41_output.txt");

        //Scanner and while loop to read from file.
        Scanner input = new Scanner(inFile);
        while(input.hasNext())
        {
            nameList.add(input.nextLine());
        }

        //Close input file.
        input.close();

        //Access to sorter and output class.
        SortNames sorter = new SortNames();
        OutputNames nameOutput = new OutputNames();

        //Sort sorted string.
        List<String> sortedList = new ArrayList<String>();
        sortedList = sorter.sortNameList(nameList);

        //Output names to console and output file.
        nameOutput.printSortedNames(outputPath, sortedList);

    }
}
