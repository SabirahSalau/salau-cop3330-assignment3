/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution 42
 *  Copyright 2021 Sabirah Salau
 */

package org.example.Solution42;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class ReadEmployees
{
    public static void main(String[] args) throws FileNotFoundException {
        ArrayList<String> employeeList = new ArrayList<>();

        File infile = new File("src/main/java/org/example/Solution42/exercise42_input.txt");
        String outputPath = ("src/main/java/org/example/Solution42/exercise42_output.txt");

        Scanner input = new Scanner(infile);
        while(input.hasNext())
        {
            employeeList.add(input.nextLine());
        }

        ArrayList<HashMap<String, String>> employees;
    }
}
