package com.assignment3;


public class LLatEnd {
	
	private static class Node{
		int data;
		Node next; 
	
	
		Node(int data){
			this.data = data;  
		}
	
	}
	
	private Node head;   
	
	void insertatEnd(int value) {
		Node newNode = new Node(value);
		
		if(head == null) {
			head = newNode;
			return;
		}
		
		Node current = head;
		while(current.next!= null) {
			current = current.next;
		}
		current.next = newNode;

	}

	void printList() {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LLatEnd lla = new LLatEnd();
		
		lla.head = new Node(5);
		lla.head.next = new Node(10);
		lla.head.next.next = new Node(15);
		
		
		lla.insertatEnd(20);
		lla.insertatEnd(25);
		
		
		lla.printList();    
	}

}
