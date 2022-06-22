/**
 * 
 */
package com.revature;

import com.revature.exception.dividedByZeroException;
import com.revature.exception.number10Exception;

/**
 * @author KevinTranHuu
 *
 */
public class Calculator {
	/*
	 * - add(int a, int b)
	 * 		- if the result is 13
	 * 			- throw an exception
	 * 				- Number13Exception
	 * - subtract
	 * - multiply
	 * - sum of an array
	 * - divide
	 * 		- throw a custom exception if divided by 0
	 */
	
	public int add(int a, int b) {
		if(a+ b == 10) {
			throw new number10Exception();
		}
		return a + b;
	}
	
	public int subtract(int a, int b) {
		if(a == 20 && b == 10) {
			throw new number10Exception();
		}
		
		return a - b;
	}
	
	public int sumOfAnArray(int[] intArr) {
		int sum = 0;
		for(int i = 0; i < intArr.length; i++) {
			sum = intArr[i] + sum;
				
		}
		return sum;
	}
	
	public int division(int a, int b) {
		int quotient;
		if(b != 0) {
			quotient = a / b; 
		}
		else {
			throw new dividedByZeroException();
		}
		
		return quotient;
	}
	
}
