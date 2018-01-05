/**
 *
 * Implement a class Pair<E> that stores a pair of elements of type E. Provide accessors to get
   the first and second element.
 *
 * @author Vikash Singh
 * @Date   05 Jan 2018
 */


package chapter6;

class Pair<E,S>
{
    E first;
    S second;

    public Pair(E first , S second)
    {
        this.first = first;
        this.second = second;
    }

    public E getFirst() {
        return this.first;
    }

    public S getSecond() {
        return this.second;
    }
}
