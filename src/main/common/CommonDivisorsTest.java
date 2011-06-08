package common;

import static java.util.Arrays.asList;
import static java.util.Collections.EMPTY_LIST;
import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.Test;


public class CommonDivisorsTest {
	private CommonDivisors divisor = new CommonDivisors();

	@Test
	public void one() {
		assertThat(divisor.common(1), is(EMPTY_LIST));
	}

	@Test
	public void two() {
		assertThat(divisor.common(2), is(asList(1)));
	}
	
	@Test
	public void four() {
		assertThat(divisor.common(4), is(asList(1,2)));
	}
	
	@Test
	public void twoHundredAndTwenty() {
		assertThat(divisor.common(220), is(asList(1, 2, 4, 5, 10, 11, 20, 22, 44, 55, 110)));
	}
}
