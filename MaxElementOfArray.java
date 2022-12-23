package max_element_array;

import java.util.Scanner;

public class Max {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner read = new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		int size = read.nextInt();
		int[] Arr = new int[size];
		System.out.println("Enter the elements of the Array: ");

		for (int i = 0; i < Arr.length; i++) {
			Arr[i] = read.nextInt();
		}

		int max = Arr[0];

		for (int i = 0; i < Arr.length; i++) {
			if (Arr[i] > max) {
				max = Arr[i];
			}
		}
		System.out.println("The largest element in the Array is: " + max);

	}

}
