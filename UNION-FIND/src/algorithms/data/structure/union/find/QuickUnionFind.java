package algorithms.data.structure.union.find;

import java.util.Arrays;

public class QuickUnionFind {
	
	private int[] values;
	
	public QuickUnionFind(int numberItems) {
		values = new int[numberItems];
		
		for (int i = 0; i < values.length; i++) {
			values[i] = i;
		}
	}
	
	public boolean connected(int p, int q) {
		return (values[p] == values[q]);
	}
	
	public void union(int p, int q) {
		int pid = values[p];
		int qid = values[q];
		
		for (int i = 0; i < values.length; i++) {
			if (values[i] == pid) {
				values[i] = qid;
			}
		}
	}

	public String getValues() {
		return Arrays.toString(values);
	}
	
}

