package _00_Sorting_Algorithms;

import java.util.Random;

public class BogoSorter extends Sorter {
	public BogoSorter() {
		type = "Bogo";
	}
	
	// Bogo sort is a joke sorting algorithm. It is considered the most 
	// inefficient sorting algorithm while still maintaining the possibility
	// of eventually sorting data.
	
	// It works by following these steps:
	// STEP 1. Is the array in order?
	//	if yes, finished; if no, go to step 2.
	// STEP 2. Take two random elements in the array and swap them.
	// STEP 3. Go back to step 1.
	
	//1. Complete the sort method using the Bogo sort algorithm. 
	@Override
	void sort(int[] array, SortingVisualizer display) {
		boolean uhoh = true;
		while (uhoh) {
			int randInt1 = new Random().nextInt(array.length);
			System.out.println(randInt1);
			int randInt2 = new Random().nextInt(array.length);
			System.out.println(randInt2);
			for (int i = 0; i < array.length - 1; i++) {
				if(array[i] <= array[i+1]) {
					uhoh = false;
				} else {
					int hold = array[randInt1];
					array[randInt1] = array[randInt2];
					array[randInt2] = hold;
					display.updateDisplay();
					uhoh = true;
					break;
				}
				
			}
		}
	}
}
