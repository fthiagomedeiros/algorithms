package algorithms.data.structure.union.find.tests;

import static org.junit.Assert.assertFalse;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import algorithms.data.structure.union.find.QuickUnionFind;

class BasicUnionFindTest {	
	
	@Test
	void basicUnionFindTest() {
		QuickUnionFind i1 = new QuickUnionFind(3);
		assertEquals(false, i1.connected(0, 1));
		
//		System.out.println(i1.getValues());
		i1.union(0, 1);
		
		assertEquals(true, i1.connected(0, 1));
		assertEquals(false, i1.connected(0, 2));
		
//		System.out.println(i1.getValues());
		
		i1.union(0, 2);
		
//		System.out.println(i1.getValues());
	}
	
	@Test
	void basicUnionFindTenItemsTest() {
		QuickUnionFind i1 = new QuickUnionFind(10);
		assertEquals(false, i1.connected(0, 1));
		
//		System.out.println(i1.getValues());
		i1.union(0, 1);
		
		assertEquals(true, i1.connected(0, 1));
		assertEquals(false, i1.connected(0, 2));
		
//		System.out.println(i1.getValues());
		
		i1.union(0, 2);
		
//		System.out.println(i1.getValues());
		
		i1.union(3, 9);
		assertTrue(i1.connected(3, 9));
		assertFalse(i1.connected(4, 5));
		
//		System.out.println(i1.getValues());
	}

	
	@Test
	void basicUnionFindItemsTest() {
		QuickUnionFind i1 = new QuickUnionFind(10);
		System.out.println(i1.getValues());
		
		i1.union(0, 5);
		i1.union(0, 6);
		
		System.out.println(i1.getValues());
		
		assertTrue(i1.connected(0, 5));
		
		i1.union(1, 2);
		i1.union(2, 7);
		
		System.out.println(i1.getValues());
		
	}
}
