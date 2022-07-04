package com.bridgelabz;

public class LinkedListMain {

	public static void main(String[] args) {
		LinkedList linkedlist = new LinkedList();
		System.out.println("LINKED LIST");
		linkedlist.addLast(56);
		linkedlist.display();
		linkedlist.addLast(70);
		linkedlist.display();
		linkedlist.insertAtSpecificIndex(1,30);
		linkedlist.display();
		System.out.println("Last Element Deleted");
		linkedlist.deleteLast();
		linkedlist.display();
	}
}
