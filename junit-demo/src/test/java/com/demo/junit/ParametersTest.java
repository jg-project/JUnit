package com.demo.junit;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;
import static org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class ParametersTest {

    private double expected;
    private double first;
    private double second;

    public ParametersTest(double expectedResult, double firstNumber, double secondNumber) {
        this.expected = expectedResult;
        this.first = firstNumber;
        this.second = secondNumber;
    }

    @Parameters
    public static Collection addedNumbers() {
        return Arrays.asList(new Double[][]{
                {3., 1., 2.},
                {5., 2., 3.},
                {7., 3., 4.},
                {9., 4., 5.},
        });
    }

    @Test
    public void sum() {
        System.out.println("Addition with parameters : " + first + " and "
                + second);
        assertEquals(expected, first + second, 0.000001);
    }
}
