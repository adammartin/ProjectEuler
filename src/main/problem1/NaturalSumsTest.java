package problem1;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import org.junit.Test;


public class NaturalSumsTest {
	NaturalNumbers natural = new NaturalNumbers(10);

	@Test
	public void sumsOfThree() throws Exception {
		assertThat(natural.sumsForMultiplesOf(3), is(18));
	}

	@Test
	public void sumsOfFive() throws Exception {
		assertThat(natural.sumsForMultiplesOf(5), is(5));
	}

	@Test
	public void sumsOfThreeAndFive() throws Exception {
		assertThat(natural.sumsForMultiplesOf(3, 5), is(23));
	}

	@Test
	public void sumsOfThreeAndFiveBelowThousand() throws Exception {
		assertThat(new NaturalNumbers(1000).sumsForMultiplesOf(3, 5), is(233168));
	}

	@Test
	public void sumsOfThreeAndFiveBelowTenThousand() throws Exception {
		assertThat(new NaturalNumbers(10000).sumsForMultiplesOf(3, 5), is(23331668));
	}
}
