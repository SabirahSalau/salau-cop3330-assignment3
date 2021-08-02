package org.example.Solution45;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Replacer {
    public static void Replace(String infile, String target, String replacement, String outfile) throws IOException{
        Path inPath = Paths.get(infile);
        Path outPath = Paths.get(outfile);

        Charset charset = Charset.forName("UTF-8");
        BufferedWriter writer = Files.newBufferedWriter(outPath, charset);
        Scanner input = new Scanner(inPath, charset.name());

        while(input.hasNextLine()){
            String line = input.nextLine();
            line = line.replaceAll(target, replacement);
            writer.write(line);
            writer.newLine();
        }
        input.close();
        writer.close();
    }
}
