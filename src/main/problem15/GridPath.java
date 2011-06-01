package problem15;

import java.math.BigInteger;

public class GridPath {
	public static BigInteger paths(int size) {
		return factorial(size*2).divide(factorial(size).pow(2));
	}

	private static BigInteger factorial(int factorial) {
		BigInteger product = BigInteger.ONE;
		for(int i = 0; i < factorial; i++)
			product = product.multiply(BigInteger.valueOf(factorial-i));

		return product;
	}

}
