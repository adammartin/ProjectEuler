package problem16;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;
import static problem16.Powers.sumOfDigits;

import org.junit.Test;


public class PowersTest {
	
	@Test
	public void zeroPower() {
		assertThat(sumOfDigits(2, 0), is(1));
	}
	
	@Test
	public void powerOfOne() {
		assertThat(sumOfDigits(2, 1), is(2));
	}
	
	@Test
	public void powerOfFour() {
		assertThat(sumOfDigits(2, 4), is(7));
	}
	
	@Test
	public void powerOfFifteen() {
		assertThat(sumOfDigits(2, 15), is(26));
	}
	
	@Test
	public void powerOfOneThousand() {
		assertThat(sumOfDigits(2, 1000), is(1366));
	}
}
