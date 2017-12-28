package  Threads;

import java.util.Random;

public class PrintLowerCaseString implements  Runnable {

    String array[] = {"vikash","singh","ironman"};

        @Override
        public  void run()
        {
            Random random = new Random();

            int i = 0;

            while(i< 20) {
                System.out.println("Thread A  " +array[random.nextInt(array.length)].toLowerCase());
                i++;


                try
                {
                    Thread.sleep(1000);
                }
                catch(InterruptedException e)
                {

                }

            }




        }
}
