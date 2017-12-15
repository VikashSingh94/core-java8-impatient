/**

 Using only the conditional operator, write a program that reads three integers and prints the
 largest. Repeat with Math.max.

 *
 */


package chapter1;

import  java.util.Scanner;

public class E3 {

    private static int maximumNo(int array[])
    {
        int maximum = array[0];

        if(array[1] > maximum)
            maximum = array[1];
        else if(array[2] > maximum)
            maximum = array[2];

        return maximum ;

    }

    private static int usingBuildInFunction(int array[])
    {
        int maximum;
        maximum = Math.max(array[0],Math.max(array[1],array[2]));

        return maximum;
    }

    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        int array[] = new int[4];

        array[0] = in.nextInt();
        array[1] = in.nextInt();
        array[2] = in.nextInt();

        System.out.println("Maximum no using conditional  operator : " + maximumNo(array));
        System.out.print("Maximum no using Math.max function : " + usingBuildInFunction(array));

    }
}
