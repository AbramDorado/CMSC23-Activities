public class BubbleSort {

    public static void method3 (int[] arr){//bubble sort
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
