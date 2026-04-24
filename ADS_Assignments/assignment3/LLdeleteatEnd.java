package com.assignment3;

public class LLdeleteatEnd {
	private static class Node{
		int data;
		Node next;
		
		Node(int data){
			this.data = data;
		}
	}
	
	private Node head;
	
	int deleteatEnd() {
		if(head == null) {
			System.out.println("LL is Empty");
			return -1;
		}
		
		if(head.next == null) {
			int removed = head.data;
			head = null;
			return removed;
		}
		
		Node current = head;
		while(current.next.next != null) {
			current = current.next;
		}
		int removed = current.next.data;
		current.next = null;
		return removed;
	}
	
	void printlist() {
		Node current = head;
		while(current != null) {
			System.out.println(current.data + " ");
			current = current.next;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LLdeleteatEnd lla = new LLdeleteatEnd();
		
		lla.head = new Node(10);
		lla.head.next = new Node(20);
		lla.head.next.next = new Node(30);
		lla.head.next.next.next = new Node(40);
		
		lla.deleteatEnd();
		
		lla.printlist();
		
	}

}
