package problem23;

import java.util.ArrayList;
import java.util.List;

import common.CommonDivisors;

public class AbundantNumber {
	private static final int MIN = 12;
	private static final CommonDivisors divisors = new CommonDivisors();

	public List<Integer> abundantsBelow(int cap) {
		List<Integer> nums = new ArrayList<Integer>();
		for(int num = MIN; num < cap; num ++){
			if(isAbundant(num)){
				nums.add(num);
			}
		}
		return nums;
	}

	private boolean isAbundant(int num) {
		int sum = 0;
		for(Integer div: divisors.common(num)){
			sum += div.intValue();
		}
		return sum > num;
	}

}
