public class SelectionSort {

    public static void method2(int[] arr) {//selection sort
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
}
