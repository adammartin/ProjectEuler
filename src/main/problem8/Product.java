package problem8;


public class Product {

	public static int largest(String series, int numberOfDigits) {
		int currentMax = 0;
		for(int position = 0; position <= startOfLastSeries(series, numberOfDigits); position++){
			currentMax = maxValue(currentMax, series.substring(position, position+numberOfDigits));
		}
		return currentMax;
	}

	private static int maxValue(int maxValue, String substring) {
		int product = substring.contains("0")?0:productOfDigits(substring);
		return maxValue > product?maxValue:product;
	}

	private static int productOfDigits(String digits) {
		int product = 1;
		for(int position = 0; position < digits.length(); position++){
			product *= Integer.parseInt(""+digits.charAt(position));				
		}
		return product;
	}

	private static int startOfLastSeries(String series, int numberOfDigits) {
		return series.length()-numberOfDigits;
	}
	
}
