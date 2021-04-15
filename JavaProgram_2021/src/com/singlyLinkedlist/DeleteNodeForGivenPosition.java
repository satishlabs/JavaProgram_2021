package com.singlyLinkedlist;

public class DeleteNodeForGivenPosition {
	Node head;
	
	class Node{
		int data;
		Node next;
		
		Node(int data){
			this.data = data;
			next = null;
		}
	}
	public static void main(String[] args) {
		DeleteNodeForGivenPosition list = new DeleteNodeForGivenPosition();
		list.insert(1);
		list.insert(2);
		list.insert(3);
		list.insert(4);
		System.out.println("\nCreated Linked List is: ");
		list.display();
		
		list.deleteNode(2);
		System.out.println("\nLinked List After Deletion at position 3: ");
		list.display();
	}
	private void deleteNode(int position) {
		if(head == null)
			return;
		
		//Store head node
		Node temp = head;
		
		//If head needs to be removed
		if(position == 0) {
			head = temp.next;
			return;
		}
		
		//Find previous node of the node to be deleted
		for(int i=0; temp!= null && i<position-1; i++)
				temp = temp.next;
		
		//If position is more than number of nodes
		if(temp == null || temp.next == null)
				return;
		
		Node next = temp.next.next;
		
		temp.next = next;
		
	}
	private void display() {
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
