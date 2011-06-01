package problem7;

import static java.lang.Integer.valueOf;

import java.util.ArrayList;
import java.util.List;

public class PrimeFinder {

	public static int find(int n) {
		List<Integer> primes = new ArrayList<Integer>();
		primes.add(valueOf(2));
		for(int count = 1; count < n; count++){
			primes.add(nextPrime(primes));
		}
		return primes.get(primes.size()-1).intValue();
	}

	private static Integer nextPrime(List<Integer> primes) {
		int nextPrime = primes.get(primes.size()-1).intValue()+1;
		while(divisableByPrimes(primes, nextPrime)){
			nextPrime++;
		}
		return valueOf(nextPrime);
	}

	private static boolean divisableByPrimes(List<Integer> primes, int nextPrime) {
		for(Integer prime:primes){
			if(nextPrime%prime.intValue() == 0){
				return true;
			}
		}
		return false;
	}

}
