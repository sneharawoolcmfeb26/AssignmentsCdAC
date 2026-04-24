package com.assignment3;


public class LLdeleteatfirst {
	private static class Node{
		int data;
		Node next;
		
		Node(int data){
			this.data = data;
		}
	}
	
	private Node head;
	
	int deleteatFirst() {
		if(head == null) {
			System.out.println(" LL Is empty");
			return -1;
		}
		int removed = head.data;
		head = head.next;
		return removed;
		
	}
	
	void printlist() {
		Node current = head;
		while(current != null) {
			System.out.print(current.data + " ");
			current = current.next;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LLdeleteatfirst lla = new LLdeleteatfirst();
		
		lla.head = new Node(10);
		lla.head.next = new Node(20);
		lla.head.next.next = new Node(30);
		lla.head.next.next.next = new Node(40);
		
		lla.deleteatFirst();
		
		lla.printlist();
		
	}

}
