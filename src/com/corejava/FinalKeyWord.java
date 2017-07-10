package com.corejava;

public class FinalKeyWord {
	public static void main(String[] args) {
		final String s = "Sarvesh";
		// s = s + "yadav";  won't compile
		
		String s1 = "Sarvesh";
		s1 = s1 + " yadav";
		System.out.println(s1);
	}
}
