/**

 Write a program that reads a string and prints all of its nonempty substrings.

 **/

package chapter1;

import java.util.Scanner;

public class E8 {

    private static void subString(String string) {
        int length = string.length();

        //Printing the non empty substring of string
        //Time complexity O(N^2)
        for (int i = 0; i < length; i++)
        {
            //empty string
            String temp ="";

            for(int k = i ;(k < length)  ; k++)
            {
                temp += Character.toString(string.charAt(k));
                System.out.println(temp);
            }


        }

    }

    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        String string = in.nextLine();

        if(!string.isEmpty())
            subString(string);
        else
            System.out.println("empty string");

    }


}
