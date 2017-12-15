package chapter1;

/**

 Improve the average method so that it is called with at least one parameter.

 *
 */
public class E16 {

    //average function with at least one parameter
    public static double average(double first , double... args)
    {
        double result =  first;
        for(double no  : args)
        {
            result += no;
        }
        return (result/args.length);
    }

    public static void main(String args[])
    {
        System.out.println("average is " + average(10,10,20,40));

    }
}
