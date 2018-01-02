/**
 *E2
 * Write a method public double sumOfValues(String filename) throws
 ... that calls the preceding method and returns the sum of the values in the file. Propagate any
 exceptions to the caller.
 *
 * E3
 * Write a program that calls the preceding method and prints the result. Catch the exceptions and
 provide feedback to the user about any error conditions


 * @author Vikash Singh
 * @Date   2 Jan 2018
 *
 */

//Both Exercise 2 and 3 are combined

package chapter5;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class E2 {

    public static double sumOfValues(String fileName)throws IOException
    {
        Scanner in =  new Scanner(new FileReader(fileName));
        double temp = 0.0;

        while(in.hasNextDouble())
        {
            temp += in.nextDouble();
        }

        return temp;
    }

    public static void main(String args[])
    {
        String fileName = "/home/vikash/abc.txt";
        try
        {
            System.out.println(sumOfValues(fileName));
        }
        catch (IOException io)
        {
            System.out.println(io);
        }
    }
}
