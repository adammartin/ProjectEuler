package problem28;

import static java.math.BigInteger.ONE;
import static java.math.BigInteger.valueOf;

import java.math.BigInteger;

public class NumberSpiral {

	private final int spiralCount;

	public NumberSpiral(int spiralCount) {
		this.spiralCount = spiralCount;
	}

	public BigInteger diagnalSum() {
		return spiralSum(spiralCount);
	}
	
	private BigInteger spiralSum(int spiral){
		if(spiral == 1){
			return ONE;
		}
		return spiralCornerSum(spiral).add(spiralSum(spiral-1));
	}

	private BigInteger spiralCornerSum(int spiral) {
		BigInteger rowLength = valueOf(2).multiply(valueOf(spiral)).subtract(ONE);
		return cornerSums(rowLength, rowLength.pow(2), 4);
	}

	private BigInteger cornerSums(BigInteger rowLength, BigInteger spiralMaxCorner, int corner) {
		BigInteger distanceFromMax = rowLength.subtract(ONE).multiply(valueOf(corner-1));
		BigInteger nextVal = spiralMaxCorner.subtract(distanceFromMax);
		if(corner == 1){
			return nextVal;
		}
		return nextVal.add(cornerSums(rowLength, spiralMaxCorner, corner - 1));
	}

}
