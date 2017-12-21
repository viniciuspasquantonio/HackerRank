package com.hackerrank.dataStructures.trie;

import java.util.Scanner;
import java.util.Stack;

public class Contacts {
	public static void main(String[] args) {
		final Scanner in = new Scanner(System.in);
		int qtd = in.nextInt();
		Trie trie = new Trie();
		for (int i = 0; i < qtd; i++) {
			String command = in.next();
			String word = in.next();
			if("add".equals(command)){
				trie.insert(word);
			}else if ("find".equals(command)){
				System.out.println(trie.countOcurrences(word));
			}
		}
	}
	
	static class Node {
		public Node() {
			this.childreen = new Node[26];
		}
		private int data;
		private String letra;
		private boolean leaf;
		private Node[] childreen;
		private int quantity;
		
		public Node getChild(int index) {
			return childreen[index];
		}
		public void setChild(int index, int data) {
			Node node = new Node();
			node.data = data;
			childreen[index] = node;
			
		}
	}

	static class Trie{
		private Node root;

		public Trie() {
			this.root = new Node();
		}
		public int countOcurrences(String word) {
			Node tempNode = root;
			int ascIndex;
			int ocurrences =0;
			for (int i = 0; i < word.length(); i++) {
				ascIndex = word.charAt(i)-'a';
				if(tempNode.getChild(ascIndex) == null){
					return ocurrences;
				}
				tempNode = tempNode.getChild(ascIndex);
					
			}
			ocurrences = tempNode.quantity;
			return ocurrences;
		}
		public void insert(String word) {
			Node tempNode = root;
			int ascIndex;
			for (int i = 0; i < word.length(); i++) {
				int data = word.charAt(i);
				ascIndex = word.charAt(i)-'a';
				if(tempNode.getChild(ascIndex) == null){
					tempNode.setChild(ascIndex,data);
				}
				
				tempNode = tempNode.getChild(ascIndex);
				tempNode.quantity++;
					
			}
			
			tempNode.leaf = true;
			
		}
		
	}
	
	
}
