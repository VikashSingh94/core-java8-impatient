package chapter5;

/**
 *
 * Explicitly throwing the Exception using the "throw" keyword
 *
 */

class Student
{
    public void sum()
    {
        try
        {
            throw new NullPointerException("demo");
        }
        catch (ArithmeticException e)
        {
            System.out.println("caught in the class " + e);
        }
    }
}
public class ThrowTesting {

    public static  void main(String args[])
    {
        try
        {
            Student student = new Student();
            student.sum();

        }
        catch (NullPointerException e)
        {
            System.out.println("caught in the main " + e);
        }
    }

}
