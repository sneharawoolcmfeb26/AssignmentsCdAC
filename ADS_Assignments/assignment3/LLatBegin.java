package com.assignment3;

public class LLatBegin {
	
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

	void insertAtBeginning(int value) {
		Node newNode = new Node(value);
		newNode.next = head;
		head = newNode;
	}
	
	void printList() {
		Node current = head;
		while (current != null) {
			System.out.print(current.data + " ");
			current = current.next;
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LLatBegin lla = new LLatBegin();
		
		lla.head = new Node(10);
		lla.head.next = new Node(20);
		lla.head.next.next = new Node(30);
		
		lla.insertAtBeginning(5);
		
		lla.insertatEnd(58);
		
		lla.printList();    
	}

}
