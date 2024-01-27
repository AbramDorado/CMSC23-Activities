
public class DoradoSort {
	public static void main(String[] args){
		int[] arr = {3, 5, 1, 6, 8, 10};

		System.out.println("unsorted array:");
		for (int j : arr) {
			System.out.print(j);
		}
		System.out.println();
		System.out.println();

		//print each method using 3 Different sorting algorithms
		method1(arr);
		System.out.println("insertion sort:");
		for (int j : arr) {
			System.out.print(j);
		}
		System.out.println();

		method2(arr);
		System.out.println("selection sort:");
		for (int j : arr) {
			System.out.print(j);
		}
		System.out.println();

		method3(arr);
		System.out.println("bubble sort:");
		for (int j : arr) {
			System.out.print(j);
		}
		System.out.println();
	}
	

	
	public static void method1(int[] arr){ //insertion sort
		for (int i = 1; i < arr.length; ++i) {
			int point = arr[i]; //assign a point value to compare
			int j = i - 1;  //value of j for indexing

			while (j >= 0 && arr[j] > point) { //loop through the array
				arr[j + 1] = arr[j]; //assign to nxt index
				j = j - 1; //update the value of j
			}
			arr[j + 1] = point; //assign point to arr[j+1] index
		}
	}

	public static void method2(int[] arr){ //selection sort
		int size = arr.length;
		for (int i = 0; i < size-1; i++) //One by one move boundary of unsorted sub-array
		{
			int smallest_index = i;
			for (int j = i+1; j < size; j++) //finding the minimum element in the array
				if (arr[j] < arr[smallest_index]) //if statement to switch if conditions met
					smallest_index = j;//update the value of index

			//swapping of the values
			int temp = arr[smallest_index]; //assign arr[smallest_index] to temp
			arr[smallest_index] = arr[i]; //assign arr[i] to arr[smallest_index]
			arr[i] = temp; //assign temp to input_array[i]
		}
	}



	public static void method3(int[] arr){ //bubble sort
		int size = arr.length;
		for (int i = 0; i < size - 1; i++) //loop to access each array
			for (int j = 0; j < size - i - 1; j++)//loop to compare array
				if (arr[j] > arr[j + 1]) //if statement to switch if conditions met
				{
					//swapping of the values
					int temp = arr[j]; //assign arr[j] to temp
					arr[j] = arr[j + 1]; //assign arr[j] to arr[j+i]
					arr[j + 1] = temp; //assign temp to arr[j+1]
				}
	}
}
