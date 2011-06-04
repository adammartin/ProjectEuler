package problem14;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.Test;


public class IterativeSequenceTest {
	private IterativeSequence sequence = new IterativeSequence();
	@Test
	public void twoIsTwo() throws Exception {
		assertThat(sequence.chainFor(2), is(2));
	}
	
	@Test
	public void threeIsEight() throws Exception {
		assertThat(sequence.chainFor(3), is(8));
	}
	
	@Test
	public void fourIsThree() throws Exception {
		assertThat(sequence.chainFor(4), is(3));
	}
	
	@Test
	public void fiveIsSix() throws Exception {
		assertThat(sequence.chainFor(5), is(6));
	}
	
	@Test
	public void specialCaseTooLargeForSimpleInt() throws Exception {
		assertThat(sequence.chainFor(667375), is(367));
	}
	
	@Test
	public void longestChainUnderThreeIsTwo() throws Exception {
		assertThat(sequence.longestChainUnder(3), is(2));
	}
	
	@Test
	public void longestChainUnderFiveIsThree() throws Exception {
		assertThat(sequence.longestChainUnder(5), is(3));
	}

	@Test
	public void longestChainUnderFourteenIsNine() throws Exception {
		assertThat(sequence.longestChainUnder(14), is(9));
	}
	
	@Test
	public void longestChainUnderOneHundred() throws Exception {
		assertThat(sequence.longestChainUnder(100), is(97));
	}
	
	@Test
	public void longestChainUnderOneHundredThousand() throws Exception {
		assertThat(sequence.longestChainUnder(100000), is(77031));
	}
	
	@Test
	public void longestChainUnderOneMillion() throws Exception {
		assertThat(sequence.longestChainUnder(1000000), is(837799));
	}
}
