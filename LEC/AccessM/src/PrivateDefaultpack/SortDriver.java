package PrivateDefaultpack;

import ProtectedPublicpack.*;

public class SortDriver extends ProtectedP {
	
	private static void methodPrivate(int[] arr) { //insertion sort
		for (int i = 1; i < arr.length; ++i) {
			int point = arr[i]; //assign a point value to compare
			int j = i - 1;  //value of j for indexing

			while (j >= 0 && arr[j] > point) { //loop through the array
				arr[j + 1] = arr[j]; //assign to nxt index
				j = j - 1; //update the value of j
			}
			arr[j + 1] = point; //assign point to arr[j+1] index
		}
		System.out.println("insertion sort Private:");
		for (int j : arr) {
			System.out.print(j);
		}
		System.out.println();
		System.out.println();
	}


	public static void main(String[] args) {
		int[] arr = {3, 5, 1, 6, 8, 10};

		System.out.println("unsorted array:");
		for (int j : arr) {
			System.out.print(j);
		}
		System.out.println();
		System.out.println();
		
		//implement private access
		//accessible within the class only
		methodPrivate(arr);
		
		//implement default access
		//accessible within the same package
		DefaultP obj1 = new DefaultP();
		obj1.methodDefault(arr);

		//implement protected access
		//accessible within the same package or outside the package through inheritance
		SortDriver obj2 = new SortDriver();
		obj2.methodProtected(arr);

		//implement public access
		//accessible everywhere
		PublicP obj3 = new PublicP();
		obj3.methodPublic(arr);
		
		
		
	}
}