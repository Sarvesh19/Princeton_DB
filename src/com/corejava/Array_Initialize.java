package com.corejava;

import java.util.Scanner;

public class Array_Initialize {
	public static void main(String[] args) {
		Integer arr[][] = new Integer[3][4];
		Scanner sc = new Scanner(System.in);
		// System.out.println(arr.length);
		// System.out.println(arr[1].length);
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[1].length; j++) {
				arr[i][j] = sc.nextInt();

			}
		}

		for (int row = 0; row < arr.length; row++) {
			for (int col = 0; col < arr[1].length; col++) {
				arr[row][col] =arr[row][col];
				System.out.print(arr[row][col] + "\t");
			}
			System.out.println();
		}

		//
		// int[][] multD = new int[5][];
		// for (int i = 0; i < 5; i++) {
		// multD[i] = new int[10];
		// }
		// for (int j = 0; j < arr.length; j++) {
		// arr[i][j] = sc.nextInt();
		// }

		// for (int i = 0; i < 3; i++) {
		// // for (int j = 0; j < 4; j++) {
		// int j = 1;
		// arr[i][j] = sc.nextInt();
		// j++;
		// // }
		// }
		System.out.println(arr);
		sc.close();
	}
}
