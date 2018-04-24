package algorithms.data.structure.union.find.tests;

import static org.junit.Assert.assertFalse;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import algorithms.data.structure.union.find.QuickUnion;
import algorithms.data.structure.union.find.QuickUnionWeighting;
import algorithms.data.structure.union.find.UnionFindBasis;

public class QuickUnionWeightingTests {

	
	@Test
	void basicUnionFindTest() {
		UnionFindBasis i1 = new QuickUnionWeighting(3);
		assertEquals(false, i1.connected(0, 1));
		
		i1.union(0, 1);
		
		assertEquals(true, i1.connected(0, 1));
		assertEquals(false, i1.connected(0, 2));
		
		i1.union(0, 2);
	}
	
	
	@Test
	void basicUnionFindTenItemsTest() {
		UnionFindBasis i1 = new QuickUnionWeighting(10);
		assertEquals(false, i1.connected(0, 1));
		
		i1.union(0, 1);
		
		assertEquals(true, i1.connected(0, 1));
		assertEquals(false, i1.connected(0, 2));
		
		i1.union(0, 2);
		
		i1.union(3, 9);
		assertTrue(i1.connected(3, 9));
		assertFalse(i1.connected(4, 5));
	}

	
	@Test
	void basicUnionFindItemsTest() {
		UnionFindBasis i1 = new QuickUnionWeighting(10);
		i1.union(0, 5);
		i1.union(0, 6);
		
		assertTrue(i1.connected(0, 5));
		
		i1.union(1, 2);
		i1.union(2, 7);
	}
	
	
	@Test
	void courseSampleTest() {
		UnionFindBasis i1 = new QuickUnionWeighting(10);
//		System.out.println(i1.getValues());
		
		i1.union(4, 3);
		i1.union(3, 8);
		i1.union(6, 5);
		i1.union(9, 4);
		i1.union(2, 1);
		
		assertTrue(i1.connected(8, 9));
		assertFalse(i1.connected(5, 4));
		
		i1.union(5, 0);
		i1.union(7, 2);
		i1.union(6, 1);
		i1.union(7, 3);
		
//		System.out.println(i1.getValues());
	}
	
	@Test
	void bookTest() {
		UnionFindBasis i1 = new QuickUnionWeighting(10);
		i1.union(4, 3);
		System.out.println(i1.getValues());
		i1.union(3, 8);
		i1.union(6, 5);
		System.out.println(i1.getValues());
		
		i1.union(9, 4);
		System.out.println(i1.getValues());
		
		i1.union(2, 1);
		System.out.println(i1.getValues());
		
		i1.union(8, 9);
		System.out.println(i1.getValues());
		
		i1.union(5, 0);
		i1.union(7, 2);
		i1.union(6, 1);
		i1.union(1, 0);
		i1.union(6, 7);
		System.out.println(i1.getValues());

		System.out.println(((QuickUnionWeighting) i1).getSz());
	}
	
	@Test
	void bookTest2() {
		UnionFindBasis i1 = new QuickUnionWeighting(10);
		i1.union(0, 1);
		System.out.println(i1.getValues());
		i1.union(2, 3);
		i1.union(4, 5);
		System.out.println(i1.getValues());
		
		i1.union(6, 7);
		System.out.println(i1.getValues());
		
		i1.union(0, 2);
		System.out.println(i1.getValues());
		
		i1.union(4, 6);
		System.out.println(i1.getValues());
		
		i1.union(0, 4);
		System.out.println(i1.getValues());

		System.out.println(((QuickUnionWeighting) i1).getSz());
		
		assertTrue(i1.connected(1, 5));
	}
	
}
