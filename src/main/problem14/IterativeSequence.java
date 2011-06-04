package problem14;

import static java.math.BigInteger.ONE;
import static java.math.BigInteger.ZERO;

import java.math.BigInteger;

public class IterativeSequence {

	private static final BigInteger TWO = BigInteger.valueOf(2);
	private static final BigInteger THREE = BigInteger.valueOf(3);

	public int longestChainUnder(int max) {
		Tuple currentMax = new Tuple(2, 2);
		for(int count = countStart(max); count < max; count+=2){
			Tuple currentValue = new Tuple(count, chainFor(count));
			currentMax = currentMax.count > currentValue.count ? currentMax : currentValue;
		}
		return currentMax.value;
	}

	public int chainFor(final int start) {
		int count = 1;
		BigInteger value = BigInteger.valueOf(start);
		while(value.compareTo(ONE) > 0) {
			count++;
			value = reduce(value);
		}
		return count;
	}

	private BigInteger reduce(final BigInteger start) {
		if(start.mod(TWO).compareTo(ZERO) == 0){
			return start.divide(TWO);
		}
		return start.multiply(THREE).add(ONE);
	}
	
	private int countStart(int max) {
		if(max > 3){
			int countStart = max/3*2;
			return countStart % 2 == 0 ? countStart + 1 : countStart;
		}
		return max;
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
