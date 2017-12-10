package com.hackerrank.dataStructures.linkedList;

public class Node {
	int data;
    Node next;
	public Node(int data) {
		this.data = data;
	}
	public Node() {
	}
	public int getData() {
		return data;
	}
	public Node getNext() {
		return next;
	}
	public void setData(int data) {
		this.data = data;
	}
	public void setNext(Node next) {
		this.next = next;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Node [data=");
		builder.append(data);
		builder.append("]");
		return builder.toString();
	}
}
