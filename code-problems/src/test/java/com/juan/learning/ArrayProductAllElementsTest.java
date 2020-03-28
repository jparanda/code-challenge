package com.juan.learning;

import org.junit.Assert;
import org.junit.Test;

public class ArrayProductAllElementsTest {

    @Test
    public void productAllArrayNumbers_test1() {
        int[] numbers = new int[] {1, 2, 3, 4, 5};
        Assert.assertArrayEquals(ArrayProductAllElements.productAllArrayNumbers_v1(numbers),
                new int[]{120, 60, 40, 30, 24});
    }

    @Test
    public void productAllArrayNumbers_test2() {
        int[] numbers = new int[] {3, 2, 1};
        Assert.assertArrayEquals(ArrayProductAllElements.productAllArrayNumbers_v1(numbers),
                new int[]{2, 3, 6});
    }

}