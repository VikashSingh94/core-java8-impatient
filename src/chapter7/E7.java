/**
 *
 *  Write a program that reads all words in a file and prints out how often each word occurred.
    Use a TreeMap<String, Integer>
 *
 *  @author Vikash Singh
 *  @Date   05 Jan 2018
 *
 */

package chapter7;


import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

public class E7
{

    public  static void main(String args[])
    {
        String path = "/home/vikash/abc.txt";
        String line = "";

        try {
            BufferedReader br = new BufferedReader(new FileReader(path));

            Map<String, Integer> msi = new TreeMap<>();

            while ((line = br.readLine()) != null)
            {
                String words[] = line.split(" ");

                Arrays.stream(words).forEach(i -> {
                    if (msi.containsKey(i))
                        msi.put(i, msi.get(i) + 1);
                    else
                        msi.put(i, 1);
                });
            }

            //msi.entrySet().stream().forEach(i -> System.out.println(i + " " + msi.get(i)));

            for(Map.Entry<String,Integer> entry : msi.entrySet()) {
                String key = entry.getKey();
                Integer value = entry.getValue();

                System.out.println(key + " => " + value);
            }
        }
        catch (Exception e)
        {
            System.out.println(e);
        }

    }
}
