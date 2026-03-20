package ro.ulbs.proiectaresoftware.lab1;


import java.util.ArrayList;
import java.util.List;

public class Application {

    public static void main(String[] args) {

        String alfabet = "";

        for (char c = 'a'; c <= 'z'; c++) {
            alfabet += c;
        }

        System.out.println(alfabet.toLowerCase());
        System.out.println(alfabet.toUpperCase());








        String vocale = "aeiou";
        System.out.println("\nRezultat array:");

        int indexArray = 0;

        for (int i = 0; i < alfabet.length(); i++) {
            char literaCurenta = alfabet.charAt(i);


            if (vocale.indexOf(literaCurenta) != -1) {
                int start = i;
                int sfarsit = i + 1;


                while (sfarsit < alfabet.length() && vocale.indexOf(alfabet.charAt(sfarsit)) == -1) {
                    sfarsit++;
                }


                String grup = alfabet.substring(start, sfarsit);
                System.out.println("array[" + indexArray + "] = \"" + grup + "\";");

                indexArray++;
                i = sfarsit - 1;
            }
        }
    }
}