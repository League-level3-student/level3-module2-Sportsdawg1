package _01_Searching_Algorithms;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class _04_SearchTest {

	// A MINIMUM OF 3 TESTS ARE REQUIRED FOR EACH METHOD
	
	@Test
	public void testLinearSearch() {
		//1. use the assertEquals method to test your linear search method.
		String[] letters = {"a", "b", "c", "d", "f", "e", "h"};
		assertEquals(0, _00_LinearSearch.linearSearch(letters, "a"));
		assertEquals(2, _00_LinearSearch.linearSearch(letters, "c"));
		assertEquals(4, _00_LinearSearch.linearSearch(letters, "f"));
	}

	@Test
	public void testBinarySearch() {
		//2. use the assertEquals method to test your binary search method.
		//   remember that the array must be sorted
		int[] numbers = {1,3,4,5,7,8,12,19,20,21,22,30};
		assertEquals(5, _01_BinarySearch.binarySearch(numbers, 0, numbers.length, 8));
		assertEquals(3, _01_BinarySearch.binarySearch(numbers, 0, numbers.length, 5));
		assertEquals(10, _01_BinarySearch.binarySearch(numbers, 0, numbers.length, 22));
	}
	
	@Test
	public void testInterpolationSearch() {
		//3. use the assertEquals method to test your interpolation search method.
		//   remember that the array must be sorted and evenly distributed
	    //int[] numbers = {7,14,21,28,35,42,49,56,63,70,77,84,91,98};
		//int[] numbers = {2,4,6,8,10,12,14,16,18,20,22,24,26,28,30,32,34,36,38,40};
		int[] numbers = {0,1,2,3,4};
		assertEquals(0,_02_InterpolationSearch.interpolationSearch(numbers, 0));
		assertEquals(4,_02_InterpolationSearch.interpolationSearch(numbers, 4));
		//assertEquals(13,_02_InterpolationSearch.interpolationSearch(numbers, 98));
		//assertEquals(0,_02_InterpolationSearch.interpolationSearch(numbers, 7));
		//assertEquals(19,_02_InterpolationSearch.interpolationSearch(numbers, 40));
	}
	
	@Test
	public void testExponentialSearch() {
		//4. use the assertEquals method to test your exponential search method.
		//   remember that the array must be sorted
		int[] numbers = {1,3,4,5,7,8,12,19,20,21,22,30};
		assertEquals(5, _03_ExponentialSearch.exponentialSearch(numbers, 8));
		assertEquals(3, _03_ExponentialSearch.exponentialSearch(numbers, 5));
		assertEquals(10, _03_ExponentialSearch.exponentialSearch(numbers, 22));
	}
}

