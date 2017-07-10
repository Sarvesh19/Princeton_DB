package com.corejava;

public class StringClass {
	public static void main(String[] args) {
		String s1 = new String("Sarvesh").intern();
		String s2 = "Sarvesh";
		String s4 = new String("Sarvesh");
		/*
		 * 
		 * 
		 * In Java 6 days all interned strings were stored in the
		 * PermGen – the fixed size part of heap mainly used for storing loaded
		 * classes and string pool. Besides explicitly interned strings, PermGen
		 * string pool also contained all literal strings earlier used in your
		 * program.
		 * 
		 * The biggest issue with string pool in Java 6 was its location – the
		 * PermGen. PermGen has a fixed size and can not be expanded at runtime.
		 * You can set it using -XX:MaxPermSize=N option.
		 * 
		 * engineers made an extremely important change to the string pooling
		 * logic in Java 7 – the string pool was relocated to the heap. It means
		 * that you are no longer limited by a separate fixed size memory area.
		 * All strings are now located in the heap, as most of other ordinary
		 * objects, which allows you to manage only the heap size while tuning
		 * your application.
		 * 
		 * After calling intern() method on s1 and s2, s1.intern() ==
		 * s2.intern(), if s1.equals(s2) because both will be pointing same
		 * String constant in pool.
		 * 
		 * Read more:
		 * http://javarevisited.blogspot.com/2015/12/when-to-use-intern-method-
		 * of-string-in-java.html#ixzz4mPZHuKny
		 * 
		 * Prior to Java 6, uncontrolled usage of String.intern() method can
		 * cause java.lang.OutOfMemory: PermGen space because String pool was
		 * physically located on PermGen area of Java heap, which is quite small
		 * in many JVM (32M to 96M) and fixed. From Java 7 onward, the intern()
		 * method has become even more useful because String pool is relocated
		 * to main heap space of JVM. This will help to further reduce String
		 * duplication by using String.intern() method.
		 * 
		 * Read more:
		 * http://javarevisited.blogspot.com/2015/12/when-to-use-intern-method-
		 * of-string-in-java.html#ixzz4mPZAc4UO
		 */ String s3 = "Sarvesh";
		if (s1 == s2) {
			System.out.println("Same reference from string pool");
		} else {
			System.out.println("not from same ref");
		}
	}
}
