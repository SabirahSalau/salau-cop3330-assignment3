/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution 44
 *  Copyright 2021 Sabirah Salau
 */


package org.example.Solution44;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class App {

    private static Scanner input = new Scanner(System.in);
    public static void main(String[] args) throws IOException, ParseException {

        String result = Prompt();

        while(result.equals("false"))
        {
            System.out.println("Sorry, that product was not found in our inventory.");
            result = Prompt();
            System.out.println(result);
        }


    }

    public static String Prompt(){
        System.out.println("What is the product name?");
        String productSearch = input.nextLine();

        return reader(productSearch);
    }

    public static String reader(String productSearch){


        try {
            JSONParser jsonParser = new JSONParser();

            //Read file to object
            FileReader reader = new FileReader("src/main/java/org/example/Solution44/exercise44_input.json");
            Object obj = jsonParser.parse(reader);

            //Convert to JSON object
            JSONObject jsonObj = (JSONObject)obj;

            JSONArray productArr = (JSONArray)jsonObj.get("products");

            //Get current name
            for(Object product : productArr ){
                JSONObject jsObj = (JSONObject) product;

                String name = (String) jsObj.get("name");

                //Check for product name match
                if(productSearch.equalsIgnoreCase(name)){
                    return ("Name: " + jsObj.get("name") + "\nPrice: " + jsObj.get("price") + "\nQuantity: " + jsObj.get("quantity"));
                }
            }

        } catch (IOException | ParseException e) {
            e.printStackTrace();
        }

        //Return if product not found
        return ("false");
    }



}


