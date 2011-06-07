package problem20;

import static java.math.BigInteger.ONE;
import static java.math.BigInteger.valueOf;
import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;
import static problem20.Factorial.factorial;

import org.junit.Test;


public class FactorialTest {
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
	
	@Test
	public void sumOfOneIsOne() {
		assertThat(Factorial.sumOfDigits(1), is(1));
	}
	
	@Test
	public void sumOfThreeIsSix() {
		assertThat(Factorial.sumOfDigits(1), is(1));
	}
	
	@Test
	public void sumOfTenIsTwentySeven() {
		assertThat(Factorial.sumOfDigits(10), is(27));
	}
	
	@Test
	public void sumOfOneHundredIsReallyBig() {
		assertThat(Factorial.sumOfDigits(100), is(648));
	}
}
