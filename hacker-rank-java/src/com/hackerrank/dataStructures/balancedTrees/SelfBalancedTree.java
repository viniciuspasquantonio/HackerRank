package com.hackerrank.dataStructures.balancedTrees;

public class SelfBalancedTree {
	static Node insert(Node root, int val) {
		if(root == null){
			return createNode(val);
		}
		
		if (val < root.val) {
			root.left = insert(root.left, val);
		} else {
			root.right = insert(root.right, val);
		}
		root.ht = Math.max(getHeight(root.left), getHeight(root.right))+1;
		return settleViolation(root, val);
	}

	private static Node settleViolation(Node node, int val) {
		int balance = getBalance(node);
		if (balance > 1 && val < node.left.val) {
//			System.out.println("Tree is left left heavy...");
			return rightRotation(node);
		}

		if (balance < -1 && val > node.right.val) {
//			System.out.println("Tree is right right heavy...");
			return leftRotation(node);
		}
		
		if (balance > 1 && val > node.left.val) {
//			System.out.println("Tree is left right heavy...");
			node.left = leftRotation(node.left);
			return rightRotation(node);
		}

		if (balance < -1 && val < node.right.val) {
//			System.out.println("Tree is right left heavy...");
			node.right = rightRotation(node.right);
			return leftRotation(node);
		}
		return node;
	}

	private static Node leftRotation(Node node) {
		Node tempRightNode = node.right;
		Node t = tempRightNode.left;
		
		tempRightNode.left = node;
		node.right = t;
		
		node.ht = (Math.max(getHeight(node.left), getHeight(node.right))+1);
		tempRightNode.ht = (Math.max(getHeight(tempRightNode.left), getHeight(tempRightNode.right))+1);
		return tempRightNode;
	}

	private static Node rightRotation(Node node) {
		
		Node tempLeftNode = node.left;
		Node t = tempLeftNode.right;
		
		tempLeftNode.right = node;
		node.left = t;
		
		node.ht = (Math.max(getHeight(node.left), getHeight(node.right))+1);
		tempLeftNode.ht = (Math.max(getHeight(tempLeftNode.left), getHeight(tempLeftNode.right))+1);
		return tempLeftNode;
		
	}

	private static int getBalance(Node node) {
		if (node == null) {
			return 0;
		}
		return getHeight(node.left) - getHeight(node.right);
	}

	private static int getHeight(Node node) {
		if (node == null) {
			return -1;
		}
		return node.ht;
	}

	private static Node createNode(int val) {
		Node node = new Node();
		node.val = val;
		return node;
	}
}

class Node {
	int val; // Value
	int ht; // Height
	Node left; // Left child
	Node right; // Right child

}
