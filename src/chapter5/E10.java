/**
 * Write a recursive factorial method in which you print all stack frames before you return
 the value. Construct (but don’t throw) an exception object of any kind and get its stack trace
 *
 * @author Vikash Singh
 * @Date   2 Jan 2018
 */



package chapter5;

import java.util.Scanner;

public class E10
{

    public static long  factorial(int N)
    {
        if(N == 1)
        {
            //Arithmetic exception created
            int ans = (N/0);
            System.out.println(ans);

            return 1;
        }
        else
            return N * factorial(N-1);
    }

    public static void main(String args[])
    {
        int N;

        Scanner in = new Scanner(System.in);
        N = in .nextInt();

        try
        {
            System.out.println(factorial(N));
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

    }

}
