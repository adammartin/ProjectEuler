package problem23;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class AdderTest {
	private Adder adder = new Adder();

	@Test
	public void receiveAllNumbersBelowTwentyFour() {
		assertThat(adder.notFromAbundantNumber(24), is(new int[] { 1, 2, 3, 4,
				5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21,
				22, 23 }));
	}

	@Test
	public void recieveAllNumbersButTwentyFourAndThirtyNumbersBelowThirtyOne() {
		assertThat(adder.notFromAbundantNumber(31), is(new int[] { 1, 2, 3, 4,
				5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21,
				22, 23, 0, 25, 26, 27, 28, 29, 0}));
	}

	@Test
	public void sumOfNumbersNotFormedFromAbundantsBelowTwentyFour() {
		assertThat(adder.sumOfNonAbundantResultantsBelow(24), is(276));
	}

	@Test
	public void sumOfNumbersNotFormedFromAbundantsBelowThirty() {
		assertThat(adder.sumOfNonAbundantResultantsBelow(31), is(411));
	}

	@Test
	public void sumTest() {
		assertThat(adder.sumOfNonAbundantResultantsBelow(28123), is(4179871));
	}

}
