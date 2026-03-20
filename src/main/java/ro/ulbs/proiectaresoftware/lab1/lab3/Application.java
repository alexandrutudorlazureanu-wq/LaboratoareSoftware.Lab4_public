package ro.ulbs.proiectaresoftware.lab1.lab3;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Application    {



    public static void main(String[] args) throws IOException {
        Path caleIn= Paths.get("in.txt");
        Path caleOut = Paths.get("out.txt");

        List<String> lines = Files.readAllLines(caleIn);

        for(String linie:lines){


            System.out.println(linie);

        }

        List<String> toateElem = new ArrayList<String>();

    for (String linie : lines) {
        String linieA = linie + "/n";
        System.out.print(linieA);
        lines.add(linieA);




         String[] words = linie.split("\\.");
         StringBuilder linieB = new StringBuilder();

         for(int i = 0; i < words.length; i++){

             if(i<words.length-1||linie.endsWith(".")){

                 linieB.append(".\n");

             }

         }

        System.out.print(linieB);
         lines.add(linieB.toString());


        String[] words2 = linie.split(",");
        List<String> elementeLinie = new ArrayList<>();
        for(String word : words){

                elementeLinie.add(word.trim());
        }









    System.out.println("Elementele: " +toateElem);

}

    Files.write(caleOut, lines);






    }
}
