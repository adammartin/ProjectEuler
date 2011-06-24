package problem28;

import static java.math.BigInteger.ONE;
import static java.math.BigInteger.valueOf;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;


public class NumberSpiralTest {
	/*
	 * 73 74 75 76 77 78 79 80 81
	 * 72 43 44 45 46 47 48 49 50
	 * 71 42 21 22 23 24 25 26 51
	 * 70 41 20  7  8  9 10 27 52
	 * 69 40 19  6  1  2 11 28 53
	 * 68 39 18  5  4  3 12 29 54
	 * 67 38 17 16 15 14 13 30 55
	 * 66 37 36 35 34 33 32 31 56
	 * 65 64 63 62 61 60 59 58 57
	 */
	
	@Test
	public void sizeOne() {
		assertThat(new NumberSpiral(1).diagnalSum(), is(ONE));
	}
	
	@Test
	public void sizeTwo() {
		assertThat(new NumberSpiral(2).diagnalSum(), is(valueOf(25)));
	}
	
	@Test
	public void sizeThree() {
		assertThat(new NumberSpiral(3).diagnalSum(), is(valueOf(101)));
	}
	
	@Test
	public void sizeFour() {
		assertThat(new NumberSpiral(4).diagnalSum(), is(valueOf(261)));
	}
	
	@Test
	public void sizeOfFiveHundredAndOne() {
		assertThat(new NumberSpiral(501).diagnalSum(), is(valueOf(669171001)));
	}
}
