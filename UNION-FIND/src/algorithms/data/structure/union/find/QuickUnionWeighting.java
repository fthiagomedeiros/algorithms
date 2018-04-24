package algorithms.data.structure.union.find;

import java.util.Arrays;

/**
 * Quick Union Algor
 * @author fthia
 * 
 */
public class QuickUnionWeighting extends UnionFindBasis {
	
	private int[] sz;
	private int count; // number of components

	public QuickUnionWeighting(int numberItems) {
		super(numberItems);
		sz = new int[numberItems];
		
		//This array will keep track about tree sizes for each item
		for (int i = 0; i < sz.length; i++) {
			sz[i] = 1;
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

	@Override
	public boolean connected(int p, int q) {
		return root(p) == root(q);
	}

	@Override
	public void union(int p, int q) {
		int i = root(p);
		int j = root(q);
		
		if (i == j) {
			//They (p and q) are in the same component
			return;
		}
		
		if (sz[i] < sz[j]) {
			values[i] = j;
			sz[j] += sz[i];
		} else {
			values[j] = i;
			sz[i] += sz[j];
		}
		
		count--;
	}

	public String getSz() {
		return Arrays.toString(sz);
	}

	public void setSz(int[] sz) {
		this.sz = sz;
	}
	
	

}
