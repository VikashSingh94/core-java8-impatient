/**

 Why can’t you implement a Java method that swaps the contents of two int variables?
 Instead, write a method that swaps the contents of two IntHolder objects. (Look up this
 rather obscure class in the API documentation.) Can you swap the contents of two Integer
 objects?

 *
 */


package chapter2;

public class E4 {

    // Trying to swap the Integer object declared in the main
    public static void  swap(Integer a , Integer b )
    {
        Integer temp = a;
        a = b;
        b = temp;
    }

    public static void main(String args[])
    {
        Integer  a  = new Integer(10);
        Integer  b  = new Integer(20);

        System.out.println("value of integer a  before swap is " + a);
        System.out.println("value of integer b  before swap is " + b);

        swap(a,b);

        System.out.println("value of integer a  after swap is " + a);
        System.out.println("value of integer b  after swap is " + b);


    }
}
