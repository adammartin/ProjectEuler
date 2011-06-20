package common;

import static java.lang.Integer.valueOf;
import static java.util.Arrays.asList;

import java.util.ArrayList;
import java.util.List;

public class FindPrimes {

	public static Integer generate(int n) {
		List<Integer> primes = new ArrayList<Integer>();
		generatePrimes(n, primes);
		return primes.get(primes.size()-1);
	}

	public static boolean isPrime(Integer possiblePrime) {
		List<Integer> primes = new ArrayList<Integer>(asList(2));
		for(int nextPrime = 2; nextPrime <= possiblePrime;){
			nextPrime = nextPrime(nextPrime, primes);
			primes.add(valueOf(nextPrime));
		}
		return primes.contains(possiblePrime);
	}
	
	private static void generatePrimes(int n, List<Integer> primes) {
		if(n>1){
			generatePrimes(n-1, primes);
			primes.add(nextPrime(n, primes));
	 	} else {
	 		primes.add(2);
	 	}
	}

	private static Integer nextPrime(int n, List<Integer> primes) {
		int candidate = n==2?3:valueOf(primes.get(primes.size()-1)) + 2;

		while(!isNextPrime(candidate, primes))
			candidate+=2;

		return candidate;
	}

	private static boolean isNextPrime(int candidate, List<Integer> primes) {
		for(Integer prime:primes){
			if(candidate%prime.intValue() == 0) return false;
			else if(Math.sqrt(candidate) < prime.intValue()) return true;
		}

		return true;
	}

}
