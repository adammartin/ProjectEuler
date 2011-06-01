package problem7;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;
import static problem7.PrimeFinder.find;

import org.junit.Test;


public class PrimeFinderTest {

	@Test
	public void canFindTheFirstPrime() throws Exception {
		assertThat(find(1), is(2));
	}

	@Test
	public void canFindTheSecondPrime() throws Exception {
		assertThat(find(2), is(3));
	}

	@Test
	public void canFindtheThirdPrime() throws Exception {
		assertThat(find(3), is(5));
	}

	@Test
	public void canFindTheFourthPrime() throws Exception {
		assertThat(find(4), is(7));
	}

	@Test
	public void canFindTheFifthPrime() throws Exception {
		assertThat(find(5), is(11));
	}

	@Test
	public void canFindTheSixthPrime() throws Exception {
		assertThat(find(6), is(13));
	}

	@Test
	public void canFindTheTenThousandAndFirstPrime() throws Exception {
		assertThat(find(10001), is(104743));
	}
}
