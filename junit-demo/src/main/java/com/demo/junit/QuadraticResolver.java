package com.demo.junit;

public class QuadraticResolver implements PolynomResolver {

    private final double delta;

    public QuadraticResolver(double delta) {
        this.delta = Math.abs(delta);
    }

    public QuadraticResolver() {
        delta = DEFAULT_DELTA;
    }


    @Override
    public double[] resolve(double[] params) {
        if (params.length == 3) {
            double a = params[0];
            double b = params[1];
            double c = params[2];

            if (a > delta) {
                double D = b * b - 4 * a * c;

                if (D < 0) {
                    return new double[0];
                }
                if (Math.abs(D) < delta) {
                    return new double[]{-b / (2 * a), -b / (2 * a)};
                }
                return new double[]{(-b - Math.sqrt(D)) / 2 * a, (-b + Math.sqrt(D)) / 2 * a};
            }
        }
        return new double[0];
    }
}
