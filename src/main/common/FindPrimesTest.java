package common;

import static common.FindPrimes.generate;
import static common.FindPrimes.isPrime;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;


public class FindPrimesTest {
	@Test
	public void testOne() {
		assertThat(generate(1), is(2));
	}
	@Test
	public void testTwo() {
		assertThat(generate(2), is(3));
	}

	@Test
	public void testThree() {
		assertThat(generate(3), is(5));
	}

	@Test
	public void testFour() {
		assertThat(generate(4), is(7));
	}

	@Test
	public void testFive() {
		assertThat(generate(5), is(11));
	}

	@Test
	public void testSix() {
		assertThat(generate(6), is(13));
	}

	@Test
	public void testSeven() {
		assertThat(generate(7), is(17));
	}

	@Test
	public void testEight() {
		assertThat(generate(10001), is(104743));
	}
	@Test
	public void twoIsPrime() {
		assertThat(isPrime(2), is(true));
	}
	@Test
	public void threeIsPrime() {
		assertThat(isPrime(3), is(true));
	}
	
	@Test
	public void fourIsNotPrime() {
		assertThat(isPrime(4), is(false));
	}
	
	@Test
	public void fiveIsPrime() {
		assertThat(isPrime(5), is(true));
	}
	
	@Test
	public void sevenIsPrime() {
		assertThat(isPrime(7), is(true));
	}
	
	@Test
	public void elevenIsPrime() {
		assertThat(isPrime(11), is(true));
	}
	
	@Test
	public void twelveIsNotPrime() {
		assertThat(isPrime(12), is(false));
	}
	
	@Test
	public void fifteenIsNotPrime() {
		assertThat(isPrime(15), is(false));
	}
	
	@Test
	public void seventyNineIsPrime() {
		assertThat(isPrime(79), is(true));
	}
	
	@Test
	public void bigNumberIsPrime() {
		assertThat(isPrime(104743), is(true));
	}

}
