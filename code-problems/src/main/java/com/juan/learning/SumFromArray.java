package com.juan.learning;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Given a list of numbers and a number k, return whether any two numbers from the list add up to k.
 * For example, given [10, 15, 3, 7] and k of 17, return true since 10 + 7 is 17.
 */

public class SumFromArray {

    public static void main (String...args) {
        int[] numbers = new int[]{2, 15, 8, 7};
        System.out.println("The response is " + SumFromArray.existsSumOnArray_v3(numbers, 9));
    }

    /**
     * first version
     * @param numbers
     * @param numTarget
     * @return
     */
    static boolean existsSumOnArray_v1(int[] numbers, int numTarget) {
        for(int i=0 ; i < numbers.length; i++) {
            for(int j = i + 1 ; j < numbers.length; j++) {
                if(numbers[i] + numbers[j] == numTarget ){
                    return Boolean.TRUE;
                }

            }
        }
        return Boolean.FALSE;
    }

    /**
     * Second version
     * @param numbers
     * @param numTarget
     * @return
     */
    static boolean existsSumOnArray_v2 (int[] numbers, int numTarget) {
        Arrays.sort(numbers);
        for(int i = 0, j = numbers.length -1 ; i < j;) {
            int sum = numbers[i] + numbers[j];
            if(sum < numTarget) {
                i++;
            }else if (sum > numTarget) {
                j--;
            }
            else {
                return true;
            }
        }
        return false;
    }

    /**
     * Third version
     * @param nums
     * @param numTarget
     * @return
     */
    static boolean existsSumOnArray_v3(int[] nums, int numTarget) {
        if(nums.length == 0 || nums == null) return false;

        Map<Integer, Integer> complementMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int curr = nums[i];
            if(complementMap.containsKey(numTarget - curr)){
                return true;
            }
            complementMap.put(curr, i);
        }
        return false;
    }
}


