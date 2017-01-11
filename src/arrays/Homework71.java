package arrays;

import java.util.Scanner;

public class Homework71 {

	public static void executeHomework() {
		int smallest;

		System.out.println("Enter array size");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[] array = new int[size];

		for (int j = 0; j < size; j++) {
			array[j] = sc.nextInt();
		}

		smallest = array[0];
		for (int i = 0; i < array.length; i++) {
			if (array[i] % 3 == 0) {
				if (array[i] < smallest) {
					smallest = array[i];
				}
			}
		}
		if (smallest % 3 == 0) {
			System.out.println("Element " + smallest + " is the smallest that can be divided to 3");
		} else {
			System.out.println("there is no number in the array that can be divided to 3");
		}
		sc.close();
	}
	

}
