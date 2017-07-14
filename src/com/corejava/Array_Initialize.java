/**
 * 
 */

/**
 * @author Sarvesh
 *
 */
import java.util.Scanner;

public class Array_Initialize {
	static Integer[][] getFirstMatrix(Scanner sc) {
		System.out.println("Enter row followd by column :");
		int row1 = sc.nextInt();
		int column = sc.nextInt();
		Integer arr[][] = new Integer[row1][column];
		System.out.println("Now fill " + row1 + " rows and " + column
				+ " column");

		// System.out.println(arr.length);
		// System.out.println(arr[1].length);
		if (arr.length > 1) {
			for (int i = 0; i < arr.length; i++) {
				for (int j = 0; j < arr[0].length; j++) {
					arr[i][j] = sc.nextInt();

				}
			}

			for (int row = 0; row < arr.length; row++) {
				for (int col = 0; col < arr[0].length; col++) {
					arr[row][col] = arr[row][col];
					System.out.print(arr[row][col] + "\t");
				}
				System.out.println();
			}
		} else {
			for (int i = 0; i < arr.length; i++) {
				for (int j = 0; j < arr[0].length; j++) {
					arr[i][j] = sc.nextInt();

				}
			}

		}

		return arr;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Integer[][] matrix1 = getFirstMatrix(sc);
		Integer[][] matrix2 = getFirstMatrix(sc);
		sc.close();
		Integer arr[][] = new Integer[matrix1.length][matrix2[0].length];
		if (matrix1[0].length == matrix2.length) {
			for (int i = 0; i < matrix1.length; i++) {
				
				for (int j = 0; j < matrix2[0].length; j++) {
					int sum = 0;
					for (int k = 0; k < matrix2.length; k++) {
						sum += (matrix1[i][k] * matrix2[k][j]);

					}
					arr[i][j] = sum;
				}
			}
			for (int row = 0; row < arr.length; row++) {
				for (int col = 0; col < arr[0].length; col++) {
					arr[row][col] = arr[row][col];
					System.out.print(arr[row][col] + "\t");
				}
				System.out.println();
			}

		} else {
			System.out.println("First's column not matching with other's row");
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
	}
}
