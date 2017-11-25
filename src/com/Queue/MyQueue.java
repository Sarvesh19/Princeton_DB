package com.infy;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Queue;

public class MyQueue {

	Object rear;
	Object front;
	int size = 0;
	Object[] array = {};
	Object[] temp = {};
	int tempArrayLenMAX = 0;
	int tempArrayLenMin = 0;
	int tempo = 0;

	MyQueue() {
		// array = new Object[10];
		// tempArrayLenMAX = array.length - 1;
	}

	public boolean enqueue(Object o) {
		array = Arrays.copyOf(array, size + 1);
		array[tempArrayLenMAX] = o;
		tempArrayLenMAX++;
		size++;
		System.out.println(o + " has been enqueued");
		return true;
	}

	public boolean dequeue() {

		System.out.println(array[0] + " Dequeued from queue");

		int numMoved = tempArrayLenMAX - 1;
		array[0] = null;
		if (numMoved > 0)
			System.arraycopy(array, 1, array, 0, numMoved);
		size--;
		array = Arrays.copyOf(array, size);
		tempArrayLenMAX--;

		return true;
	}

	public boolean isEmpty() {
		return array.length == 0;
	}

	public static void main(String[] args) {
		MyQueue myQueue = new MyQueue();
		myQueue.enqueue("wfwf");
		myQueue.enqueue("sarvesh");

		myQueue.enqueue("Larvesh");
		myQueue.enqueue("Parvesh");
		System.out.println(myQueue);

		System.out.println("dequeue ---------------------------");
		myQueue.dequeue();
		myQueue.dequeue();
		System.out.println("Ho gaya kya empty = "+ myQueue.isEmpty());
		myQueue.enqueue("tip");
		myQueue.enqueue("toe");
		myQueue.dequeue();
		myQueue.dequeue();
		myQueue.dequeue();
		myQueue.dequeue();
		System.out.println("Ho gaya kya empty = "+ myQueue.isEmpty());

	}
}
