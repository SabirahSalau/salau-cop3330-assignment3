/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution 42
 *  Copyright 2021 Sabirah Salau
 */

package org.example.Solution42;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class ReadEmployees
{
    public static void main(String[] args) throws IOException {
        Parser parser = new Parser();

        File infile = new File("src/main/java/org/example/Solution42/exercise42_input.txt");
        FileWriter outfile = new FileWriter("src/main/java/org/example/Solution42/exercise42_output.txt");

        //Create array list to sort names
        ArrayList<String> employees = new ArrayList<String>();

        //Read file names
        Scanner input = new Scanner(infile);
        while (input.hasNext()) {
            employees.add(input.nextLine());
        }

        //Parse file and output
        parser.parseFile(employees, outfile);

        //Close input file
        input.close();
    }
}
