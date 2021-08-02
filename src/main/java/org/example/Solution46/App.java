/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution 46
 *  Copyright 2021 Sabirah Salau
 */


package org.example.Solution46;

import java.io.*;


public class App
{
    public static void main(String[] args) throws IOException {
        FindFrequency findFrequency = new FindFrequency();
        String filePath = "src/main/java/org/example/Solution46/exercise46_input.txt";
        String badger = "badger";
        String mushroom = "mushroom";
        String snake = "snake";

        int w1 = findFrequency.search(filePath, badger);
        int w2 = findFrequency.search(filePath, mushroom);
        int w3 = findFrequency.search(filePath, snake);

        StringBuilder stars1 = genStars(w1);
        StringBuilder stars2 = genStars(w2);
        StringBuilder stars3 = genStars(w3);

        String string1 = (badger + ": " + stars1);
        String string2 = (mushroom + ": " + stars2);
        String string3 = (snake + ": " + stars3);

        if(w1 > w2){
            if(w1 > w3){
                System.out.println(string1);
                if(w2 > w3){
                    System.out.println(string2);
                }
                System.out.println(string3);
            }
        }

        if(w2 > w1){
            if(w2 > w3){
                System.out.println(string2);
                if(w1 > w3){
                    System.out.println(string1);
                }
                System.out.println(string3);
            }

        }

        if(w3 > w1){
            if(w3 > w2){
                System.out.println(string3);
                if(w1 > w2){
                    System.out.println(string1);
                }
                System.out.println(string2);
            }

        }



    }

    public static StringBuilder genStars(int number){
        StringBuilder stars = new StringBuilder();
        for(int i = 0; i < number; i++){
            stars.append("*");
        }

        return stars;
    }
}
