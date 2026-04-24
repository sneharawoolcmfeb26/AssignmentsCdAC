package com.assignment3;

public class LLdeletebyValue {
	private static class Node{
		int data;
		Node Next;
		
		Node(int data){
			this.data = data;
		}
	}

	private Node head;
	
	boolean deletebyValue(int value) {
		if(head == null) {
			return false;
		}
		
		if(head.data == value) {
			head = head.Next;
			return true;
		}
		Node current = head;
		
		while(current.Next != null && current.Next.data != value) {
			current = current.Next;
		}
		if(current.Next == null) {
			return false;
		}
		
		current.Next = current.Next.Next;
		return true;
	}
	
	void printlist() {
		Node current = head;
		while(current != null) {
			System.out.println(current.data + " ");
			current = current.Next;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LLdeletebyValue lla = new LLdeletebyValue();
		
		lla.head = new Node(10);
		lla.head.Next = new Node(20);
		lla.head.Next.Next = new Node(30);
		lla.head.Next.Next.Next = new Node(40);
		
		lla.deletebyValue(30);
		
		lla.printlist();

	}

}
