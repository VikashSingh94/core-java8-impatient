package chapter4;

/**
 Cyclic inheritance not possible in the java
 *
 */
class A extends B
{
    private int a = 10;
    public void displayA()
    {
        System.out.println("a");
    }

}

class B extends A
{
    private int b = 20;

    public void displayB()
    {
        System.out.println("b");
    }

}
public class CyclicInheritance {

    public static  void main(String args[])
    {
        A a = new A();
        B b = new  B();
    }
}
