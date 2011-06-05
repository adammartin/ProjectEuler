package problem17;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.Test;


public class LetterCounterTest {
	LetterCounter counter = new LetterCounter();
	
	@Test
	public void countOneToOne() {
		assertThat(counter.count(1, 1), is(3));
	}
	
	@Test
	public void countOneToTwo() {
		assertThat(counter.count(1, 2), is(6));
	}
	
	@Test
	public void countOneToThree() {
		assertThat(counter.count(1, 3), is(11));
	}
	
	@Test
	public void countOneToFour() {
		assertThat(counter.count(1, 4), is(15));
	}
	
	@Test
	public void countOneToFive() {
		assertThat(counter.count(1, 5), is(19));
	}
	
	@Test
	public void countOneToTen() {
		assertThat(counter.count(1, 10), is(39));
	}
	
	@Test
	public void countOneToNineteen() {
		assertThat(counter.count(1, 19), is(106));
	}
	
	@Test
	public void countOneToTwentyOne() {
		assertThat(counter.count(1, 21), is(121));
	}
	
	@Test
	public void countOneHundred() {
		assertThat(counter.count(100, 100), is(10));
	}
	
	@Test
	public void countSpecial() {
		assertThat(counter.count(342, 342), is(23));
	}
	
	@Test
	public void countOneToOneThousand() {
		assertThat(counter.count(1, 1000), is(21124));
	}
}
