package problem24;

public class Permutations {

	public String lexicographic(final int counter, final int range) {
		return numbers(new Permutation(counter, digits(range + 1))).toString();
	}

	private Permutation numbers(final Permutation perm, final int... posistions) {
		if (perm.size() == posistions.length) {
			return new Permutation(perm.counter - 1, posistions);
		}
		return iterate(perm, posistions);
	}

	private Permutation iterate(final Permutation perm, final int... digits) {
		Permutation newPerm = perm;
		final int[] newDigits = copyIntoLargerArray(digits);
		for (int digit = 0; digit < newPerm.size() && !newPerm.isComplete(); digit++) {
			if (notContainedIn(digit, digits)) {
				newDigits[digits.length] = digit;
				newPerm = numbers(newPerm, newDigits);
			}
		}
		return newPerm;
	}

	private boolean notContainedIn(final int digit, final int[] digits) {
		for (int i = 0; i < digits.length; i++) {
			if (digit == digits[i]) {
				return false;
			}
		}
		return true;
	}

	private int[] copyIntoLargerArray(final int... digits) {
		int[] newDigits = new int[digits.length + 1];
		for (int i = 0; i < digits.length; i++) {
			newDigits[i] = digits[i];
		}
		return newDigits;
	}

	private int[] digits(final int range) {
		int[] digits = new int[range];
		for (int i = 0; i < range; i++) {
			digits[i] = i;
		}
		return digits;
	}

	private class Permutation {
		final int counter;
		final int[] numbers;

		protected Permutation(int counter, int[] numbers) {
			this.counter = counter;
			this.numbers = numbers;
		}
		
		protected boolean isComplete(){
			return counter == 0;
		}
		
		protected int size(){
			return numbers.length;
		}

		public String toString() {
			StringBuilder builder = new StringBuilder();
			for (int i = 0; i < numbers.length; i++) {
				builder.append(String.valueOf(numbers[i]));
			}
			return builder.toString();
		}
	}
}
