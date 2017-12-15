

/**

 Write a program that reads an integer and prints it in binary, octal, and hexadecimal. Print the
 reciprocal as a hexadecimal floating-point number.

 *
 */

package chapter1;

import java.util.Scanner;

public class E1 {


    public static void  main(String[] args) {

        System.out.print("enter the number: ");

        int number;

        Scanner in = new Scanner(System.in);
        number = in.nextInt();

        System.out.println(number + " in binary : " + Integer.toBinaryString(number) );

        System.out.println(number + " in octal  : " + Integer.toOctalString(number));

        System.out.println(number + " in Hexa   : " + Integer.toHexString(number));



    }

}
