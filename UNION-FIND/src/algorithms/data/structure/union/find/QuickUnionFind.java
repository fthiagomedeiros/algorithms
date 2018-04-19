package algorithms.data.structure.union.find;

import java.util.Arrays;

/**
 * Quick Union Algorithm
 * @author Thiago
 * 
 * We have quick find and quick union algorithm, each one has they some drawbacks
 * 
 * Quick union is better than quick find but worst-case is a problem and slow 
 * Tree can get tall and to find a root can be expensive
 */
public class QuickUnionFind {
	
	/**
	 * The values array will be a tree, which values[i] is parent of i
	 */
	private int[] values;
	
	public QuickUnionFind(int numberItems) {
		values = new int[numberItems];
		
		for (int i = 0; i < values.length; i++) {
			values[i] = i;
		}
	}
	
	/**
	 * Find the root element of a tree
	 * @param i the value
	 * @return the root of i
	 */
	private int root(int i) {
		while (i != values[i]) {
			i = values[i];
		}
		return i;
	}
	
	public boolean connected(int p, int q) {
		return root(p) == root(q);
	}
	
	public void union(int p, int q) {
		int i = root(p);
		int j = root(q);
		values[i] = j;
	}

	public String getValues() {
		return Arrays.toString(values);
	}
	
}

