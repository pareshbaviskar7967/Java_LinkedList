package linkedlist;

public class LinkedList {
	Node head;

	static class Node {
		int data;
		Node next;

		Node(int d) {
			data = d;
			next = null;
		}
	}

	void print() {
		Node temp = head;
		while (temp != null) {
			System.out.println(temp.data + " -> ");
			temp = temp.next;
		}
		System.out.println();
	}

	void printList() {
		Node currNode = head;
		System.out.println("LinkedList: ");
		while (currNode != null) {
			System.out.print(currNode.data + " -> ");
			currNode = currNode.next;
		}
		System.out.println();
	}

	public static void main(String[] args) {

		LinkedList object = new LinkedList();

		object.head = new Node(56);
		Node second = new Node(30);
		Node third = new Node(70);

		object.head.next = second;
		second.next = third;

		object.printList();
	}
}