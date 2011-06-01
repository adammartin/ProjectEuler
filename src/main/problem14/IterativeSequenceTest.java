package problem14;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.Test;


public class IterativeSequenceTest {
	@Test
	public void canSetACapForSequence() throws Exception {
		IterativeSequence sequence = new IterativeSequence(1);
		assertThat(sequence.longestChain(), is(1));
	}
}
