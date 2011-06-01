package problem5;

public class SmallestDivisor {

	public static Integer generate(int n) {
		int previousResult = n>1?generate(n-1):1;

		for(int i = 1; i <= n && previousResult != 1; i++ )
			if((i*previousResult) % n==0) return i*previousResult;

		return n;
	}
}
