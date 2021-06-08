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

	public void add(int data) {
		Node new_node = new Node(data);
		new_node.next = null;
		if (head == null) {
			head = new_node;
		} else {
			Node currNode = head;
			while (currNode.next != null) {
				currNode = currNode.next;
			}
			currNode.next = new_node;
		}
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

		object.add(56);
		object.add(30);
		object.add(70);

		object.printList();
	}
}