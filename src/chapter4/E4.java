package chapter4;


import java.util.Scanner;

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

abstract  class Shape
{
    Point point;

    public Shape()
    {

    }

    public Shape(Point point)
    {
        this.point = point;
    }

    public void moveBy(double dx , double dy)
    {
        this.point = new Point(dx + this.point.getX() , dy + this.point.getY());
    }

    abstract public  Point getCenter();

}

class Circle extends Shape
{
    Point center;
    double radius;

    public Circle(Point center , double radius)
    {
        this.center = center;
        this.radius = radius;
    }

    @Override
    public Point getCenter() {
        return center;
    }
}

public class E4 {

    Scanner in = new Scanner(System.in);
}
