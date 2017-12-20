package chapter4;

/**
 * Make the instance variables x and y of the Point class in Exercise 1 protected. Show
 that the LabeledPoint class can access these variables only in LabeledPoint instances.
 */


class  Point
{
    protected double x;
    protected double y;

    public Point()
    {
        this.x = 0.0;
        this.y = 0.0;
    }
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

    public LabeledPoint()
    {
        label = "";
        x = 0.0;
        y = 0.0;
    }
    public LabeledPoint(String label , double x, double y)
    {
        this.x = x;
        this.y = y;
        this.label = label;
    }

    public String getLabel() {
        return label;
    }
}

