package com.hackerrank.dataStructures.linkedList;

public class PrintTheElementsOfALinkedList {
	public static void main(String[] args) {

	}

	void print(Node head) {
		if(head== null){
			return;
		}
		System.out.println(head.data);
		if (head.next != null) {
			print(head.next);
		}
	}
}
