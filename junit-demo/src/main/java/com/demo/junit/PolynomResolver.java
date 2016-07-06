package com.demo.junit;

public interface PolynomResolver {

    double DEFAULT_DELTA = 0.000_001;

    /**
     * @param params values of parameters before Unknowns in equations
     * @return empty array if no roots, roots otherwise
     */
    double[] resolve(double[] params);
}
