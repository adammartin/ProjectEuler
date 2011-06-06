package problem16;

import static java.lang.Character.digit;
import static java.math.BigInteger.valueOf;

public class Powers {

	public static int sumOfDigits(int baseNum, int pow) {
		return sumOfDigits(valueOf(baseNum).pow(pow).toString().toCharArray());
	}

	private static int sumOfDigits(final char[] digits) {
		int sum = 0;
		for(char digit:digits){
			sum += digit(digit, 10);
		}
		return sum;
	}
}
