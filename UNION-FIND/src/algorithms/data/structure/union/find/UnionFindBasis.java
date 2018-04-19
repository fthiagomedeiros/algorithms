package algorithms.data.structure.union.find;

import java.util.Arrays;

/**
 * Quick Find and Union Algorithm Basis
 * @author Thiago
 */
public abstract class UnionFindBasis {
	
	/**
	 * The values array will be a tree, which values[i] is parent of i
	 */
	protected int[] values;
	
	public UnionFindBasis(int numberItems) {
		values = new int[numberItems];
		for (int i = 0; i < values.length; i++) {
			values[i] = i;
		}
	}
	
	public abstract boolean connected(int p, int q);	
	public abstract void union(int p, int q);

	public String getValues() {
		return Arrays.toString(values);
	}
	
}

