package com.singlyLinkedlist;

public class InsertionNode {
	 Node head;
	 
	class Node{
		int data;
		Node next;
		
		public Node(int data) {
			this.data = data;
			next=null;
		}
	}
	
	public static void main(String[] args) {
		InsertionNode list = new InsertionNode();
		list.insertInFront(1);
		list.insertInFront(2);
		list.insertInFront(3);
		list.insertInFront(4);
		System.out.println("\nInserted Node in Front");
		list.display();
		list.insertInEnd(5);
		list.insertInEnd(6);
		System.out.println("\nInserted Node in End");
		list.display();
		list.insertInAfter(list.head.next.next,7);
		//list.insertInAfter(list.head.next,8);
		System.out.println("\nInserted Node in End");
		list.display();
	}

	

	private void insertInAfter(Node prev_node, int data) {
		if(prev_node == null) {
			System.out.println("The given previous node can not be null");
			return;
		}
		Node new_node = new Node(data);
		
		new_node.next = prev_node.next;
		
		prev_node.next = new_node;
		
	}



	private void insertInEnd(int data) {
		//Node temp = head;
		Node new_node = new Node(data);
		while(head == null) {
			head = new Node(data);
			return;
		}
		
		new_node.next = null;
		Node last = head;
		while(last.next != null) 
			last = last.next;
			
			last.next = new_node;
			return;
	
	}

	public void display() {
		Node temp = head;
		while(temp != null) {
			
			System.out.print(temp.data+" ");
			temp = temp.next;
			
		}
		
	}

	public void insertInFront(int data) {
		Node new_node = new Node(data);
	
		new_node.next = head;
		
		head = new_node;
		
	}
}
