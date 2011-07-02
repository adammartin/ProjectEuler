package problem30;

import static java.lang.Character.digit;
import static java.lang.Math.pow;

import java.util.ArrayList;
import java.util.List;

public class Powers {

	public List<Integer> sumsFor(int power) {
		List<Integer> sums = new ArrayList<Integer>();
		for(int number = limit(power); number > 1 ; number--){
			int sumOfPowers = sumOfPowers(Integer.toString(number), power);
			if(sumOfPowers == number){
				sums.add(sumOfPowers);
			}
		}
		return sums;
	}

	private int sumOfPowers(String number, int power) {
		int sum = 0;
		for(char digit:number.toCharArray()){
			sum += pow(digit(digit, 10), power);
		}
		return sum;
	}

	private int limit(int power) {
		return Double.valueOf(pow(9, power)*(power)).intValue();
	}

}
