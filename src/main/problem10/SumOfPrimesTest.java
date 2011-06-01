package problem10;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;
import static problem10.SumOfPrimes.below;

import org.junit.Test;


public class SumOfPrimesTest {
	@Test
	public void testTwo() throws Exception {
		assertThat(below(2), is(0L));
	}

	@Test
	public void testThree() throws Exception {
		assertThat(below(3), is(2L));
	}

	@Test
	public void testFour() throws Exception {
		assertThat(below(4), is(5L));
	}

	@Test
	public void testFive() throws Exception {
		assertThat(below(6), is(10L));
	}

	@Test
	public void testTen() throws Exception {
		assertThat(below(10), is(17L));
	}

	@Test
	public void testTwoMillion() throws Exception {
		assertThat(below(2000000), is(142913828922L));
	}
}
