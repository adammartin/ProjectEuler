package problem21;

import static java.util.Arrays.asList;
import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;


public class AmicableTest {

	Amicable amicable = new Amicable();
	
	@Test
	public void firstAmicableNumber() {
		assertThat(amicable.under(1000), is(asList(220, 284)));
	}
	
	@Test
	public void solveForBigger() {
		assertThat(sum(amicable.under(10000)), is(31626));
	}

	private int sum(List<Integer> numbers) {
		int sum = 0;
		for(Integer number:numbers){
			sum += number.intValue();
		}
		return sum;
	}
}
