package problem17;

import static java.lang.Integer.valueOf;
import static java.util.Arrays.asList;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class LetterCounter {
	private static Map<Integer, List<Integer>> UNDER_TWENTY = new HashMap<Integer, List<Integer>>();
	private static Map<Integer, List<Integer>> TENS = new HashMap<Integer, List<Integer>>();
	private static int HUNDRED = 7;
	private static int THOUSAND = 8;
	
	static {
		UNDER_TWENTY.put(3, asList(1,2,6,10));
		UNDER_TWENTY.put(4, asList(4,5,9));
		UNDER_TWENTY.put(5, asList(3,7,8));
		UNDER_TWENTY.put(6, asList(11,12));
		UNDER_TWENTY.put(7, asList(15,16));
		UNDER_TWENTY.put(8, asList(13,14,18,19));
		UNDER_TWENTY.put(9, asList(17));

		TENS.put(5, asList(4,5,6));
		TENS.put(6, asList(2,3,8,9));
		TENS.put(7, asList(7));
	}

	public int count(int min, int max) {
		int count = 0;
		for(int i = min; i <= max; i++){
			count += count(i);
		}
		return count;
	}

	private int count(int i) {
		if(i < 20){
			return count(i, UNDER_TWENTY);
		} else if (i < 100) {
			return reducingCount(valueOf(i).toString(), TENS);
		} else if (i < 1000) {
			String value = valueOf(i).toString();
			int and = valueOf(value.substring(1)).intValue() == 0 ? 0 : 3;
			return reducingCount(value, UNDER_TWENTY) + HUNDRED + and;
		} else if (i < 10000) {
			return reducingCount(valueOf(i).toString(), UNDER_TWENTY) + THOUSAND;
		}
		return 0;
	}

	private int reducingCount(String value, Map<Integer, List<Integer>> MAP) {
		return count(valueOf("" + value.charAt(0)), MAP) + count(valueOf(value.substring(1)).intValue());
	}

	private int count(int i, Map<Integer, List<Integer>> map) {
		for(Entry<Integer, List<Integer>> entry:map.entrySet()){
			if(entry.getValue().contains(Integer.valueOf(i))){
				return entry.getKey().intValue();
			}
		}
		return 0;
	}

}
