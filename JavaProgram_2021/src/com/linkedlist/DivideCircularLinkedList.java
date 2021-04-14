package com.linkedlist;

public class DivideCircularLinkedList {
	static Node head, head1, head2; 
	static class Node{
		int data;
		Node next;
		Node prev;
		public Node(int data) {
			this.data = data;
			next = prev = null;
		}
		
	}
	
	public static void main(String[] args) {
		DivideCircularLinkedList list = new DivideCircularLinkedList();
		//Created linked list will be 1->2->3->4
		 list.head = new Node(1);
		 list.head.next = new Node(2);
		 list.head.next.next = new Node(3);
		 list.head.next.next.next = new Node(4);
		 list.head.next.next.next.next = list.head;
		 
		 System.out.println("Original Circular Linked list "); 
		 // Split the list 
	        list.splitList(); 
	        System.out.println(""); 
	        System.out.println("First Circular List "); 
	        list.printList(head1); 
	        System.out.println(""); 
	        System.out.println("Second Circular List "); 
	        list.printList(head2); 
	}
	/* Function to split a list (starting with head) into two lists. 
    head1_ref and head2_ref are references to head nodes of  
    the two resultant linked lists */
	private void splitList() {
		Node slow_ptr = head;
		Node fast_ptr = head;
		
		if(head == null) {
			return;
		}
		/* If there are odd nodes in the circular list then 
        fast_ptr->next becomes head and for even nodes  
        fast_ptr->next->next becomes head */
		while(fast_ptr.next != head && fast_ptr.next.next != head) {
			fast_ptr = fast_ptr.next.next;
			slow_ptr = slow_ptr.next;
		}
		 /* If there are even elements in list then move fast_ptr */
		if(fast_ptr.next.next == head) {
			fast_ptr = fast_ptr.next;
		}
		 /* Set the head pointer of first half */
		head1 = head;
		
		  /* Set the head pointer of second half */
		if(head.next != head) {
			head2 = slow_ptr.next;
		}
		
		/* Make second half circular */
		fast_ptr.next = slow_ptr.next;
		
		 /* Make first half circular */
		slow_ptr.next = head; 
		
	}

	private void printList(Node node) {
		Node temp = node;
		if(node != null) {
			do {
				System.out.print(temp.data+" ");
				temp = temp.next;
			}while(temp != node);
		}
		
	}
}
