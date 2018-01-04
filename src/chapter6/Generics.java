/**
 *
 * Create a generics class and implements the comparator
 * @author Vikash Singh
 * @Date   3 Jan 2018
 *
 */

package chapter6;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

class VikStructure<T>
{
    private T key;

    public VikStructure( T key)
    {
        this.key = key;
    }

    public T getkey()
    {
        return  this.key;
    }

}

class VikStructureComparator implements Comparator< VikStructure<Integer> >
{
    @Override
    public int compare(VikStructure<Integer> obj1 ,VikStructure<Integer> obj2)
    {
        return  obj2.getkey() -  obj1.getkey();
    }
}


class VikStructureComparatorString implements Comparator< VikStructure<String> >
{
    @Override
    public int compare(VikStructure<String> obj1 ,VikStructure<String> obj2)
    {
        return  obj2.getkey().compareTo(obj1.getkey());
    }
}

public class Generics {

    public static void main(String args[])
    {
        VikStructure<Integer> vikStructure[ ] = new VikStructure[10];

        for(int i = 0 ;i <10;i++)
        {
            vikStructure[i] = new VikStructure(i);
        }

        //Collections.sort(vikStructure, new VikStructureComparator());
       Arrays.sort(vikStructure);

        Arrays.stream(vikStructure).forEach(i -> System.out.println(i.getkey()));
    }



}


