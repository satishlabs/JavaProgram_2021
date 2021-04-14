package com.singlyLinkedlist;

public class DeleteNodeWithGivenData {
	Node head;
	class Node{
		int data;
		Node next;
		public Node(int data) {
			this.data = data;
			next = null;
		}
	}
	
	public static void main(String[] args) {
		DeleteNodeWithGivenData list = new DeleteNodeWithGivenData();
		list.insert(1);
		list.insert(2);
		list.insert(3);
		list.insert(4);
		list.displayList();
		list.deleteNodeData(3);
		System.out.println("\nAfter deleted given data from linkedList");
		list.displayList();
	}

	private void deleteNodeData(int key) {
		Node temp = head;
		Node prev = null;
		
		//If head node itself holds the key to be deleted
		if(temp != null && temp.data == key) {
			head = temp.next;
			return;
		}
		
		//Search for key to be deleted, keep track of previous node as we need to change temp.next
		while(temp != null && temp.data != key) {
			prev = temp;
			temp = temp.next;
		}
		
		//If key was not present in linked list
		if(temp == null)
			return;
		
		prev.next = temp.next;
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
