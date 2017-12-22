package chapter4;

/**
 * Define an enumeration type for the eight combinations of primary colors BLACK, RED, BLUE,
   GREEN, CYAN, MAGENTA, YELLOW, WHITE with methods getRed, getGreen, and
   getBlue.
 */

enum Color
{
    BLACK, RED, BLUE, GREEN,
    CYAN, MAGENTA, YELLOW, WHITE;

   public static Color getRed()
    {
        return RED;
    }

   public static  Color getGreen()
    {
        return GREEN;
    }

   public static Color getBlue()
    {
        return BLUE;
    }
}

public class E7 {

    public static void main(String args[])
    {
        System.out.println(Color.getGreen());
    }
}
