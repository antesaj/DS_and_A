
// This class creates a classic array data structure
// and provides various methods that can be used to
// manipulate it.
//
// The primary purpose is to practice writing searching/sorting
// algorithms; test cases will be performed in Main.

public class ClassicArray {
	
	private int[] arr;
	
	/*
	 * Classic array constructor
	 */
	
	public ClassicArray(int size) {
		arr = new int[size];
	}
	
	/*
	 * Finding third largest element
	 */
	
	public int thirdLargest() {
		int first = arr[0];
		int second = Integer.MIN_VALUE;
		int third = Integer.MIN_VALUE;
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > first) {
				third = second;
				second = first;
				first = arr[i];
			} else if (arr[i] > second) {
				third = second;
				second = arr[i];
			} else if (arr[i] > third) {
				third = arr[i];
			}
		}
		return third;
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
