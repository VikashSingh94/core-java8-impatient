/**
 *
 *
 * Write a program that reads a sentence into an array list. Then, using
 Collections.shuffle, shuffle all but the first and last word, without copying the words
 into another collection.
 *
 *  @author Vikash Singh
 *  @Date   08 Jan 2018
 *
 */

package chapter7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class E11 {

    public static List<String> shuffle(List<String> words)
    {

        //removing the first and last word from the list

        String first = words.remove(0);
        String last  = words.remove(words.size()-1);

        //shuffle except the first and last word without copying into the other collection

        Collections.shuffle(words , new Random());

        //adding the first and last word to the list

        words.add(0,first);
        words.add(words.size(),last);

        return words;
    }

    public static void  main(String args[])throws IOException
    {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String sentence = br.readLine();


        String words[] = sentence.split(" \\s*"); //one or more space between word

        ArrayList<String> shuffleWords = new ArrayList<>();

        Collections.addAll(shuffleWords,words);


        try
        {

            System.out.println(shuffle(shuffleWords).toString());
        }
        catch (Exception e)
        {
            e.printStackTrace();
            System.out.println(e);
        }


    }
}