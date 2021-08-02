package org.example.Solution43;

import java.io.File;
import java.util.Locale;

public class Files {
    public static void generate(String siteName, String authorName, String js, String css){
        //Create main directory
        String path = System.getProperty("user.dir");
        String webPath = path + "/src/main/java/org/example/Solution43/website/" + siteName;
        File directory = new File(webPath);
        if(!directory.exists()){
            directory.mkdir();
            System.out.println("Created ./website/" + siteName);
        }

        //Create html file
        String htmlPath = webPath + "/index.html";
        File html = new File(htmlPath);
        System.out.println("Created ./website/" + siteName + "/index.html");


        if(js.toLowerCase().equals("y")){
            File JS = new File (webPath + "/js/");
            if(!JS.exists()){
                JS.mkdir();
                System.out.println("Created ./website/" + siteName + "/js/");
            }
        }

        if(css.toLowerCase().equals("y")){
            File CSS = new File(webPath + "/css/");
            System.out.println("Created ./website/" + siteName + "/css/");
        }





    }
}
