package common;

import static java.math.BigInteger.valueOf;

import java.math.BigInteger;

public class Factorial {
	public static BigInteger factorial(final int factorial) {
		if(factorial == 0){
			return BigInteger.ONE;
		}
		return factorial(factorial, valueOf(factorial));
	}

	private static BigInteger factorial(final int factorial, final BigInteger result) {
		if(factorial == 1){
			return result;
		}
		return factorial(factorial-1, result.multiply(valueOf(factorial-1)));
	}


}
