package chapter4;

/**
 * testing the object class (default) method
 */

class A
{
    public int a;
    public int b;

    public A(int a, int b)
    {
        this.a = a;
        this.b = b;
    }
}

public class ObjectClass {

    public static void main(String args[])
    {
        A abc = new A(10, 20);
        System.out.println(abc.toString());
        System.out.println(abc.hashCode());
    }
}
