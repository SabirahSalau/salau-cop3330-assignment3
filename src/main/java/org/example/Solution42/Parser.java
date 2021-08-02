package org.example.Solution42;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Parser {
    public static void parseFile(ArrayList<String> employees, FileWriter outfile) throws IOException {

        //Empty string array for parsed values
        String[] parser;

        //Write header to file and console
        outfile.write("Last      First     Salary\n--------------------------\n");
        System.out.println("Last      First     Salary\n--------------------------\n");


        //Parse data and format for output to file and console
        for (String i : employees) {
            parser = i.split(",");
            outfile.write(String.format("%-10s" +  "%-10s" + "%-10s\n", parser[0], parser[1], parser[2]));
            System.out.println(String.format("%-10s" +  "%-10s" + "%-10s", parser[0], parser[1], parser[2]));
        }

        //Close output file
        outfile.close();
    }


}

