package chapter3;
/**
 *
 * Program to print and  return the number greater than 5 from the list of numbers
 *
 * @author Vikash Singh
 * @Date   27 Dec 2017
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static java.util.stream.Collectors.toList;

public class LambdaTesting {

    public static List<Integer> imperativeStyle(ArrayList<Integer> arrayList)
    {
        List<Integer> list = new ArrayList<Integer>(100);

        for(Integer number : arrayList)
        {
            if( number > 5)
            {
                System.out.print(number);
                list.add(number);
            }

        }
        return  list;
    }

    /*
        if statement is strong indication for the use of the filter
        filter should return the boolean value or
        it does not change the collection

        stream is just the pipeline (Stream of flowing water)

    */

    public static List<Integer> streamLambda(ArrayList<Integer> arrayList)
    {
        arrayList.stream().filter(no -> no > 5).forEach(no -> System.out.print(no));
        return  arrayList.stream().filter(no -> no > 5).collect(toList());
    }


    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> arrayList = new ArrayList<Integer>(11);

        for(int i = 0; i <10;i++)
        {
            arrayList.add(i);
        }

        System.out.println(imperativeStyle(arrayList).toString());
        System.out.println(streamLambda(arrayList).toString());


    }
}
