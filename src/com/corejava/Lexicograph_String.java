package com.corejava;

import java.util.Scanner;

public class Lexicograph_String {
	public static void main(String[] args) {
		String str1 = "", str2 = "";
		Scanner sc = new Scanner(System.in);
		String A = sc.next();
		String B = sc.next();
		System.out.println(A.length() + B.length());

		if (A.compareTo(B) > 0) {
			System.out.println("yes");
		} else {
			System.out.println("no");
		}
		for (int i = 0; i < A.length(); i++) {
			if (i == 0) {
				str1 = str1 + A.toUpperCase().charAt(0);
			} else {
				str1 = str1 + A.charAt(i);

			}
		}
		for (int i = 0; i < B.length(); i++) {
			if (i == 0) {
				str2 = str2 + B.toUpperCase().charAt(0);
			} else {
				str2 = str2 + B.charAt(i);
			}
		}
		System.out.println(str1 + " " + str2);
		sc.close();
	}

}
