package com.assignment3;


public class LLinsertatPos {
	private static class Node{
		int data;
		Node next;
		
		Node(int data){
			this.data = data;
		}
	}
	
	private Node head;
	
	void insertAtPosition(int value, int position){
		Node newNode = new Node(value);
		
		if(position == 0) {
			newNode.next = head;
			head = newNode;
			return;
		}
		
		Node current = head;
		
	    for(int i = 0; i < position - 1; i++){
	        current = current.next;
		}
		
		newNode.next = current.next;
		current.next = newNode;
		return;
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

		LLinsertatPos lla = new LLinsertatPos();

		lla.head = new Node(10);
		lla.head.next = new Node(20);
		lla.head.next.next = new Node(30);
		lla.head.next.next.next = new Node(40);
		
		lla.insertAtPosition(25, 2);
		
		lla.printList();
	}

}
