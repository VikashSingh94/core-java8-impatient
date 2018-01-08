/**
 *
 * Write a program that reads all words in a file and prints out on which line(s) each of them
 occurred. Use a map from strings to sets.
 *
 *  @author Vikash Singh
 *  @Date   08 Jan 2018
 *
 */

package chapter7;


import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class E8
{

    public  static void main(String args[])throws Exception
    {
        String path = "/home/vikash/abc.txt";
        String line ;

        try
        {

            BufferedReader br = new BufferedReader(new FileReader(path));

            Map<String, Set<Integer>> msi = new TreeMap<>();

            int countLine = 1;

            while ((line = br.readLine()) != null)
            {
                String words[] = line.split(" ");

                for(String i : words)
                {
                    if (msi.containsKey(i))
                    {
                        System.out.println(msi.get(i).add(countLine));
                    }
                    else
                    {
                       //creating the set object and adding the countLine to it
                       Set<Integer> set =  new HashSet<>();
                       set.add(countLine);

                        msi.put(i,set);
                    }
                }

                countLine++;
            }


            msi.forEach((K,V) -> System.out.println( K + "  are in line " + V.toString()));

        }
        catch (Exception e)
        {
            System.out.println(e);
        }

    }
}
