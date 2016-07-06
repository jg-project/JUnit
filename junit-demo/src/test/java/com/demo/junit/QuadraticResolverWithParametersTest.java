package com.demo.junit;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class QuadraticResolverWithParametersTest {

    private QuadraticResolver resolver;

    private double[] coefficients;

    private double[] roots;

    public QuadraticResolverWithParametersTest(double a, double b, double c, double x1, double x2) {
        this.coefficients = new double[]{a, b, c};
        this.roots = new double[]{x1, x2};
        this.resolver = new QuadraticResolver();
    }

    @Parameters
    public static Collection params() {
        return Arrays.asList(new Double[][]{
                {1., -5., 6., 2., 3.},
                {1., -6., 9., 3., 3.},
        });
    }

    @Test
    public void shouldCorrectlyResolveRoots() {
        assertArrayEquals(roots, resolver.resolve(coefficients), PolynomResolver.DEFAULT_DELTA);
    }
}