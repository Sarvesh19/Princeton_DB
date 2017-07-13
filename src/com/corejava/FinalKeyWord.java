package com.corejava;

public class FinalKeyWord {
	final String s = "41";

	final void show() {
		System.out.println("show method");
	}

	public static void main(String[] args) {
		final String s = "Sarvesh";
		// s = s + "yadav"; won't compile

		String s1 = "Sarvesh";
		s1 = s1 + " yadav";
		System.out.println(s1);
	}
}
