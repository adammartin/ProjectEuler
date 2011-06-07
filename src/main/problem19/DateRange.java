package problem19;

import java.util.Calendar;

public class DateRange {
	private final int start;
	private final Calendar end;

	public DateRange(int start, int end) {
		this.start = start;
		this.end = calendar(end);
	}

	public int countOf(int dayOfWeek) {
		int count = 0;
		Calendar cal = calendar(this.start);
		while(cal.before(end)){
			count += cal.get(Calendar.DAY_OF_WEEK) == dayOfWeek ? 1 : 0;
			cal.add(Calendar.MONTH, 1);
		}
		return count;
	}

	private Calendar calendar(int year) {
		Calendar instance = Calendar.getInstance();
		instance.set(year, 0, 1, 0, 0, 0);
		return instance;
	}
}
