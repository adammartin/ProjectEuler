package problem5;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;
import static problem5.SmallestDivisor.generate;

import org.junit.Test;


public class SmallestDivisorTest {
	@Test
	public void testOne() throws Exception {
		assertThat(generate(1), is(1));
	}

	@Test
	public void testTwo() throws Exception {
		assertThat(generate(2), is(2));
	}

	@Test
	public void testThree() throws Exception {
		assertThat(generate(3), is(6));
	}

	@Test
	public void testFour() throws Exception {
		assertThat(generate(4), is(12));
	}

	@Test
	public void testFive() throws Exception {
		assertThat(generate(5), is(60));
	}

	@Test
	public void testSix() throws Exception {
		assertThat(generate(6), is(60));
	}

	@Test
	public void testSeven() throws Exception {
		assertThat(generate(7), is(420));
	}

	@Test
	public void testEight() throws Exception {
		assertThat(generate(8), is(840));
	}

	@Test
	public void testTen() throws Exception {
		assertThat(generate(10), is(2520));
	}

	@Test
	public void testTwenty() throws Exception {
		assertThat(generate(20), is(232792560));
	}
}
