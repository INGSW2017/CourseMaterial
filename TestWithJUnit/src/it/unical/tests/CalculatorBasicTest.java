package it.unical.tests;

import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import it.unical.bussinesslogic.Calculator;

public class CalculatorBasicTest {
	
	private static Calculator calculator;

	@BeforeClass
	public static void inizializzazione() {
		System.out.println("before class");
		calculator = new Calculator();
	}
	
	@Before
	public void primaDiOgniTest() {
		System.out.println("before");
	}
	
	@Test(timeout=1000)
	public void multiplicationWorks() {
		System.out.println("performing multiplication test");
		
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		Assert.assertEquals(10, calculator.multiply(5, 2));
		
	}
	
	@Test
	public void additionTest() {
		System.out.println("performing addition test");
		Assert.assertEquals(9, calculator.add(6, 3));
		Assert.assertEquals(5, calculator.add(2, 3));
	}
	
	@Test(expected=ArithmeticException.class)
	public void divisionTest() {
		System.out.println("performing divition test");
		calculator.division(10, 0);
	}
	
}
