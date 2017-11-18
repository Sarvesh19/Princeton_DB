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
		if(tailTemp !=null){
			node.previous = tailTemp;
			tail.next = node;
			tail = tail.next;
			node.next = null;
			
		}
		
		
		this.modCount++;
	}

	public void addFirst() {

	}

	public void removeFirst() {

	}

	public void removeLast() {

	}

	public void remove(Object o) {

	}
	
	public boolean contains(Object o){
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
		System.out.println(dll);

		 LinkedList l = new LinkedList();
		 l.add("rvrv");
		 l.add("sat");
		 l.addLast("pitbull");
		 l.add("145");
		 System.out.println(l);

	}

}
