package com.infy;

import java.rmi.UnexpectedException;

import com.infy.MyStack;

/* 
 * This class is complete doublylinked list
 * It prvides various features like adding deleting and etc.
 * It contains minimal complexity
 * @author Sarvesh Yadav
 * 
 * */
public class DoublyLinkedList {
	private Node head;
	private Node tail;
	private int modCount = 0;

	/*
	 * The Inner Node class which provide property @next @previous and @element
	 */
	private class Node {
		private Node next;
		private Node previous;
		private Object element;

		public Node(Node next, Node previous, Object element) {
			super();
			this.next = next;
			this.previous = previous;
			this.element = element;
		}

	}

	/*
	 * Adding element to the next node Need to handle when list is empty
	 */
	public boolean add(Object o) {
		Node node = new Node(null, null, o);
		if (head != null) {
			tail.next = node;
			node.previous = tail;
			tail = node;

		}
		if (head == null) {
			head = node;
		}

		if (tail == null) {
			tail = head;
		}
		this.modCount++;
		return true;
	}

	/*
	 * Adding element to the specific node
	 */
	public boolean add(Object o, int pos) throws UnexpectedException {
		Node node = new Node(null, null, o);

		if (pos > modCount || pos < 0) {
			throw new UnexpectedException(
					"Add valid position to add element in list");
		} else {
			Node temp = head;
			for (int i = 0; i < pos; i++) {

				temp = temp.next;

				if (i == pos - 1) {
					Node afterOfNewBlockNode = temp.next;
					node.previous = temp;
					node.next = afterOfNewBlockNode;
					// node = afterOfNewBlockNode.previous;
					temp.next = node;
					afterOfNewBlockNode.previous = node;
				}

				// node.previous = temp;
				// temp.next = node;

			}
			modCount++;
			// System.out.println("count" + count);

		}

		return true;
	}

	/*
	 * Adding element to last tail the node
	 */
	public void addLast(Object o) {
		Node node = new Node(null, null, o);
		if (head == null) {
			head = node;
		}

		if (tail == null) {
			tail = head;
		}
		Node tailTemp = tail;
		if (tailTemp != null) {
			node.previous = tailTemp;
			tail.next = node;
			tail = tail.next;
			node.next = null;

		}

		this.modCount++;
	}

	/*
	 * Adding element to first i.e. head the node
	 */
	public void addFirst(Object o) {
		Node node = new Node(null, null, o);

		if (head != null) {
			Node temp = head;
			node.next = temp;
			node.previous = null;
			temp.previous = node;
			head = node;
		}
		if (head == null) {
			head = node;
		}

		if (tail == null) {
			tail = head;
		}

	}

	/*
	 * remove element to first i.e. head the node
	 */
	public void removeFirst() {
		if (head == null) {
			System.out.println("No element to remove");
		}
		if (head != null) {
			Node temp = head;
			head = temp.next;
			head.previous = null;
			temp.next = null;
			modCount--;
		}
	}

	/*
	 * remove element to last i.e. tail the node
	 */
	public void removeLast() {
		if (head == null) {
			System.out.println("No element to remove");
		}
		if (head != null) {
			Node temp = tail;
			tail = temp.previous;
			tail.next = null;
			temp.previous = null;
			modCount--;
		}
	}

	/*
	 * remove specific node using equals
	 */
	public void remove(Object o) {
		Node temp = head;
		while (o != temp.element) {
			temp = temp.next;
			if (temp.next == null) {
				System.out.println("Can't remove which is not in list");
				break;
			}
		}
		if (o.equals(temp.element)) {
			Node tempprevious = temp.previous;
			tempprevious.next = temp.next;
			temp.next.previous = tempprevious;
			temp.next = null;
			temp.previous = null;

			modCount--;
		}

	}

	/*
	 * check object is in list or not
	 */
	public boolean contains(Object o) {

		Node temp = head;
		while (o != temp.element) {
			temp = temp.next;
			if (temp.next == null) {
				System.out.println("No doesn't exist " + o);
				break;
			}

		}
		if (o.equals(temp.element)) {
			System.out.println("Yes It is exist " + o);
		}
		return false;
	}

	/*
	 * @return size of list
	 */
	public int size() {
		return modCount;
	}

	/*
	 * @return is list empty
	 */
	public boolean isEmpty() {
		return head == null;
	}

	/*
	 * @return forward iteration of list into my satck
	 */
	public Object[] iterateForward() {
		Node temp = head;
		if(head != null){
			MyStack myStack = new MyStack();
			if (temp != null) {
				myStack.push(temp.element);
			}
			while (temp.next != null) {
				temp = temp.next;
				myStack.push(temp.element);
				if (temp.next == null) {
					break;
				}
			}
			return myStack.getStack();
		}else {
			System.out.println("No element to iterate");
		}
		return null;
	}
	
	/*
	 * @return forward iteration of list into my satck
	 */
	public Object[] iterateBackword() {
		Node temp = tail;
		MyStack myStack = new MyStack();
		if (temp != null) {
			myStack.push(temp.element);
		}
		while (temp.previous != null) {
			temp = temp.previous;
			myStack.push(temp.element);
			if (temp.next == null) {
				break;
			}
		}
		return myStack.getStack();

	}

	public static void main(String[] args) throws UnexpectedException {
		boolean toRun = false;
		if (toRun) {
			DoublyLinkedList dll = new DoublyLinkedList();
			System.out.println(dll.isEmpty());
			dll.add("ccw");
			dll.add("sarvesh");
			dll.add("raoda");
			dll.add("fr");
			dll.add("eww");
			dll.add("drrrr", 3);
			dll.add("raefeoda");
			dll.add("www");
			dll.addLast("bhai me last me hu");
			dll.addLast("bhai me last me hu ekdum");
			System.out.println(dll.size());

			dll.remove("drrrr");
			System.out.println(dll.size());
			dll.removeFirst();
			dll.removeLast();

			dll.addFirst("kekde");

			dll.remove("eferfercw");
			System.out.println(dll.size());
			System.out.println("Is contains "
					+ dll.contains("bhai me last me hu"));
			System.out.println("Is contains "
					+ dll.contains("bhai ,,,me last me hu"));
			System.out.println(dll);
			System.out.println(dll.isEmpty());
		}

	}

}
