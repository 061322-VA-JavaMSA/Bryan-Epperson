package com.revature;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.revature.exception.dividedByZeroException;
import com.revature.exception.number10Exception;

public class CalculatorTest {

	private static Calculator sut;
	
	/*
	 * JUnit 5
	 * 	- @BeforeAll
	 *  - @BeforeEach
	 *  - @AfterAll
	 *  - @AfterEach
	 *  
	 *  - @Test
	 *  - @Ignore
	 *  - @Order
	 */
	
	// Used to set up the test
	@BeforeAll
	public static void setUp() {
		sut = new Calculator();
	}
	
	@AfterAll
	public static void tearDown() {
		System.out.println("Tear down behavior.");
	}
	
	@BeforeEach
	public void before() {
		System.out.println("@Before each behavior");
	}
	
	
	
	@Test
	public void addFiveAndFive() {
		
		
		assertThrows(number10Exception.class, () -> sut.add(5, 5));
	}
	
	@Test
	public void subSixAndTwo() {
		int expected = 4;
		int actual = sut.subtract(6, 2);
		assertEquals(expected, actual);
	}
	
	@Test
	public void divideTwentyFourbyTweleve() { // this should purposely fail
		int expected = 2; 
		int actual = sut.division(24, 12);
		assertEquals(expected, actual);
	}
	@Test
	public void divideByZero() { // this should purposely fail
//		int expected = 0; 
//		int actual = sut.division(12, 0);
		assertThrows(dividedByZeroException.class, () -> sut.division(12, 0));
	}	
	@Test
	public void sumationToTen() {
		int expected = 10;
		int actual = sut.sumOfAnArray(new int[] {6,2,1,1});
		assertEquals(expected, actual);
	}

	}