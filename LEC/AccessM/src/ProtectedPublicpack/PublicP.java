package ProtectedPublicpack;

public class PublicP {
	public void methodPublic (int[] arr){ //insertion sort
        for (int i = 1; i < arr.length; ++i) {
			int point = arr[i]; //assign a point value to compare
			int j = i - 1;  //value of j for indexing

			while (j >= 0 && arr[j] > point) { //loop through the array
				arr[j + 1] = arr[j]; //assign to nxt index
				j = j - 1; //update the value of j
			}
			arr[j + 1] = point; //assign point to arr[j+1] index
		}
        
        
        System.out.println("insertion sort Public:");
		for (int j : arr) {
			System.out.print(j);
		}
		System.out.println();
		System.out.println();
	}
}
