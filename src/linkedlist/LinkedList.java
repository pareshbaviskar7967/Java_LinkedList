package linkedlist;

import java.util.Scanner;

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
			Node temp = head;
			while (temp.next != null) {
				temp = temp.next;
			}
			temp.next = new_node;
		}
	}

	public void addToFront(int data) {
		Node new_node = new Node(data);
		new_node.next = head;
		head = new_node;
	}

	public void append(int data) {
		Node new_node = new Node(data);
		new_node.next = null;
		if (head == null) {
			head = new_node;
		} else {
			Node temp = head;
			while (temp.next != null) {
				temp = temp.next;
			}
			temp.next = new_node;
		}
	}

	public void appendAfter(Node prev_node, int data) {
		if (prev_node == null) {
			System.out.println("Previous node shouldn't be null..");
		}

		Node new_node = new Node(data);
		new_node.next = prev_node.next;
		prev_node.next = new_node;
	}

	public void deleteFirst() {
		if (head == null) {
			System.out.println("List is empty");
		}
		Node temp = head;
		head = head.next;
		temp.next = null;
	}

	public void deleteLast() {
		if (head == null) {
			System.out.println("List is empty");
		}
		Node last = head;
		Node temp = null;
		while (last.next != null) {
			temp = last;
			last = last.next;
		}
		temp.next = null;
		last.next = temp.next;
	}

	public void searchNode(int data) {
		Node n = head;
		int count = 1;
		int flag = 0;
		while (n != null) {
			if (n.data == data) {
				flag = 1;
				break;
			}
			count = count + 1;
			n = n.next;
		}

		if (flag == 1)
			System.out.println("Node with value " + data + " is found at position " + count);
		else
			System.out.println("Element is not present in the list");
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
		Scanner scanner = new Scanner(System.in);
		LinkedList object = new LinkedList();
		object.append(56);
		object.append(70);
		object.append(45);
		object.append(17);
		object.printList();
		object.appendAfter(object.head, 30);
		System.out.println("\nAfter appending an element after the head element,");
		object.printList();
		object.deleteFirst();
		System.out.println("\nAfter deleting the first element,");
		object.printList();
		object.deleteLast();
		System.out.println("\nAfter deleting the last element,");
		object.printList();
		System.out.println("\nEnter the element to search: ");
		int node = scanner.nextInt();
		object.searchNode(node);
		object.appendAfter(object.head.next, 40);
		System.out.println("\nAfter appending an element after the element next to head,");
		object.printList();
	}
}