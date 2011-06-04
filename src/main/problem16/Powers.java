package problem16;

import static java.math.BigInteger.valueOf;

public class Powers {

	public static int sumOfDigits(int baseNum, int pow) {
		return sumOfDigits(valueOf(baseNum).pow(pow).toString());
	}

	private static int sumOfDigits(final String digits) {
		int sum = 0;
		for(int i = 0; i < digits.length(); i++){
			sum += Integer.valueOf(""+digits.charAt(i)).intValue();
		}
		return sum;
	}
}
