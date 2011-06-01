package problem9;

import static java.lang.Math.pow;

public class PythagoreanTriplet {

	public static int[] calculate(int sumOfThree) {
		for(int first = 1; first < sumOfThree/3; first++)
			for(int second = sumOfThree/3; second < 2*(sumOfThree/3); second++)
				if(pow(first, 2) + pow(second, 2) == pow(sumOfThree - first - second, 2))
					return new int[]{first, second, sumOfThree - first - second};
		return null;
	}

}
