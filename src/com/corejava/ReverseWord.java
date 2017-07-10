package com.corejava;

import java.util.Scanner;

public class ReverseWord {
	static String getReversedWord(String str) {
		String newStr = "";
		int strLen = str.length();
		for (int i = 0; i < str.length(); i++) {
			newStr = newStr + str.charAt(strLen - 1);
			strLen--;
		}
		return newStr;
	}

	static boolean isPalendrome(String str) {
		int len = str.length();
		while (len > 1) {
			int i = 0;
			int lastIndx = str.length() - 1;
			if (lastIndx >= lastIndx / 2 + 1) {
				if (str.charAt(i) == str.charAt(lastIndx)) {
					lastIndx--;
					i++;
					// if (lastIndx == str.length() / 2) {
					// return true;
					// }
					len--;
					if (len == lastIndx / 2 + 1) {
						return true;
					}
					
				}
				i++;
				len--;
			}

		}

		return false;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		boolean iPal = isPalendrome(str);
		System.out.println(iPal);
		String newStr = getReversedWord(str);
		System.out.println(newStr);
		sc.close();
	}
}
