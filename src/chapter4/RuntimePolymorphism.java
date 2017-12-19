package chapter4;

/**
 Implementing the runtime polymorphism
 *
 */
class Employee
{
    private String name;
    private double salary;


    public Employee()
    {
        name = "";
        salary = 0.0;

    }

    public Employee(String name , double salary)
    {
        this.name = name;
        this.salary = salary;
    }

    public double getSalary()
    {
        return this.salary;
    }
    public String getName()
    {
        return name;
    }

}

class Manager extends  Employee
{
    private double bonus;

    public Manager()
    {
        bonus = 0.0;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public double getSalary()
    {
        return super.getSalary() + bonus;
    }

}

public class RuntimePolymorphism {

    public static void main(String args[])
    {
        Employee emp = new Manager();
        emp.getSalary();

        //parent class object cannot access the child method which are not Override
        //emp.setBonus(10.0);

    }
}
