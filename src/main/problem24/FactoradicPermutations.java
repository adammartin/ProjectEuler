package problem24;

import static common.Factorial.factorial;

import java.util.ArrayList;
import java.util.List;

public class FactoradicPermutations {

	public String lexicographic(final int counter, final int range) {
		return lexicongraphicValue(range + 1, factoradicDigits(counter, range));
	}

	private int[] factoradicDigits(final int counter, final int range) {
		int[] digits = new int[range+1];
		int[] base = factoradicBase(range);
		int factorialLimit = counter - 1;

		for (int count = range; count >= 0; count--) {
			int position = range - count;
			int remainder = factorialLimit % base[position];
			digits[position] = (factorialLimit - remainder) / base[position];
			factorialLimit = remainder;
		}
		return digits;
	}

	private int[] factoradicBase(final int range) {
		int[] base = new int[range+1];
		for (int i = 0; i < base.length; i++) {
			base[range - i] = factorial(i).intValue();
		}
		return base;
	}

	private String lexicongraphicValue(final int range, int[] digits) {
		StringBuilder sb = new StringBuilder();
		List<Integer> numbers = new ArrayList<Integer>(range);
		for (int i = 0; i < range; i++)
			numbers.add(i);
		for (int digit : digits)
			sb.append(numbers.remove(digit));

		return sb.toString();
	}

}
