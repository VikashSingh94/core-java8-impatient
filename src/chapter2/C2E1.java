package chapter2;

/**
 Implement an immutable class Point that describes a point in the plane. Provide a constructor
 to set it to a specific point, a no-arg constructor to set it to the origin, and methods getX,
 getY, translate, and scale. The translate method moves the point by a given
 amount in x- and y-direction. The scale method scales both coordinates by a given factor.
 Implement these methods so that they return new points with the results. For example,

 Point p = new Point(3, 4).translate(1, 3).scale(0.5);

 *
 */

 final  class Point
{
    private final double x;
    private final double y;

    public Point()
    {
        x = 0;
        y = 0;
    }

    public Point(double x , double y)
    {
        this.x = x;
        this.y = y;
    }

    public double  getX()
    {
        return x;
    }

    public double  getY()
    {
        return y;
    }

    public Point transform(double x ,double  y)
    {
        return new Point( (this.x) + x , (this.y) + y);
    }
    public Point scale(double value)
    {
        return new Point((this.x *value),(this.y * value));
    }

}

public class C2E1 {


    public static void main(String args[])
    {

        Point P = (new Point(3,4)).transform(1,3).scale(0.5);
        System.out.println(P.getX() + " , " + P.getY());


    }

}
