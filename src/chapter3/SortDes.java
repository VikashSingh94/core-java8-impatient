package chapter3;
/**

 Sort the Integer object array in the Descending order using the comparator s

 *
 */

import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

class IntSeq implements Comparator<Integer>
{
    @Override
    public int compare(Integer obj1 ,Integer obj2 )
    {
        return( -1 * obj1.compareTo(obj2));
    }
}

public class SortDes {

    public static void main(String args[])
    {
        Integer array[] = new Integer[10];

        int N = 10;

        Random rand = new Random();

        System.out.print("Original Array :  ");

        for(int i = 0 ;i < N; i++)
        {
            //50 is the maximum and the 1 is our minimum
            array[i] = rand.nextInt(50) + 1;
            System.out.print(array[i] + " ");
        }

        System.out.print(" \n Array after sorting :  ");

        Arrays.sort(array , new IntSeq() );

        for(int i = 0 ; i < N ; i++)
            System.out.print(array[i] + " ");
    }

}
