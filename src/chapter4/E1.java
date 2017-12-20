package chapter4;

/**
 * Define a class Point with a constructor public Point(double x, double y) and
 accessor methods getX, getY. Define a subclass LabeledPoint with a constructor
 public LabeledPoint(String label, double x, double y) and an
 accessor method getLabel.
 *
 */

class  Point
{
    private double x;
    private double y;


    public  Point(double x , double y)
    {
        this.x = x;
        this.y = y;
    }

    public double getX()
    {
        return this.x;
    }

    public double getY()
    {
        return  this.y;
    }
}

class LabeledPoint extends  Point
{
    String label;

    public LabeledPoint(String label , double x, double y)
    {
        super(x, y);
        this.label = label;
    }

    public String getLabel() {
        return label;
    }
}


public class E1 {

    public static  void  main(String args[])
    {
        Point point = new LabeledPoint("vikash",10.0,20.0);
        System.out.println(point.getX() + " " + point.getY());

    }
}
