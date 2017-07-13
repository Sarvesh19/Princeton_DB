package com.corejava;

class Sub extends SuperEx {
	Sub() {
		super(10);
		mi();
		System.out.println("sub's constructr called");

	}

	void mi() {
		new Sub();
	}
}

public class SuperEx implements Cloneable {
	SuperEx() {
		System.out.println("super's const called");
	}

	SuperEx(int i) {
		System.out.println("super's const called super(val) " + i);
	}

	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	public static void main(String[] args) { // new Sub().mi();
		try {
			SuperEx ex = new SuperEx();
			System.out.println(ex.hashCode());
			SuperEx ex1 = (SuperEx) ex.clone();
			System.out.println(ex1.hashCode());
		} catch (Exception e) {
			e.printStackTrace();
		}
		// System.out.println(s.hashCode());

	}
}
