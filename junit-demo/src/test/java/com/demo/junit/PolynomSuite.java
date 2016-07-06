package com.demo.junit;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({LinearResolverTest.class, QuadraticResolverTest.class})
public class PolynomSuite {
}
