package com.assignment3;

public class LLReverse {

		private static class Node{
			int data;
			Node next;
			
			Node(int data){
				this.data = data;
			}
		}
		
		private Node head;
		
		void reverse() {
			Node prev = null;
			Node current = head;
			
			while(current != null) {
				Node nextNode = current.next;
				current.next = prev;
				prev = current;
				current = nextNode;
			}
			
			head = prev;
		}

		void printlist(){
			Node current = head;
			while(current != null) {
				System.out.print(current.data + " ");
				current = current.next;
			}
		}
		
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			LLReverse lla = new LLReverse();
			
			lla.head = new Node(10);
			lla.head.next = new Node(20);
			lla.head.next.next = new Node(30);
			lla.head.next.next.next = new Node(40);

			lla.reverse();
		    lla.printlist();

		}

	}
