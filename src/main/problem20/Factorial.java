package problem20;

import static java.lang.Character.digit;
import static java.math.BigInteger.valueOf;

import java.math.BigInteger;

public class Factorial {
	
	public static int sumOfDigits(int factorial) {
		int intValue = 0;
		for(char digit:factorial(factorial).toString().toCharArray()){
			intValue += digit(digit, 10);
		}
		return intValue;
	}

	public static BigInteger factorial(final int factorial) {
		return factorial(factorial, valueOf(factorial));
	}

	private static BigInteger factorial(final int factorial, final BigInteger result) {
		if(factorial == 1){
			return result;
		}
		return factorial(factorial-1, result.multiply(valueOf(factorial-1)));
	}

}
