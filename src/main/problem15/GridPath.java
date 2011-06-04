package problem15;

import static java.math.BigInteger.ONE;
import static java.math.BigInteger.valueOf;

import java.math.BigInteger;

public class GridPath {
	public static BigInteger paths(int size) {
		return factorialProduct(size*2).divide(factorialProduct(size).pow(2));
	}

	private static BigInteger factorialProduct(int cap) {
		BigInteger product = ONE;
		for(int i = 0; i < cap; i++)
			product = product.multiply(valueOf(cap-i));

		return product;
	}

}
