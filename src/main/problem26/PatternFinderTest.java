package problem26;

import static common.FindPrimes.isPrime;
import static java.math.BigDecimal.ONE;
import static java.math.BigDecimal.valueOf;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static problem26.PatternFinder.fractionToDecimal;

import org.junit.Test;


public class PatternFinderTest {
	/*
	 * THIS IS THE WORST HACK OF A TEST CASE I'VE DONE WITH EULER TO DATE
	 * My lack of understanding on how to solve the problem in a timely
	 * fashion resulted in me hacking at the code for performance.
	 * 
	 * I had plenty of tests to cover me but I have several untested potential
	 * paths that I added in the name of performance and the interface
	 * sucks for performance reasons.
	 */
	
	/*
	 	A unit fraction contains 1 in the numerator. The decimal representation of the unit fractions with denominators 2 to 10 are given:

		1/2	= 	0.5
		1/3	= 	0.(3)
		1/4	= 	0.25
		1/5	= 	0.2
		1/6	= 	0.1(6)
		1/7	= 	0.(142857)
		1/8	= 	0.125
		1/9	= 	0.(1)
		1/10	= 	0.1
		Where 0.1(6) means 0.166666..., and has a 1-digit recurring cycle. It can be seen that 1/7 has a 6-digit recurring cycle.
		
		Find the value of d  1000 for which 1/d contains the longest recurring cycle in its decimal fraction part.
	 */
	private static final String EMPTY = "";
	PatternFinder patternFinder = new PatternFinder();
	
	@Test
	public void oneIsOne() {
		assertThat(fractionToDecimal(ONE), is("1"));
	}

	@Test
	public void oneIsPointFive() {
		assertThat(fractionToDecimal(valueOf(2)), is("0.5"));
	}
	
	@Test
	public void oneIsEmptyString() {
		assertThat(patternFinder.find(fractionToDecimal(ONE), 0, 1), is(EMPTY));
	}

	@Test
	public void twoIsEmptyString() {
		assertThat(patternFinder.find(fractionToDecimal(valueOf(2)), 0, 2), is(EMPTY));
	}
	
	@Test
	public void threeIsThree() {
		assertThat(patternFinder.find(fractionToDecimal(valueOf(3)), 0, 3), is("3"));
	}
	
	@Test
	public void fourIsEmpty() {
		assertThat(patternFinder.find(fractionToDecimal(valueOf(4)), 0, 4), is(EMPTY));
	}
	
	@Test
	public void fiveIsEmpty() {
		assertThat(patternFinder.find(fractionToDecimal(valueOf(5)), 0, 5), is(EMPTY));
	}
	
	@Test
	public void fiveIsSix() {
		assertThat(patternFinder.find(fractionToDecimal(valueOf(6)), 0, 6), is("6"));
	}
	
	@Test
	public void sevenIsOneFourTwoEightFiveSeven() {
		assertThat(patternFinder.find(fractionToDecimal(valueOf(7)), 0, 7), is("142857"));
	}

	@Test
	public void maxUnderOneThousand() {
		int max = 0;
		String result = "";
		for(int i = 1000; i >= 0 && max != result.length()+1; i--){
			if(isPrime(i)){
				String currVal = patternFinder.find(fractionToDecimal(valueOf(i)), result.length(), i);
				if(currVal.length() > result.length()){
					max = i;
					result = currVal;
				}
			}
		}
		assertThat(max, is(983));
	}
}
