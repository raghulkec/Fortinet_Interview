package com.companyraghul;

import java.util.Scanner;

public class MultiDimensionArray {

    public static Long getValue(int... indexofDimension) {
        int[][][][] arr = new int[2][2][2][2];

        arr[0][0][0][0] = 1;
        arr[0][0][0][1] = 1;
        arr[0][0][1][0] = 1;
        arr[0][0][1][1] = 1;
        arr[0][1][0][0] = 2;
        arr[0][1][0][1] = 1;
        arr[0][1][1][0] = 1;
        arr[0][1][1][1] = 1;
        arr[1][0][0][0] = 1;
        arr[1][0][0][1] = 1;
        arr[1][0][1][0] = 1;
        arr[1][0][1][1] = 1;
        arr[1][1][0][0] = 1;
        arr[1][1][0][1] = 1;
        arr[1][1][1][0] = 1;
        arr[1][1][1][1] = 1;

        return (long) 1;
    }

    public static void main(String[] args) {

        int[] t = { 2, 2, 2, 2 };
     MultiDimensionArray mArray = new MultiDimensionArray();
        MultiDimensionArray.sum(mArray, t);
    }

    public static long sum(MultiDimensionArray mArray, int[] lengthofDimension) {
        long sum = 0;

        int[] n = new int[lengthofDimension.length];

        int index = 0;
        while (true) {
            sum += mArray.getValue(n);
            n[0]++;

            // Carry
            while (n[index] == lengthofDimension[index]) {
                // Overflow, we're done
                if (index == lengthofDimension.length - 1) {
                    //System.out.print(sum);
                    return sum;
                }

                n[index++] = 0;
                n[index]++;
            }

            index = 0;
        }

    }


}

// Time Complexity  is   O(n^2)
// Space Complexitiy is  O(1)
