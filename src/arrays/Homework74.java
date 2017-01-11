package arrays;

import java.util.Scanner;

public class Homework74 {

	public static void executeHomework() {
		System.out.println("Enter array size");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		boolean mirror = true;
		int[] array = new int[size];
		for (int i = 0; i < size; i++) {
			System.out.println("Enter elements");
			array[i] = sc.nextInt();
		}
		for (int j = 0; j < size / 2; j++) {
			if (array[j] != array[size - j]) {
				mirror = false;
				break;
			}
		}
		//one more if to check miror value
		System.out.println("this is not a mirror array");
	}
}
