package problem13;

import java.math.BigInteger;
import java.util.List;

public class BigNumber {

	public static String sums(List<BigInteger> values, int digits) {
		BigInteger sum = BigInteger.ZERO;
		for(BigInteger value:values){
			sum = sum.add(value);
		}
		return sum.toString().substring(0, digits);
	}

}
