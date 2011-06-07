package problem19;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import java.util.Calendar;

import org.junit.Test;

public class DateRangeTest {
	
	@Test
	public void canCountSundaysForYear() {
		assertThat(new DateRange(1901, 1902).countOf(Calendar.SUNDAY), is(2));
	}
	
	@Test
	public void canCountSundaysForTwoYears() {
		assertThat(new DateRange(1901, 1903).countOf(Calendar.SUNDAY), is(3));
	}
	
	@Test
	public void canCountSundaysForCentury() {
		assertThat(new DateRange(1901, 2001).countOf(Calendar.SUNDAY), is(171));
	}
}
