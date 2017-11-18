import java.rmi.UnexpectedException;
import java.util.LinkedList;

public class DoublylinkedList {
	private Node head;
	private Node tail;
	private int modCount = 0;
	private int count = 0;

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

	public int size() {
		return modCount;
	}

	public boolean isEmpty() {
		return head == null;
	}

	public static void main(String[] args) throws UnexpectedException {
		DoublylinkedList dll = new DoublylinkedList();
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
		System.out.println("Is contains " + dll.contains("bhai me last me hu"));
		System.out.println("Is contains "
				+ dll.contains("bhai ,,,me last me hu"));
		System.out.println(dll);
		System.out.println(dll.isEmpty());
		// LinkedList l = new LinkedList();
		// l.add("rvrv");
		// l.add("sat");
		// l.addLast("pitbull");
		// l.add("145");
		// System.out.println(l);

	}

}
