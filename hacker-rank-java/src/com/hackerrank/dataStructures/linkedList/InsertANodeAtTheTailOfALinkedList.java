package com.hackerrank.dataStructures.linkedList;

public class InsertANodeAtTheTailOfALinkedList {
	public static void main(String[] args) {

	}

	Node insert(Node head, int data) {
		if(head.next == null){
			Node node = new Node();
			node.data = data;
			head.next = node;
		}else{
			insert(head.next,data);
		}
		return head;

	}
}
