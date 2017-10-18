package it.unical.tests;

import org.junit.Assert;
import org.junit.Test;

import it.unical.bussinesslogic.Calculator;

public class CalculatorAdvancedTest {

	@Test
	public void advancedMultiplicationTest() {
		System.out.println("performing an advanced test");
		Calculator calculator = new Calculator();
		Assert.assertEquals(1000000, calculator.multiply(1000, 1000));
	}
}
