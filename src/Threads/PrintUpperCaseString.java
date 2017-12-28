package  Threads;


import java.util.Random;

public class PrintUpperCaseString implements Runnable{


    String array[] = {"vikash","singh","ironman"};

    @Override
    public  void run()
    {
        Random random = new Random();

        int i = 0;

        while(i< 20) {
            System.out.println("Thread B  "+ array[random.nextInt(array.length)].toUpperCase());
            i++;

            try
            {
                Thread.sleep(2000);
            }
            catch(InterruptedException e)
            {

            }
        }

    }

}
