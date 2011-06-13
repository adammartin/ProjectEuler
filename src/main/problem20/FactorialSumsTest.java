package problem20;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;


public class FactorialSumsTest {
	@Test
	public void sumOfOneIsOne() {
		assertThat(FactorialSums.sumOfDigits(1), is(1));
	}
	
	@Test
	public void sumOfThreeIsSix() {
		assertThat(FactorialSums.sumOfDigits(1), is(1));
	}
	
	@Test
	public void sumOfTenIsTwentySeven() {
		assertThat(FactorialSums.sumOfDigits(10), is(27));
	}
	
	@Test
	public void sumOfOneHundredIsReallyBig() {
		assertThat(FactorialSums.sumOfDigits(100), is(648));
	}
}
