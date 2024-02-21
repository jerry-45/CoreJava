package com.edubridge.junitdemo;

import static org.junit.Assume.assumeTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;

class JUnitAssumptionDemo {

	@Test
	void test() {
		System.setProperty("Atul", "Atul");
		Assumptions.assumeTrue("Atul".equals(System.getProperty("Athul")));
	}
	
	@Test
	void testOne() {
		System.setProperty("Atul", "Atul");
		Assumptions.assumeFalse("Atul".equals(System.getProperty("Atul")));
	}
}
