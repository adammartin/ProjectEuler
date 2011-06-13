package problem20;

import static java.lang.Character.digit;

import common.Factorial;

public class FactorialSums {
	
	public static int sumOfDigits(int factorial) {
		int intValue = 0;
		for(char digit:Factorial.factorial(factorial).toString().toCharArray()){
			intValue += digit(digit, 10);
		}
		return intValue;
	}
}
