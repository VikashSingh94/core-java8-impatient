package chapter5;


import java.util.Scanner;

public class TryCatch
{
    public static void main(String args[]) {

        Scanner in = new Scanner(System.in);

        try {

            System.out.println("enter first number");
            int n1 = in.nextInt();
            System.out.println("enter second number");
            int n2 = in.nextInt();

            double result;

            result = n1 / n2;

            System.out.println(result);

        } catch (Exception e) {
            System.out.println(e);
        }



    }




}
