package problem29;

import static java.math.BigInteger.valueOf;
import static java.util.Arrays.asList;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.math.BigInteger;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.junit.Before;
import org.junit.Test;


public class DistinctCombinationsTest {
	DistinctCombinations combinations = new DistinctCombinations();
	
	@Before
	public void setUp() {
	}
	
	@Test
	public void two() {
		assertThat(combinations.distinct(2, 2), is(expectedSet(asList(4))));
	}
	
	@Test
	public void three() {
		assertThat(combinations.distinct(2, 3), is(expectedSet(asList(4, 8, 9, 27))));
	}
	
	@Test
	public void five() {
		assertThat(combinations.distinct(2, 5), is(expectedSet(asList(4, 8, 9, 16, 25, 27, 32, 64, 81, 125, 243, 256, 625, 1024, 3125))));
	}
	
	@Test
	public void oneHundred() {
		assertThat(combinations.distinct(2, 100).size(), is(9183));
	}

	private Set<BigInteger> expectedSet(List<Integer> expectedList) {
		Set<BigInteger> expected = new HashSet<BigInteger>();
		for(Integer integer:expectedList){
			expected.add(valueOf(integer));
		}
		return expected;
	}
}
