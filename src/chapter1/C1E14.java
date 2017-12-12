/**
 Write a program that reads a two-dimensional array of integers and determines whether it is a
 magic square (that is, whether the sum of all rows, all columns, and the diagonals is the same).
 Accept lines of input that you break up into individual integers, and stop when the user enters a
 blank line. For example, with the input

 16 3 2 13
 3 10 11 8
 9 6 7 12
 4 15 14 1
 (Blank line)

 your program should respond affirmatively.

 **/

package chapter1;

import java.io.*;


public class C1E14 {


    public static  void main(String args[]) throws IOException
    {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String line = "";

        int  multiDimension[][]={{0}};

        line = br.readLine(); //reading the first line

        if(line != null)
        {
            String array[] = line.split("\\s+");

            //no of Rows and Col are known after the first line is read

            multiDimension = new int[array.length][array.length];

            for(int i = 0;i< array.length;i++)
            {
                multiDimension[0][i] = Integer.parseInt(array[i]);
            }

            int row = 1;

            //Read line until the user enter the blank line
            while ((line = br.readLine()) != null && (!line.equals("")))
            {

                String temp[] = line.split("\\s+");

                for(int j = 0;j< temp.length;j++) //loop for column accessing
                {
                    multiDimension[row][j] = Integer.parseInt(temp[j]);
                }

                row++;
            }

        }

        magicSquare(multiDimension);  //checking the magic box


    }

    private static void  magicSquare(int multiDimension[][])
    {
        int rowSum  ,colSum  ,leftDiagonalSum = 0 , rightDiagonalSum = 0 ;

        //calculate the left diagonal sum

        for(int i= 0 ;i< multiDimension.length;i++)
            leftDiagonalSum += multiDimension[i][i];

        boolean flag = true;

        //check each row column
        for(int i=0 ; i < multiDimension.length; i++ )
        {
             rowSum = 0 ;
             colSum = 0;

            for(int j=0 ;j < multiDimension[i].length; j++)
            {
                rowSum += multiDimension[i][j];
                colSum += multiDimension[j][i];

                if((i+j) == multiDimension.length -1)
                    rightDiagonalSum += multiDimension[i][j];
            }

            if( (rowSum != leftDiagonalSum) || (colSum != leftDiagonalSum))
            {
                flag = false;
                break;
            }
        }

        if(rightDiagonalSum != leftDiagonalSum)
            flag = false;



        if(flag)
            System.out.println("magic square");
        else
            System.out.println("Not magic box");
    }
}
