
/**
 * Write a method public ArrayList<Double> readValues(String filename)
 throws ... that reads a file containing floating-point numbers. Throw appropriate
 exceptions if the file could not be opened or if some of the inputs are not floating-point
 numbers.

 @Author Vikash Singh
 @Date   2 Jan 2018
 @Reference    https://beginnersbook.com/2013/04/java-checked-unchecked-exceptions-with-examples/
 *
 */

package chapter5;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class E1 {

    public static ArrayList<Float> readValues(String Filename)throws IOException //checked exception
    {

        Scanner in =  new Scanner(new FileReader(Filename));

        ArrayList<Float> array = new ArrayList<Float>();
        float temp;

        while(in.hasNextFloat())
        {
            temp = in.nextFloat();


            if( temp != Math.ceil(temp))
                array.add(temp);
            else
                throw new IllegalArgumentException("Not float number"); //unchecked Exception
        }

        return array;

    }


    public static void main(String args[])
    {
        String path = "/home/vikash/abc.txt"; //change the path to your local directory
        try
        {
            System.out.println("vikash");
            ArrayList<Float> array = readValues(path);
            System.out.println(array.toString());

        }
        catch(IOException io)
        {
            io.printStackTrace();
            System.out.println(io);
        }
        catch(IllegalArgumentException iae)
        {
            System.out.println(iae);
        }
    }
}
