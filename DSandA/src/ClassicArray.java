
// This class creates a classic array data structure
// and provides various methods that can be used to
// manipulate it.
//
// The primary purpose is to practice writing sorting algorithms;
// test cases will be performed in Main.

public class ClassicArray {
	
	private int[] arr;
	
	/*
	 * Classic array constructor
	 */
	
	public ClassicArray(int size) {
		arr = new int[size];
	}
	
	/*
	 * Bubble Sort the classic array
	 */
	
	public void bubbleSort() {
		int left, right;
		for (right = arr.length - 1; right > 1; right--) {
			for (left = 0; left < right; left++) {
				if (arr[left] > arr[left + 1]) {
					swap (left, right);
				}
			}
		}
	}
	
	/*
	 * Array element Swap method
	 */
	
	public void swap(int left, int right) {
		int temp = arr[left];
		arr[left] = arr[left + 1];
		arr[left + 1] = temp;
	}
	
	/*
	 * Insert element at the end of array
	 */
	
	public void insert(int i, int pInt) {
		arr[i] = pInt;
	}
	
	/*
	 * (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	
	@Override
	public String toString() {
		String x = "";
		for (int i = 0; i < arr.length; i++) {
			x += arr[i] + " ";
		}
		return x;
		
	}
	
}
