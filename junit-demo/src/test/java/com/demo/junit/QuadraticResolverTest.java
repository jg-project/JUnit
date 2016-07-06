package com.demo.junit;

import org.junit.Before;
import org.junit.Test;

import static com.demo.junit.PolynomResolver.DEFAULT_DELTA;
import static org.junit.Assert.assertArrayEquals;

public class QuadraticResolverTest {

    private QuadraticResolver resolver;

    @Before
    public void setUp() {
        resolver = new QuadraticResolver();
    }

    @Test
    public void shouldReturnEmptyResultWhenNoRoots() {

        double[] actual = resolver.resolve(new double[]{1, 2, 9});

        assertArrayEquals(new double[0], actual, DEFAULT_DELTA);
    }

    @Test
    public void shouldReturnEmptyResultWhenNumberOfParametersIsNotEqualToThree() {
        double[] actual = resolver.resolve(new double[]{});

        assertArrayEquals(new double[0], actual, DEFAULT_DELTA);

        actual = resolver.resolve(new double[]{1});

        assertArrayEquals(new double[0], actual, DEFAULT_DELTA);

        actual = resolver.resolve(new double[]{1, 2});

        assertArrayEquals(new double[0], actual, DEFAULT_DELTA);

        actual = resolver.resolve(new double[]{1, 2, 3, 4});

        assertArrayEquals(new double[0], actual, DEFAULT_DELTA);
    }

    @Test
    public void shouldCorretlyFindDifferentRoots() {
        double[] actual = resolver.resolve(new double[]{1, -5, 6});
        assertArrayEquals(new double[]{2, 3}, actual, DEFAULT_DELTA);
    }

    @Test
    public void shouldCorretlyFindTwoEqualRoot() {
        double[] actual = resolver.resolve(new double[]{1, -6, 9});
        assertArrayEquals(new double[]{3, 3}, actual, DEFAULT_DELTA);
    }
}