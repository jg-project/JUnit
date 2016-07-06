package com.demo.junit;

/**
 * Resolves equation in form aX+b=0
 */
public class LinearResolver implements PolynomResolver {

    private final double delta;

    public LinearResolver(double delta) {
        this.delta = Math.abs(delta);
    }

    public LinearResolver() {
        delta = DEFAULT_DELTA;
    }

    @Override
    public double[] resolve(double[] params) {
        if (params.length == 2) {
            double a = params[0];
            double b = params[1];

            if (a > delta) {
                return new double[]{-b / a};
            }
        }
        return new double[0];
    }
}
