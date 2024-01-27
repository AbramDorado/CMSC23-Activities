public class DoradoSortDriver {
	public static void main(String[] args){
		int[] arr = {3, 5, 1, 6, 8, 10};

		System.out.println("unsorted array:");
		for (int j : arr) {
			System.out.print(j);
		}
		System.out.println();
		System.out.println();

		//print each method using 3 Different sorting algorithms
		InsertionSort.method1(arr); // call the class InsertionSort
		System.out.println("insertion sort:");
		for (int j : arr) {
			System.out.print(j);
		}
		System.out.println();

		SelectionSort.method2(arr); // call the class SelectionSort
		System.out.println("selection sort:");
		for (int j : arr) {
			System.out.print(j);
		}
		System.out.println();

		BubbleSort.method3(arr); // call the class BubbleSort
		System.out.println("bubble sort:");
		for (int j : arr) {
			System.out.print(j);
		}
		System.out.println();
	}
}