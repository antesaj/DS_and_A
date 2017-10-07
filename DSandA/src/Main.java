public class Main {
	public static void main(String[] args) {
		
		// testing ClassicArray
		
		ClassicArray arr = new ClassicArray(10);
		arr.insert(0, Integer.MAX_VALUE);
		arr.insert(1, 99);
		arr.insert(2, 1001);
		arr.insert(3, -100);
		arr.insert(4, 25);
		arr.insert(5, Integer.MIN_VALUE);
		
		System.out.print("Unsorted: ");
		System.out.print(arr.toString());
		arr.selectionSort();
		System.out.println("\n");
		System.out.print("Sorted: ");
		System.out.println(arr.toString());
		
		System.out.println("\nThird largest element: " + arr.thirdLargest());
	}
	
}
