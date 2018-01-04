
/**
 *
 *  @author Vikash Singh
 *  @Date   04 Jan 2018
 *
 *  Implement a class Stack<E> that manages an array list of elements of type E. Provide
 *  methods push, pop, and isEmpty.
 *
 */

package chapter6;

import java.util.ArrayList;

class Stack<E>
{
   private  ArrayList<E> stack ;

   public Stack(int initialSize)
   {
        this.stack = new ArrayList<>(initialSize);
   }


   public void push(E value)
   {
       stack.add(value);
   }

   public E pop()
   {
       if(isEmpty())
       {
           throw new IllegalStateException("Stack is empty");
       }
       return stack.remove(stack.size() - 1);
   }

   public boolean isEmpty()
   {
       if(stack.size() == 0)
           return true;
       else
           return false;
   }




}


public class E1
{

    public static  void main(String args[])
    {
        Stack<Integer> stack  = new Stack<>(5);
        stack.push(5);
        stack.push(4);
        stack.push(3);

        try
        {
            while(!stack.isEmpty())
            {
                System.out.println(stack.pop());
            }
        }
        catch (IllegalStateException ise)
        {
            System.out.println("Error");
        }
    }
}
