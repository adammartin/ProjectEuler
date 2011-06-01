package problem12;

import java.util.HashSet;
import java.util.Set;

public class TriangleNumber {

	public static int numberOf(int divisors) {
		int sum = 1;
		if(divisors > 1)
			for(int i = 2; numberOfDivisors(sum) < divisors; i++)
				sum += i;
		
		return sum;
	}

	private static int numberOfDivisors(int sum) {
		Set<Integer> divisors = new HashSet<Integer>();
		Integer divisor = Integer.valueOf(1);

		while(!divisors.contains(divisor) && divisor.intValue() < sum){
			if(sum%divisor.intValue() == 0){
				divisors.add(divisor);
				divisors.add(Integer.valueOf(sum/divisor.intValue()));
			}
			divisor++;
		}

		return divisors.size();
	}


}
