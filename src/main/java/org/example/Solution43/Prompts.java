/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution 43
 *  Copyright 2021 Sabirah Salau
 */

package org.example.Solution43;

import java.util.Scanner;

public class Prompts
{
    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args)
    {
        Files files = new Files();
        String siteName = readInput("Site name:");
        String author = readInput("Author:");
        String js = readInput("Do you want a folder for JavaScript?");
        String css = readInput("Do you want a folder for CSS?");

        System.out.println("Site name: " + siteName);
        System.out.println("Author: " + author);
        Files.generate(siteName, author, js, css);
    }

    public static String readInput(String prompt)
    {
        System.out.println(prompt);
        String answer = input.nextLine().toLowerCase();

        return answer;
    }
}
