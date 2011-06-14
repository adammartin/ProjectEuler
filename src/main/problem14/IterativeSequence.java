package problem14;

import static java.math.BigInteger.ONE;
import static java.math.BigInteger.ZERO;
import static java.math.BigInteger.valueOf;

import java.math.BigInteger;

import common.CrudeCache;

public class IterativeSequence {

	private static final BigInteger TWO = BigInteger.valueOf(2);
	private static final BigInteger THREE = BigInteger.valueOf(3);
	private static final CrudeCache<BigInteger, Integer> CACHE = new CrudeCache<BigInteger, Integer>(2500);

	public int longestChainUnder(int max) {
		Tuple currentMax = new Tuple(2, 2);
		for(int count = oddValue(max-1); count >= countStart(max); count-=2){
			Tuple currentValue = new Tuple(count, chainFor(count));
			currentMax = currentMax.count > currentValue.count ? currentMax : currentValue;
		}
		return currentMax.value;
	}

	public int chainFor(final int start) {
		return chainCount(valueOf(start));
	}

	private int chainCount(final BigInteger start) {
		Integer cachedCount = CACHE.get(start);
		if(cachedCount != null){
			return cachedCount.intValue();
		} else {
			int count = start.equals(ONE) ? 1 : chainCount(reduce(start)) + 1;
			CACHE.add(start, count);
			return count;
		}
	}
	
	private BigInteger reduce(final BigInteger value) {
		return isEven(value) ? reduceEven(value) : reduceOdd(value);
	}

	private boolean isEven(final BigInteger value) {
		return value.mod(TWO).compareTo(ZERO) == 0;
	}
	
	private BigInteger reduceEven(final BigInteger value) {
		return value.divide(TWO);
	}
	
	private BigInteger reduceOdd(final BigInteger value) {
		return value.multiply(THREE).add(ONE);
	}

	private int countStart(int max) {
		return max > 3 ? oddValue(max/3*2) : max;
	}

	private int oddValue(int value) {
		return value % 2 == 0 ? value - 1 : value;
	}
	
	private class Tuple {
		private final int value;
		private final int count;

		private Tuple(int value, int count){
			this.value = value;
			this.count = count;
		}
	}
}
