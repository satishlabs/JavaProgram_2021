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
		
		System.out.println("\nDeleting the list");
		list.deleteList();
		System.out.println("\nLinkedList deleted");
	}

	private void deleteList() {
		head =null;
		
	}

	private void displayList() {
		Node temp = head;
		while(temp != null) {
			System.out.print(temp.data+" ");
			temp = temp.next;
		}
		
	}

	private void insert(int data) {
		Node new_node = new Node(data);
		new_node.next = head;
		head = new_node;
		
	}
}
