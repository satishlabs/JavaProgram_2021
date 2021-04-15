package com.singlyLinkedlist;

public class DeleteAllList {
	Node head;
	class Node{
		Node next;
		int data;
		Node(int data){
			this.data = data;
			next = null;
		}
	}
	
	public static void main(String[] args) {
		DeleteAllList list = new DeleteAllList();
		list.insert(1);
		list.insert(2);
		list.insert(3);
		list.insert(4);
		System.out.println("\nCreated Linked List: ");
		list.displayList();
	}

	private void displayList() {
		
		
	}

	private void insert(int data) {
		Node new_node = new Node(data);
		new_node.next = head;
		head = new_node;
		
	}
}
