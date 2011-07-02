package problem29;

import static java.math.BigInteger.valueOf;

import java.math.BigInteger;
import java.util.HashSet;
import java.util.Set;

public class DistinctCombinations {

	public Set<BigInteger> distinct(int a, int b) {
		Set<BigInteger> distinct = new HashSet<BigInteger>();
		for(int i = a; i <= b; i++){
			BigInteger base = valueOf(i);
			for(int j = a; j <= b; j++){
				distinct.add(base.pow(j));
			}
		}
		return distinct;
	}
}
