package problem18;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class TrianglePather {

	public Integer biggestPath(final Map<Integer, List<Integer>> triangle) {
		return sumOfRows(triangle.size(), triangle, new ArrayList<Integer>(triangle.get(triangle.size())));
	}

	private Integer sumOfRows(final int row, final Map<Integer, List<Integer>> triangle, final List<Integer> currentSum) {
		if(row == 1){
			return currentSum.get(0);
		}
		return sumOfRows(row - 1, triangle, reduce(triangle.get(row-1), currentSum));
	}

	private List<Integer> reduce(final List<Integer> parentRow, final List<Integer> childRow) {
		List<Integer> newSums = new ArrayList<Integer>();
		for(int position = 0; position < parentRow.size(); position++ ){
			newSums.add(parentRow.get(position) + (int) largestNode(childRow, position));
		}
		return newSums;
	}

	private Integer largestNode(final List<Integer> childRow, final int position) {
		return childRow.get(position) > childRow.get(position+1)? childRow.get(position) : childRow.get(position + 1);
	}

}
