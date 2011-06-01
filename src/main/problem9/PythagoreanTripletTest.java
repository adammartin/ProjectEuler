package problem9;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;
import static problem9.PythagoreanTriplet.calculate;

import org.junit.Test;


public class PythagoreanTripletTest {
	@Test
	public void canFindValuesWhichAddToExpectedValue() throws Exception {
		int[] results = calculate(12);
		assertThat(results[0]+results[1]+results[2], is(12));
	}

	@Test
	public void aIsLessThenBandBisLessThanC() throws Exception {
		int[] results = calculate(12);
		assertTrue(results[0] < results[1]);
		assertTrue(results[1] < results[2]);		
	}

	@Test
	public void sumOfSquaresForAandBAddToSquareOfC() throws Exception {
		int[] results = calculate(12);
		assertThat(Math.pow(results[0], 2)+ Math.pow(results[1], 2), is(Math.pow(results[2], 2)));
	}

	@Test
	public void valuesMatchKnownTripletForTwelve() throws Exception {
		assertThat(calculate(12), is(new int[]{3,4,5}));
	}

	@Test
	public void canFindValuesWhichAddToThirty() throws Exception {
		int[] results = calculate(30);
		assertThat(results[0]+results[1]+results[2], is(30));
	}

	@Test
	public void aIsLessThenBandBisLessThanCForThirty() throws Exception {
		int[] results = calculate(30);
		assertTrue(results[0] < results[1]);
		assertTrue(results[1] < results[2]);		
	}

	@Test
	public void sumOfSquaresForAandBAddToSquareOfCForThirty() throws Exception {
		int[] results = calculate(30);
		assertThat(Math.pow(results[0], 2)+ Math.pow(results[1], 2), is(Math.pow(results[2], 2)));
	}

	@Test
	public void valuesMatchKnownTripletForThirty() throws Exception {
		assertThat(calculate(30), is(new int[]{5,12,13}));
	}

	@Test
	public void canFindValuesWhichAddToFiftySix() throws Exception {
		int[] results = calculate(56);
		assertThat(results[0]+results[1]+results[2], is(56));
	}

	@Test
	public void aIsLessThenBandBisLessThanCForFiftySix() throws Exception {
		int[] results = calculate(56);
		assertTrue(results[0] < results[1]);
		assertTrue(results[1] < results[2]);		
	}

	@Test
	public void sumOfSquaresForAandBAddToSquareOfCForFiftySix() throws Exception {
		int[] results = calculate(56);
		assertThat(Math.pow(results[0], 2)+ Math.pow(results[1], 2), is(Math.pow(results[2], 2)));
	}

	@Test
	public void valuesMatchKnownTripletForFiftySix() throws Exception {
		assertThat(calculate(56), is(new int[]{7,24,25}));
	}

	@Test
	public void valuesMatchKnownTripletForOneThousand() throws Exception {
		assertThat(calculate(1000), is(new int[]{200,375,425}));
	}

	@Test
	public void productOfTripletForOneThousandIsCorrect() throws Exception {
		int[] triplet = calculate(1000);
		assertThat(triplet[0]*triplet[1]*triplet[2], is(31875000));
	}
}
