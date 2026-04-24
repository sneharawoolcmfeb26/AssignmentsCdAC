package com.assignment3;

class LLCount {
	private static class Node{
		int data;
		Node next;
		
		Node(int data){
			this.data = data;
		}
	}
	
	private Node head;
	
	int size() {
		int count = 0;
		Node current = head;
		
		while(current != null) {
			count++;
			current = current.next;
		}
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LLCount lla = new LLCount();
		
		lla.head = new Node(10);
		lla.head.next = new Node(20);
		lla.head.next.next = new Node(30);
		
        System.out.println("Size : " + lla.size());

	}

}
