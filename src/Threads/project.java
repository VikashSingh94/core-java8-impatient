
package Threads;

public class project {

    String array[] = {"vikash","singh","ironman"};


    public static  void main(String args[])
    {


        Runnable lower = new PrintLowerCaseString();
        Runnable upper = new PrintUpperCaseString();

        new Thread(lower).start();
        new Thread(upper).start();
    }
}


