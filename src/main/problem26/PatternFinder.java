package problem26;

import static java.math.BigDecimal.ONE;
import static java.math.RoundingMode.DOWN;

import java.math.BigDecimal;
import java.math.MathContext;

public class PatternFinder {
	private static final String EMPTY = "";

	public static String fractionToDecimal(BigDecimal denominator) {
		return ONE.divide(denominator, new MathContext(maxLengthOfDecimal(denominator), DOWN)).toString();
	}

	public String find(String number, int minLength, int maxLength) {
		String decimalAsString = decimalAsString(number);
		if(decimalAsString.length() > minLength){
			return pattern(decimalAsString, 0, maxLength);
		}
		return EMPTY;
	}

	private String pattern(String decimal, int minLength, int maxLength) {
		for(int i = 0; i < decimal.length() - minLength; i++){
			for(int j = i+minLength; j < decimal.length() && isLongEnough(maxLength, i, j); j++){
				String potentialPattern = decimal.substring(i, j);
				if(isPattern(decimal, i, potentialPattern)){
					return potentialPattern;
				}
			}
		}
		return EMPTY;
	}

	private boolean isPattern(String decimal, int i, String potentialPattern) {
		return potentialPattern.startsWith(decimal.substring(i).replaceAll(potentialPattern, EMPTY));
	}

	private static int maxLengthOfDecimal(BigDecimal denominator) {
		return denominator.intValue()*3;
	}
	
	private String decimalAsString(String decimal) {
		return decimal.substring(decimal.indexOf('.')+1);
	}
	
	private boolean isLongEnough(int maxLength, int start, int end) {
		return end-start <= maxLength;
	}
	
}
