package chapter5;
/**
 * PropagateException through the stack
 */
import java.util.Scanner;

public class PropagateException
{
    public static int divideA(int a, int b)
    {
        int ans = a/b;
        return ans;
    }


    public static void main(String args[])
    {
        int a,b;

        Scanner in = new Scanner(System.in);
        System.out.println("enter two no  ");

        a = in.nextInt();
        b = in.nextInt();

        try
        {

            System.out.println(divideA(a, b));

        }
        catch (Exception e)
        {
            System.out.println("can't divide by Zero");
        }
        finally
        {
            System.out.println("can't stop finally");
        }

    }
}
