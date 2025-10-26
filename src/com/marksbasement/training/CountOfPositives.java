package com.marksbasement.training;

import java.util.Arrays;

/**
 * @author Mark Dyrhaug
 * @since 10/26/2025
 * Codewars URL:  https://www.codewars.com/kata/576bb71bbbcf0951d5000044
 */

public class CountOfPositives {

    public static void main(String[] args)  {

        final int[] input = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14, -15};
        int[] output = processInput(input);
        System.out.println(Arrays.toString(output));
    }

    /**
     * Process the input.
     * Count the Positives and sum the negatives.
     * @return int[count, sum] or int[0] for input error.
     */
    private static int[] processInput(int[] input) {
        int[] outputArray = {0,0};

        if (input == null || (input.length == 0)) {
            outputArray = new int[0];
        } else {
            for (int x : input) {
                if (x > 0)
                    outputArray[0] =outputArray[0] + 1;
                else if (x < 0)
                    outputArray[1] =outputArray[1] + x;
            }
        }

        return outputArray;
    }

}