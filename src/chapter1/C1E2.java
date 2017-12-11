package chapter1;

import  java.util.Scanner;

public class C1E2 {

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
