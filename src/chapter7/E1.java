/**
 *
 *
 * Implement the “Sieve of Erathostenes” algorithm to determine all prime numbers ≤ n. Add all
   numbers from 2 to n to a set
 *
 * @author Vikash Singh
 * @date   26/12/17
 *
 */



package chapter7;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class E1 {

    public static HashSet<Integer> sieveOfErathostenes(int n)
    {

        Integer prime[] = new Integer[n+1];
        Arrays.fill(prime , 1);
        int temp;

        prime[0] = 0;
        prime[1] = 0;

        for(int i = 2;i < n;i++)
        {
            int j = 2;

            while(  (temp = (i*j)) <=n )
            {
                prime[temp] = 0;
                j++;
            }
        }

        // adding the prime no into the HashSet

        HashSet<Integer> hashSet = new HashSet<Integer>();

        for(int i=0 ;i<n;i++)
            if(prime[i] == 1)
                hashSet.add(i);

        return hashSet;
    }

    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        HashSet<Integer> prime = sieveOfErathostenes(n);



    }
}
