package common;

import static common.Fibonacci.sequence;
import static java.math.BigInteger.ONE;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.math.BigInteger;

import org.junit.Test;


public class FibonacciTest {
	@Test
	public void oneIsOne() {
		assertThat(sequence(1), is(ONE));
	}

	@Test
	public void twoIsOne() {
		assertThat(sequence(2), is(ONE));
	}

	@Test
	public void threeIsTwo() {
		assertThat(sequence(3), is(BigInteger.valueOf(2)));
	}
	
	@Test
	public void fourIsThree() {
		assertThat(sequence(4), is(BigInteger.valueOf(3)));
	}
	
	@Test
	public void twelveIsOneHundredFortyFour() {
		assertThat(sequence(12), is(BigInteger.valueOf(144)));
	}
	
	@Test
	public void reallyBig() {
		assertThat(sequence(50), is(BigInteger.valueOf(12586269025L)));
	}

	@Test
	public void performanceTestSmall() {
		assertThat(fibPosition(3), is(12));
	}
	
	@Test
	public void performanceTestLarge() {
		assertThat(fibPosition(1000), is(4782));
	}

	private int fibPosition(int digitLength) {
		int position = 0;
		BigInteger result = BigInteger.ZERO;
		while(result.toString().length() < digitLength){
			position++;
			result = sequence(position);
		}
		return position;
	}
}
