package com.assignment3;

public class LLSearch {
	private static class Node{
		int data;
		Node next;
		
		Node(int data){
			this.data = data;
		}
	}
	
	private Node head;
	
	boolean search(int value) {
		Node current = head;
		int index = 0;
		
		while(current != null) {
			if(current.data == value) {
				System.out.println("Element " + value + " found at index " + index);
				return true;
			}
			current = current.next;
			index++;
		}
		
		System.out.println("Element not found");
		return false;
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
        LLSearch lla = new LLSearch();
        
        lla.head = new Node(10);
		lla.head.next = new Node(20);
		lla.head.next.next = new Node(30);
		lla.head.next.next.next = new Node(40);
		
		lla.search(30);
		
		
		lla.printlist();


	}

}
