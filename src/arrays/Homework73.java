package arrays;

import java.util.Scanner;

public class Homework73 {
	public static void executeHomework() {
		Scanner sc = new Scanner(System.in);
		int[] array = new int[10];
		System.out.println("Enter array element");
		int element = sc.nextInt();
		//amazing row is coming....
		array[0] = array[1] = element;
		for (int i = 2; i < 10; i++) {
			array[i] = array[i - 1] + array[i - 2];
		}
		for (int j = 0; j < 10; j++) {
			System.out.print(" " + array[j] + " ");
		}

	}
}