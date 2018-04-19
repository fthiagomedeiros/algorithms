package algorithms.data.structure.union.find;

/**
 * Quick Union Algor
 * @author fthia
 *
 */
public class QuickUnion extends UnionFindBasis {

	public QuickUnion(int numberItems) {
		super(numberItems);
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
		values[i] = j;
	}

}
