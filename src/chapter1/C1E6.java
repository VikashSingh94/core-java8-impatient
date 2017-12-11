package chapter1;

import java.util.Scanner;
import java.math.BigInteger;

public class C1E6 {

    private static BigInteger factorial( int number)
    {
        BigInteger ans  = new BigInteger("1");

        for(int i = 1; i <= number; i++)
        {
            ans = ans.multiply(BigInteger.valueOf(i));
        }

        return  ans ;

    }


    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);

        int number;
        number  = in.nextInt();

        System.out.println("Factorial of " + number + " is " + factorial(number));
    }
}
