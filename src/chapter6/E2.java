package chapter6;
/**
 * In an array list of strings, make each string uppercase. Do this with (a) an iterator, (b) a loop
 over the index values
 *
 * @author Vikash Singh
 * @date   20 Dec 17
 *
 */

import java.util.ArrayList;
import java.util.ListIterator;

public class E2 {

    public static ArrayList<String> toUpperCaseA(ArrayList<String> strings) {

        ListIterator<String> itr = strings.listIterator();

        while (itr.hasNext()) {

            String temp = itr.next();
            itr.set(temp.toUpperCase());

        }

        return strings;
    }

    public static ArrayList<String> toUpperCaseB(ArrayList<String> strings)
    {
        for(int i =0 ;i < strings.size();i++)
        {
            strings.set(i,strings.get(i).toUpperCase());
        }
        return strings;
    }

    public static void main(String args[])
    {
        ArrayList<String> strings = new ArrayList<String>();

        strings.add("v");
        strings.add("i");
        strings.add("k");
        strings.add("a");
        strings.add("s");
        strings.add("h");

        strings = toUpperCaseA(strings);

        System.out.println(strings.toString());


        strings = toUpperCaseB(strings);

        System.out.println(strings.toString());


    }



}
