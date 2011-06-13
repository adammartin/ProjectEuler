package common;

import static common.Factorial.factorial;
import static java.math.BigInteger.ONE;
import static java.math.BigInteger.valueOf;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;


public class FactorialTest {
	@Test
	public void zeroIsOne() {
		assertThat(factorial(0), is(ONE));
	}

	@Test
	public void oneIsOne() {
		assertThat(factorial(1), is(ONE));
	}
	
	@Test
	public void twoIsTwo() {
		assertThat(factorial(2), is(valueOf(2)));
	}
	
	@Test
	public void threeIsSix() {
		assertThat(factorial(3), is(valueOf(6)));
	}
	
	@Test
	public void tenIsReallyBig() {
		assertThat(factorial(10), is(valueOf(3628800)));
	}
}
