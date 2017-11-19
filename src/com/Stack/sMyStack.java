package com.infy;

import java.util.Arrays;

/* 
 * This class is for creating own stack
 * @author Sarvesh Yadav
 * 
 * */
public class MyStack {

	// private int initialLen = 10;
	private Object array[] = {};
	private int index = 0;
	private int size = 0;
	private static final int MAX_ARRAY_SIZE = Integer.MAX_VALUE - 8;

	public boolean push(final Object val) {
		// if (size > initialLen - 1) {
		// array = java.util.Arrays.copyOf(array, array.length * 2,
		// Object[].class);
		// }+/
		ensureCapacityHelper(size + 1);
		array[index] = val;
		index++;
		size++;
		return true;
	}

	public MyStack() {
	}

	public MyStack(int size) {
		array = new Object[size];
	}

	private void ensureCapacityHelper(int size) {
			if (size - array.length > 0)
				grow(size);
	}

	private void grow(int size) {
		int oldCapacity = array.length;
		int newCapacity = oldCapacity;
		if (newCapacity - size < 0)
			newCapacity = size;
		if (newCapacity - MAX_ARRAY_SIZE > 0)
			newCapacity = hugeCapacity(size);
		array = Arrays.copyOf(array, newCapacity);
	}

	private static int hugeCapacity(int minCapacity) {
		if (minCapacity < 0) // overflow
			throw new OutOfMemoryError();
		return (minCapacity > MAX_ARRAY_SIZE) ? Integer.MAX_VALUE
				: MAX_ARRAY_SIZE;
	}

	public boolean pop() {
		if (size >= 0) {
			array[size - 1] = null;
			size--;
			return true;
		} else {
			return false;
		}

	}

	public Object[] getStack() {
		return array;
	}

	public int size() {
		return size;
	}

	public Object get(int index) {
		return array[index];
	}

	public boolean contains(Object o) {
		return indexOf(o) >= 0;
	}

	private int indexOf(Object o) {
		if (o == null) {
			for (int i = 0; i < size; i++)
				if (array[i] == null)
					return i;
		} else {
			for (int i = 0; i < size; i++)
				if (o.equals(array[i]))
					return i;
		}
		return -1;
	}

	public Object remove(int index) {

		if (index >= size)
			throw new ArrayIndexOutOfBoundsException(index);
		Object oldValue = array[index];

		int numMoved = size - index - 1;
		if (numMoved > 0)
			System.arraycopy(array, index + 1, array, index, numMoved);
		array[--size] = null; // Let gc do its work

		return oldValue;

	}

	public boolean remove(Object o) {
		return false;

	}

	@Override
	public String toString() {
		return "Stack [array=" + Arrays.toString(array) + ", index=" + index
				+ ", size=" + size + "]";
	}

	public static void main(String[] args) {
		MyStack stack = new MyStack();
		stack.push(154);
		stack.push("wecwe");
		stack.push(15488);
		stack.push("wecwe");
		stack.push(154);
		stack.push("wecwe");
		stack.push(154);
		stack.push("wecwe");
		stack.push(154);
		stack.push("wecwe");
		stack.push(15488);
		stack.push(154444);
		stack.pop();
		stack.remove(2);
		stack.pop();
		// stack.pop();
		// stack.pop();
		// stack.pop();
		// stack.pop();
		// stack.pop();
		// stack.pop();
		// stack.pop();
		// stack.pop();
		// stack.pop();
		// stack.pop();
		// stack.pop();
		// stack.pop();
		// stack.pop();
		// stack.

		for (int i = 0; i < stack.size(); i++) {
			System.out.println(stack.getStack()[i]);
		}
		System.out.println(stack.size());
		System.out.println("?????????????????????????????");
		System.out.println(stack.get(2));
		System.out.println(stack.contains(25));
		System.out.println(stack.contains(154444));
		System.out.println(stack.contains(15488));
		java.util.Stack s = new java.util.Stack();
		// System.out.println(s.remove(0));
		;

		// System.out.println(stack);
		// List<Object> list = new ArrayList<>(10);
		// list.add(5411);
		// System.out.println(list.contains(154444));
	}
}
