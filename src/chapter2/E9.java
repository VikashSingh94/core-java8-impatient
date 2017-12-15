
/**
 Implement a class Car that models a car traveling along the x-axis, consuming gas as it moves.
 Provide methods to drive by a given number of miles, to add a given number of gallons to the
 gas tank, and to get the current distance from the origin and fuel level. Specify the fuel
 efficiency (in miles/gallons) in the constructor. Should this be an immutable class? Why or why
 not?
 *
 */

package chapter2;


public class E9 {



    public static void main(String  args[])
    {
        Car c = new Car(1.0);
        c.addGallons(10.0);
        c.drive(9);
        System.out.println("Distance form the origin is  " + c.getDistance());
        System.out.println("fuel present in car is " + c.getGallons());
    }

    //mutable class because the distance and fuel changes with respect to time
    static class Car
    {
        private final double mpg;
        private double gallons;
        private double distance;

        public Car(double mpg)
        {
            this.mpg = mpg;
            distance = 0.0;
            gallons =  0.0;
        }
        public void addGallons(double gallons)
        {
            this.gallons += gallons;
        }

        public void drive(double miles)
        {

            double fuelRequired = miles / mpg;
            if(fuelRequired <=  this.gallons)
            {
                this.gallons -= fuelRequired;
                distance     += miles;
            }

        }

        public double getGallons()
        {
            return this.gallons;
        }

        public double getDistance()
        {
            return this.distance;
        }

    }
}
