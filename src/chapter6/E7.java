/**
 *
 * E7
 *
 * Implement a class Pair<E> that stores a pair of elements of type E. Provide accessors to get
   the first and second element.
 *
 * E8
 *
 * Modify the class of the preceding exercise by adding methods max and min, getting the larger
   or smaller of the two elements.

 * @author Vikash Singh
 * @Date   05 Jan 2018
 */


package chapter6;

//Both E7 and E8 are combined
class Pair<E extends Comparable>
{
    E first;
    E second;

    public Pair(E first , E second)
    {
        this.first = first;
        this.second = second;
    }

    public E getFirst() {
        return this.first;
    }

    public E getSecond() {
        return this.second;
    }

    public E getMax()
    {
        if(first.compareTo(second) >= 0)
            return first;
        else
            return second;

    }
}

public class E7
{
    public static  void main(String args[])
    {
        Pair<Integer> pii = new Pair<>(10,20);
        System.out.println(pii.getMax());
    }
}
