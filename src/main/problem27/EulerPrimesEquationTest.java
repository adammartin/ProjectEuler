package problem27;

import static java.lang.Math.abs;
import static java.util.Arrays.asList;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.util.List;

import org.junit.Test;


public class EulerPrimesEquationTest {
	/*
	 * (n^2) + a*n + b = 1681
	 */
	private EulerPrimesEquation equation = new EulerPrimesEquation();

	@Test
	public void solvingForFortyReturnsOneAndFortyOne() {
		assertThat(equation.parts(40), is(asList(1, 41)));
	}
	
	@Test
	public void solvingForEightyGivesNegativeSeventyNineAndSixteenZeroOne() {
		assertThat(equation.parts(80), is(asList(-79, 1601)));
	}
	
	@Test
	public void spike() {
		int product = 0;
		for(int i = 80; i > 0; i--){
			List<Integer> result = equation.parts(i);
			if(result.size() == 2 && abs(result.get(0)) < 1000 && abs(result.get(1)) < 1000){
				product = result.get(0) * result.get(1);
				break;
			}
		}
		assertThat(product, is(-59231));
	}
}
