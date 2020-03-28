package com.juan.learning;

import org.junit.Assert;
import org.junit.Test;

public class SumFromArrayTest {

    @Test
    public void existsSumOnArray_v1_response_true() {
        int[] numbers = new int[]{2, 15, 8, 7};
        int number = 23;
        Boolean response = SumFromArray.existsSumOnArray_v1(numbers, number);
        Assert.assertTrue(response);
    }

    @Test
    public void existsSumOnArray_v1_response_false() {
        int[] numbers = new int[]{2, 15, 8, 7};
        int number = 20;
        Boolean response = SumFromArray.existsSumOnArray_v1(numbers, number);
        Assert.assertFalse(response);
    }

    @Test
    public void existsSumOnArray_v2_response_true() {
        int[] numbers = new int[]{2, 15, 8, 7};
        int number = 23;
        Boolean response = SumFromArray.existsSumOnArray_v2(numbers, number);
        Assert.assertTrue(response);
    }

    @Test
    public void existsSumOnArray_v2_response_false() {
        int[] numbers = new int[]{2, 15, 8, 7};
        int number = 20;
        Boolean response = SumFromArray.existsSumOnArray_v2(numbers, number);
        Assert.assertFalse(response);
    }

    @Test
    public void existsSumOnArray_v3_response_true() {
        int[] numbers = new int[]{2, 15, 8, 7};
        int number = 20;
        Boolean response = SumFromArray.existsSumOnArray_v3(numbers, number);
        Assert.assertFalse(response);
    }

    @Test
    public void existsSumOnArray_v3_response_false() {
        int[] numbers = new int[]{2, 15, 8, 7};
        int number = 20;
        Boolean response = SumFromArray.existsSumOnArray_v3(numbers, number);
        Assert.assertFalse(response);
    }

}