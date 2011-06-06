package problem18;

import static java.lang.Integer.parseInt;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TriangleParser {

	public Map<Integer, List<Integer>> parse(String stringTriangle) {
		HashMap<Integer, List<Integer>> triangle = new HashMap<Integer, List<Integer>>();
		int rowCounter = 1;
		for(String row:stringTriangle.split("\n")){
			triangle.put(rowCounter++, parseRow(row));
		}
		return triangle;
	}

	private List<Integer> parseRow(String row) {
		List<Integer> intRow = new ArrayList<Integer>();
		for(String integer:row.split(" ")){
			intRow.add(parseInt(integer));
		}
		return intRow;
	}
}
