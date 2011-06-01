package problem10;

import java.util.ArrayList;
import java.util.List;

public class SumOfPrimes {

	public static long below(int max) {
		List<Integer> primes = new ArrayList<Integer>();
		int prime = 0;
		long listMax = Math.round(Math.sqrt(max))+1;
		long sumOfPrimes = 0;
		while(prime < max){
			prime = nextPrime(prime, primes);
			if(prime < listMax){
				primes.add(Integer.valueOf(prime));
			}
			if(prime < max) {
				sumOfPrimes  += prime;
			}
		}
		return sumOfPrimes;
	}

	private static Integer nextPrime(int previousPrime, List<Integer> primes) {
		int candidate = nextCandidate(previousPrime);

		while(!isNextPrime(candidate, primes))
			candidate = nextCandidate(candidate);

		return candidate;
	}

	private static int nextCandidate(int previousPrime){
		if(previousPrime < 2) {
			return 2;
		} else if (previousPrime == 2){
			return 3;
		}
		return previousPrime+2;
	}

	private static boolean isNextPrime(int candidate, List<Integer> primes) {
		for(Integer prime:primes){
			if(candidate%prime.intValue() == 0) return false;
			else if(Math.sqrt(candidate) < prime.intValue()) return true;
		}

		return true;
	}
}
