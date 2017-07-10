package com.corejava;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class OccuranceOfWord {

	static void getOccuranceOfWord(String str) {
		String str1 = str.replaceAll("( +)", " ").trim();
		String[] strArr = str1.split(" ");
		List<String> list = Arrays.asList(strArr);
		Map<String, Integer> occurrences = new HashMap<String, Integer>();

		for (String word : list) {
			Integer oldCount = occurrences.get(word);
			if (oldCount == null) {
				oldCount = 0;
			}
			occurrences.put(word, oldCount + 1);
		}
		
		Iterable<Map.Entry<String, Integer>> occurrence = occurrences.entrySet();
		for(Map.Entry<String, Integer> word: occurrence){
			System.out.println(word);
		}
		

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		getOccuranceOfWord(str);

		sc.close();
	}
}
