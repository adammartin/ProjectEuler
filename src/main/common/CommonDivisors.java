package common;

import java.util.ArrayList;
import java.util.List;

public class CommonDivisors {

	public List<Integer> common(int number) {
		List<Integer> results = new ArrayList<Integer>();
		for(int divisor = 1; divisor < number; divisor++ ){
			if(number % divisor == 0) results.add(divisor);
		}
		return results;
	}

}
