/**
 *
 * Write a method public double sumOfValues(String filename) throws
 ... that calls the preceding method and returns the sum of the values in the file. Propagate any
 exceptions to the caller.
 *
 * @author Vikash Singh
 * @Date   2 Jan 2018
 *
 */



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
            System.out.println("IO Exception Handle  in the main");
        }
    }
}
