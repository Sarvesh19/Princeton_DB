package com.array;

public class InsertionSortTest {

	private static int[] insertionSort(int[] array) {
		int temp, j;
		for (int i = 1; i < array.length; i++) {
			temp = array[i];
			j = i - 1;
			while (j >= 0 && temp < array[j]) {
				array[j + 1] = array[j];
				j = j - 1;
			}
			array[j + 1] = temp;
		}

		return array;
	}

	public static void main(String[] args) {
		int array[] = { 14, 5, 4, 9, 75, -5 };
		for (int num : insertionSort(array)) {
			System.out.print(num + " ");
		}
	}
}
