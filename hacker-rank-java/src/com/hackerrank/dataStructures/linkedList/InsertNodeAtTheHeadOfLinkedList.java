package com.hackerrank.dataStructures.linkedList;

public class InsertNodeAtTheHeadOfLinkedList {

	Node insert(Node head,int x) {
	    Node node = new Node();
	    node.data = x;
	    node.next = head;
	    return node;
	}
}
