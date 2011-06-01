package problem1;

public class NaturalNumbers {
	final int cap;

	public NaturalNumbers(int cap) {
		this.cap = cap;
	}

	public int sumsForMultiplesOf(int... numbers) {
		int sum = 0;

		for(int value = 1; value < cap; value ++)
			if(isModulus(value, numbers)) sum += value;

		return sum;
	}

	private boolean isModulus(int value, int... numbers) {
		for(int number:numbers)
			if(value % number == 0) return true; 

		return false;
	}
}
