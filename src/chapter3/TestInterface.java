package chapter3;

/**

 Class implementing two interface having same method print

 *
 */


interface  MyInterface
{
    double  PI = 3.14;

    void print();

}


interface MyInterface2
{
    double PI = 3.15;

    void print();
}

class MyClass implements MyInterface , MyInterface2
{
    @Override
    public void print()
    {
        System.out.println(MyInterface.PI);
    }

//    @Override
//    public void helloName(int i) {
//        System.out.println("VS");
//    }
}


public class TestInterface{



    public static void main(String args[])
    {
        MyClass my = new MyClass();
        my.print();


    }

}
