package problem30;

import static java.util.Arrays.asList;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.util.List;

import org.junit.Test;


public class PowersTest {
	private Powers powers = new Powers();
	
	@Test
	public void sumOfPowersFourth() {
		assertThat(powers.sumsFor(4), is(asList(9474, 8208, 1634)));
	}
	
	@Test
	public void sumOfPowersFive() {
		assertThat(powers.sumsFor(5), is(asList(194979, 93084, 92727, 54748, 4151, 4150)));
	}
	
	@Test
	public void sum() {
		List<Integer> numbers = powers.sumsFor(5);
		int sum = 0;
		for(Integer number:numbers){
			sum += number.intValue();
		}
		assertThat(sum, is(443839));
	}
}
