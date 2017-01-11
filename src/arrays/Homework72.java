package arrays;

import java.util.Scanner;

public class Homework72 {

	public static void executeHomework() {
		Scanner sc = new Scanner(System.in);
		int size;
		do {
			System.out.println("Enter even number for array size");
			size = sc.nextInt();
		} while (size % 2 != 0);
		int[] array = new int[size];
		for (int i = 0; i < size / 2; i++) {
			System.out.println("Enter elements");
			array[i] = sc.nextInt();
		}
		System.arraycopy(array, 0, array, size / 2, size / 2);
		for (int j =0; j < size; j++){
			System.out.print(array[j]);
		}
	}

}