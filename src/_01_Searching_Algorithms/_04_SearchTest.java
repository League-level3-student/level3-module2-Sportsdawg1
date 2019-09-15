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
	}
	
	@Test
	public void testExponentialSearch() {
		//4. use the assertEquals method to test your exponential search method.
		//   remember that the array must be sorted
	}
}
