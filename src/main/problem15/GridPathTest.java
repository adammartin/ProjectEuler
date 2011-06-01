package problem15;

import static java.math.BigInteger.valueOf;
import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;
import static problem15.GridPath.paths;

import org.junit.Test;


public class GridPathTest {
	@Test
	public void testGridOfOne() throws Exception {
		assertThat(paths(1), is(valueOf(2)));
	}

	@Test
	public void testGridOfTwo() throws Exception {
		assertThat(paths(2), is(valueOf(6)));
	}

	@Test
	public void testGridOfThree() throws Exception {
		assertThat(paths(3), is(valueOf(20)));
	}

	@Test
	public void testGridOfTwenty() throws Exception {
		assertThat(paths(20), is(valueOf(137846528820L)));
	}
}
