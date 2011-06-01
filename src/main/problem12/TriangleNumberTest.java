package problem12;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;
import static problem12.TriangleNumber.numberOf;

import org.junit.Test;


public class TriangleNumberTest {
	@Test
	public void testOne() throws Exception {
		assertThat(numberOf(1), is(1));
	}

	@Test
	public void testTwo() throws Exception {
		assertThat(numberOf(2), is(3));
	}

	@Test
	public void testThree() throws Exception {
		assertThat(numberOf(4), is(6));
	}

	@Test
	public void testFour() throws Exception {
		assertThat(numberOf(6), is(28));
	}

	@Test
	public void testFiveHundred() throws Exception {
		assertThat(numberOf(500), is(76576500));
	}
}
