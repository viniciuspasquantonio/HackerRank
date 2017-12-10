package com.hackerrank.dataStructures.linkedList;

import java.util.HashSet;
import java.util.Set;

public class DetectWheterLinkedListContainsACycle {
	public static void main(String[] args) {
		Node head = new Node(1);
		Node node2 = new Node(2);
		Node node3 = new Node(3);
		head.next = node2;
		node2.next = node3;
		node3.next = node2;
		System.out.println(hasCycle(head));
	}

	static boolean hasCycle(Node head) {
		if (head == null)
			return false;

		Node hare = head;
		Set<Node> nodesVisited = new HashSet<Node>();

		while (hare != null) {
			if (nodesVisited.contains(hare))
				return true;
			nodesVisited.add(hare);
			hare = hare.next;
		}

		return false;
	}
}
