package common;

import static java.lang.Integer.valueOf;
import static java.math.BigInteger.ONE;

import java.math.BigInteger;

public class Fibonacci {
	private final static CrudeCache<Integer, BigInteger> CACHE = new CrudeCache<Integer, BigInteger>(2500);

	public static BigInteger sequence(int base) {
		if(CACHE.get(valueOf(base)) != null){
			return CACHE.get(valueOf(base));
		}
		if(base > 2) {
			BigInteger local = sequence(base-1).add(sequence(base-2));
			CACHE.add(base, local);
			return local;
		}
		return ONE;
	}

}
