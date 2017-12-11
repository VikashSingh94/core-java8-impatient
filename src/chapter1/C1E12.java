package chapter1;

import java.util.ArrayList;
import java.util.Random;
import java.util.Arrays;

public class C1E12 {

    private static int[] printLottery() {
        ArrayList<Integer> array = new ArrayList<>();

        for (int i = 0; i < 50; i++) {
            array.add(i + 1);
        }

        int max = 50, number = 6;
        int index;

        //create instance of random class
        Random rand = new Random();

        int lotteryList[] = new int[6];

        //printing the 6 lottery numbers
        for (int i = 0; i < number; i++) {
            index = rand.nextInt(max);
            lotteryList[i] = index + 1;
            array.remove(index);
        }

        return lotteryList;

    }

    public static void main(String args[]) {
        int lotteryList[] = printLottery();
        //sorting the sequence
        Arrays.sort(lotteryList);
        //printing the lottery combination list
        System.out.println(Arrays.toString(lotteryList));

    }
}
