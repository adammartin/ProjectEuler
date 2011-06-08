package problem21;

import java.util.ArrayList;
import java.util.List;

import common.CommonDivisors;

public class Amicable {

	public List<Integer> under(int max) {
		List<Integer> result = new ArrayList<Integer>();
		for(int i = 10; i < max; i++){
			int amicable = divisors(i);
			if(isAmicablePair(i, amicable)  && amicable < max ){
				result.add(i);
			}
		}
		return result;
	}

	private boolean isAmicablePair(int value, int amicable) {
		return value == divisors(amicable) && amicable != value;
	}

	private int divisors(int value) {
		int sum = 0;
		CommonDivisors divisor = new CommonDivisors();
		for(Integer div:divisor.common(value)){
			sum += div.intValue();
		}
		return sum;
	}

}
