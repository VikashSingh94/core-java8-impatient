/**

 Repeat the preceding exercise, but now make translate and scale into mutators.



 Implement an immutable class Point that describes a point in the plane. Provide a constructor
 to set it to a specific point, a no-arg constructor to set it to the origin, and methods getX,
 getY, translate, and scale. The translate method moves the point by a given
 amount in x- and y-direction. The scale method scales both coordinates by a given factor.
 Implement these methods so that they return new points with the results. For example,

 Point p = new Point(3, 4).translate(1, 3).scale(0.5);

 *
 */


package chapter2;


public class E6 {


    private static class Point
    {
        private double x;
        private double y;

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

        public void transform(double x ,double  y)
        {
            this.x = this.x + x ;
            this.y = this.y + y;
        }

        public void scale(double value)
        {
            this.x = this.x *value;
            this.y = this.y * value;
        }

    }


    public static void main(String args[])
    {

        Point P = new Point(3,4);
        P.transform(1,3);
        P.scale(0.5);
        System.out.println(P.getX() + " , " + P.getY());


    }

}
