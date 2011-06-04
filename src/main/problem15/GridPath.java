package problem15;

import static java.math.BigInteger.ONE;
import static java.math.BigInteger.valueOf;

import java.math.BigInteger;

public class GridPath {
	public static BigInteger paths(int size) {
		return factorial(size*2).divide(factorial(size).pow(2));
	}

	private static BigInteger factorial(int factorial) {
		BigInteger product = ONE;
		for(int i = 0; i < factorial; i++)
			product = product.multiply(valueOf(factorial-i));

		return product;
	}

}
