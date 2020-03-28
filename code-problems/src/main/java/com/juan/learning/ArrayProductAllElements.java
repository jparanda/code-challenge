package com.juan.learning;

import java.util.Arrays;

/**
 * Given an array of integers, return a new array such that each element at index i of the new array is the product
 * of all the numbers in the original array except the one at i.
 * For example 1, if our input was [1, 2, 3, 4, 5], the expected output would be [120, 60, 40, 30, 24].
 * Example 2, If our input was [3, 2, 1], the expected output would be [2, 3, 6]
 */
public class ArrayProductAllElements {

    public static void main(String...args) {
        int[] numbers = new int[]{1, 2, 3, 4, 5};
        int[] response = ArrayProductAllElements.productAllArrayNumbers_v1(numbers);
        System.out.println(Arrays.toString(response));
    }

    /**
     * First approach
     * @param numbers
     * @return
     */
    static int[] productAllArrayNumbers_v1(int[] numbers) {
        int[] newArray = new int[numbers.length];
        int tempProduct = 1;
        for (int i = 0 ; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                tempProduct = tempProduct * numbers[j];
            }
            for (int x = 0 ; x < i ; x++) {
                tempProduct = tempProduct * numbers[x];
            }
            newArray[i] = tempProduct;
            tempProduct = 1;
        }
        return newArray;
   }

    /**
     * Second approach
     */
    static int[] productAllArrayNumbers_v2() {
        return null;
    }
}
