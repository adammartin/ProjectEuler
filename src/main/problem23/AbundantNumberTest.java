package problem23;

import static java.util.Arrays.asList;
import static java.util.Collections.EMPTY_LIST;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class AbundantNumberTest {

	private AbundantNumber aNumber = new AbundantNumber();

	@Test
	public void noAbundantNumbersBelowTwelve() {
		assertThat(aNumber.abundantsBelow(12), is(EMPTY_LIST));
	}

	@Test
	public void canFindFirstAbundantNumber() {
		assertThat(aNumber.abundantsBelow(13), is(asList(12)));
	}

	@Test
	public void canTwoAbundantNumber() {
		assertThat(aNumber.abundantsBelow(20), is(asList(12, 18)));
	}

	@Test
	public void canFindLotsOfAbundantNumbers() {
		assertThat(
				aNumber.abundantsBelow(100),
				is(asList(12, 18, 20, 24, 30, 36, 40, 42, 48, 54, 56, 60, 66,
						70, 72, 78, 80, 84, 88, 90, 96)));
	}
}
