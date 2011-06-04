package problem11;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class GridProduct {
	int[][] intGrid;

	public GridProduct(String grid){
		intGrid = intGrid(grid);
	}

	public int maxProduct(int numOfInts) {
		int maxProduct = 0;
		for(int y = 0; y < intGrid.length; y++){
			for(int x = 0; x < intGrid.length; x++){
				int lineProduct = productForRow(numOfInts, intGrid[y], x);
				int horizProduct = productForColumn(numOfInts, x, y);
				int diagDownProduct = productForDiagnalDown(numOfInts, x, y);
				int diagUpProduct = productForDiagUp(numOfInts, x, y);
				maxProduct = maxProduct(maxProduct, lineProduct, horizProduct, diagDownProduct, diagUpProduct);
			}
		}
		return maxProduct;
	}

	private int[][] intGrid(String grid) {
		String[] lines = grid.split("\n");
		int[][] intGrid = new int[lines.length][lines.length];
		for(int y = 0; y < lines.length; y++){
			String[] numbers = lines[y].split("\\s");
			for(int x = 0; x < numbers.length; x++){
				intGrid[y][x] = Integer.parseInt(numbers[x]); 
			}
		}
		return intGrid;
	}

	private int productForRow(int numOfInts, int[] line, int x) {
		int currentProduct = 1;
		for(int count = 0; count < numOfInts && x < (line.length - numOfInts + 1); count ++){
			currentProduct *= line[x+count];
		}
		return currentProduct;
	}

	private int productForColumn(int numOfInts, int x, int y) {
		int currentProduct = 1;
		for(int count = 0; count < numOfInts && y < (intGrid.length - numOfInts + 1);count++){
			currentProduct *= intGrid[y+count][x];
		}
		return currentProduct;
	}

	private int productForDiagnalDown(int numOfInts, int x, int y) {
		int currentProduct = 1;
		for(int count = 0; count < numOfInts && x < (intGrid.length - numOfInts + 1) && y < (intGrid.length - numOfInts + 1);count++){
			currentProduct *= intGrid[y+count][x+count];
		}
		return currentProduct;
	}

	private int productForDiagUp(int numOfInts, int x, int y) {
		int currentProduct = 1;
		for(int count = 0; count < numOfInts && x < (intGrid.length - numOfInts + 1) && y < intGrid.length && y >= numOfInts - 1;count++){
			currentProduct *= intGrid[y-count][x+count];
		}
		return currentProduct;
	}

	private int maxProduct(Integer ...values) {
		List<Integer> list = Arrays.asList(values);
		Collections.sort(list, Collections.reverseOrder());
		return list.get(0).intValue();
	}
	
}
