package problem27;

import static common.FindPrimes.isPrime;
import static java.lang.Math.abs;
import static java.util.Arrays.asList;

import java.util.ArrayList;
import java.util.List;

public class EulerPrimesEquation {
	/*
	 * (n^2) + a*n + b = 1681
	 */
	public List<Integer> parts(int n) {
		int aTimesNPlusB = a_Times_n_Plus_b(n);
		for(int a = 1;a < n+1 || new ArrayList<Integer>().size() == 2; a++ ){
			if (a == 1 || isPrime(a)) {
				if (isPrime(abs(b(n, aTimesNPlusB, a)))
						&& allArePrimes(a, b(n, aTimesNPlusB, a), n)) {
					return asList(a, b(n, aTimesNPlusB, a));
				}
				if (isPrime(abs(b(n, aTimesNPlusB, a / -1)))
						&& allArePrimes(a / -1, b(n, aTimesNPlusB, a / -1), n)) {
					return asList(a / -1, b(n, aTimesNPlusB, a / -1));
				}
			}
		}

		return new ArrayList<Integer>();
	}

	private int a_Times_n_Plus_b(int n) {
		return 1681 - (n*n);
	}

	private int b(int n, int aTimesNPlusB, int a) {
		return aTimesNPlusB - (a*n);
	}

	private boolean allArePrimes(int a, int b, int n) {
		boolean areAllPrimes = true;
		for(int i = 0; i < n; i++ ){
			areAllPrimes &= isPrime(resultant(a, b, i));
		}
		return areAllPrimes;
	}

	private Integer resultant(int a, int b, int n) {
		return (n*n) + (a*n) + b;
	}

}
