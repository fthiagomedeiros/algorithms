package algorithms.data.structure.union.find;

/**
 * Quick Find Algorithm
 * @author fthiagom
 *
 */
public class QuickFind extends UnionFindBasis {

	public QuickFind(int numberItems) {
		super(numberItems);
	}

	@Override
	public boolean connected(int p, int q) {
		return (values[p] == values[q]);
	}

	@Override
	public void union(int p, int q) {
		int pid = values[p];
		int qid = values[q];
		
		for (int i = 0; i < values.length; i++) {
			if (values[i] == pid) {
				values[i] = qid;
			}
		}
	}

}
