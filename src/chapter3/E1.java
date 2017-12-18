package chapter3;

interface Measurable
{
    double getMeasure();
}

class Employee implements Measurable
{
    double salary;

    public Employee(double salary)
    {
        this.salary = salary;
    }
    public double getMeasure()
    {
        return  this.salary;
    }

    public double average(Measurable [] array)
    {
        double average = 0.0;

        for(Measurable  i : array)
        {
            average += i.getMeasure();
        }
        return (average / array.length);
    }
}

public class E1 {

    public static void main()
    {
        Measurable  array[] = new Employee[5];

        array[0] = new Employee(25.0);
        array[1] = new Employee(20.0);
        array[2] = new Employee(15.0);
        array[3] = new Employee(20.0);


    }


}
