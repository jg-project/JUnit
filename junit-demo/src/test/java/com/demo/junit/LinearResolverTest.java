package com.demo.junit;

import org.junit.Before;
import org.junit.Test;

import static com.demo.junit.PolynomResolver.DEFAULT_DELTA;
import static org.junit.Assert.assertArrayEquals;

public class LinearResolverTest {

    private LinearResolver resolver;

    @Before
    public void setUp() {
        resolver = new LinearResolver();
    }

    @Test
    public void shouldReturnEmptyResultWhenNoRoots() {

        double[] actual = resolver.resolve(new double[]{0, 1});

        assertArrayEquals(new double[0], actual, DEFAULT_DELTA);
    }

    @Test
    public void shouldReturnEmptyResultWhenNumberOfParametersIsNotEqualToTwo() {
        double[] actual = resolver.resolve(new double[]{});

        assertArrayEquals(new double[0], actual, DEFAULT_DELTA);

        actual = resolver.resolve(new double[]{1});

        assertArrayEquals(new double[0], actual, DEFAULT_DELTA);

        actual = resolver.resolve(new double[]{1, 2, 3});

        assertArrayEquals(new double[0], actual, DEFAULT_DELTA);
    }

    @Test
    public void shouldCorretlyFindRoot() {
        double[] actual = resolver.resolve(new double[]{2, 5});
        assertArrayEquals(new double[]{-2.5}, actual, DEFAULT_DELTA);
    }

}