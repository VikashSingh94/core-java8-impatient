package chapter6;
/**
 *
 * Print the odd element in list using the iterator
 * @author Vikash Singh
 * @date   26 Dec 17
 */

import java.util.ArrayList;
import java.util.ListIterator;

public class IteratorTesting {

    public static void main(String arg[])
    {

        ArrayList<String> strings = new ArrayList<String>();

        strings.add("v");
        strings.add("i");
        strings.add("k");
        strings.add("a");
        strings.add("s");
        strings.add("h");

        ListIterator<String> itr = strings.listIterator();
        String letter ="";
        letter = itr.next();


        while (itr.hasNext()) {

            System.out.println(letter);

            itr.next();
            if(itr.hasNext())
                letter = itr.next();
            else
                break;

        }

    }
}
