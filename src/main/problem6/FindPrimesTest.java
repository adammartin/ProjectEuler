package problem6;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;
import static problem6.FindPrimes.generate;

import org.junit.Test;


public class FindPrimesTest {
	@Test
	public void testOne() throws Exception {
		assertThat(generate(1), is(2));
	}
	@Test
	public void testTwo() throws Exception {
		assertThat(generate(2), is(3));
	}

	@Test
	public void testThree() throws Exception {
		assertThat(generate(3), is(5));
	}

	@Test
	public void testFour() throws Exception {
		assertThat(generate(4), is(7));
	}

	@Test
	public void testFive() throws Exception {
		assertThat(generate(5), is(11));
	}

	@Test
	public void testSix() throws Exception {
		assertThat(generate(6), is(13));
	}

	@Test
	public void testSeven() throws Exception {
		assertThat(generate(7), is(17));
	}

	@Test
	public void testEight() throws Exception {
		assertThat(generate(10001), is(104743));
	}

}
