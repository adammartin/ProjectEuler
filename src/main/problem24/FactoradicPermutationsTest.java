package problem24;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;


public class FactoradicPermutationsTest {
	FactoradicPermutations perms = new FactoradicPermutations();
	@Test
	public void zeroShouldBeZero() {
		assertThat(perms.lexicographic(1, 0), is("0"));
	}

	@Test
	public void canGetFirstPermutationOfBinarySet() {
		assertThat(perms.lexicographic(1, 1), is("01"));
	}

	@Test
	public void canGetSecondPermutationOfBinarySet() {
		assertThat(perms.lexicographic(2, 1), is("10"));
	}
	
	@Test
	public void canGetFirstPermutationOfTrinarySet() {
		assertThat(perms.lexicographic(1, 2), is("012"));
	}
	
	@Test
	public void canGetSecondPermutationOfTrinarySet() {
		assertThat(perms.lexicographic(2, 2), is("021"));
	}
	
	@Test
	public void canGetThirdPermutationOfTrinarySet() {
		assertThat(perms.lexicographic(3, 2), is("102"));
	}
	
	@Test
	public void canGetFourthPermutationOfTrinarySet() {
		assertThat(perms.lexicographic(4, 2), is("120"));
	}
	
	@Test
	public void canGetFifthPermutationOfTrinarySet() {
		assertThat(perms.lexicographic(5, 2), is("201"));
	}
	
	@Test
	public void canGetSixthPermutationOfTrinarySet() {
		assertThat(perms.lexicographic(6, 2), is("210"));
	}
	
	@Test
	public void canGetOneMillionthPermutationOfSetNine() {
		assertThat(perms.lexicographic(1000000, 9), is("2783915460"));
	}
	
	@Test
	public void canGetTwoMillionthPermutationOfSetNine() {
		assertThat(perms.lexicographic(3628800, 9), is("9876543210"));
	}
}
