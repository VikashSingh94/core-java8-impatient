
/**

 Write a program that reads an integer angle (which may be positive or negative) and
 normalizes it to a value between 0 and 359 degrees. Try it first with the % operator, then with
 floorMod


 *
 */

package chapter1;

import  java.util.Scanner;

public class E2 {

    private static int normalizeAngle(int angle)
    {
        return Math.floorMod(angle, 360);
    }

    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        int angle;
        angle = in.nextInt();

        System.out.print(normalizeAngle(angle));

    }
}
