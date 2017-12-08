package chapter1;

import java.util.Scanner;

public class C1E1 {


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
