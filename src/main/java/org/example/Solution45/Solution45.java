/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution 45
 *  Copyright 2021 Sabirah Salau
 */


package org.example.Solution45;

import java.io.IOException;

import java.util.Scanner;

public class Solution45 {

    private static Scanner input = new Scanner(System.in);
    public static void main(String[] args) throws IOException {
        String infile = "src/main/java/org/example/Solution45/exercise45_input.txt";
        String outfile = Prompt("What would you like to name the output file?");

        String target = "utilize";
        String replacement = "use";

        Replacer.Replace(infile, target, replacement, outfile);

    }

    public static String Prompt(String prompt){
        System.out.println(prompt);
        String outfileName = input.nextLine();
        String outfile = ("src/main/java/org/example/Solution45/" + outfileName + ".txt");

        return outfile;
    }


}
