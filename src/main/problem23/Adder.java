package problem23;

import java.util.List;

public class Adder {

	public int sumOfNonAbundantResultantsBelow(int cap) {
		int sum = 0;
		for (int val : notFromAbundantNumber(cap)) {
			sum += val;
		}
		return sum;
	}

	public int[] notFromAbundantNumber(int cap) {
		int[] numbers = numbers(cap-1);
		List<Integer> abundants = new AbundantNumber()
				.abundantsBelow(cap);
		for (Integer abundant : abundants) {
			zeroAbundantSums(numbers, abundants, abundant.intValue());
		}
		return numbers;
	}

	private void zeroAbundantSums(int[] numbers, List<Integer> abundants,
			int abundant) {
		for (int pos = 0; pos < abundants.size(); pos++) {
			zeroSum(numbers, abundant + abundants.get(pos));
		}
	}

	private void zeroSum(int[] numbers, int sum) {
		if (sum <= numbers.length) {
			numbers[sum - 1] = 0;
		}
	}

	private int[] numbers(int cap) {
		int[] numbers = new int[cap];
		for (int position = 0; position < cap; position++) {
			numbers[position] = position + 1;
		}
		return numbers;
	}
}
