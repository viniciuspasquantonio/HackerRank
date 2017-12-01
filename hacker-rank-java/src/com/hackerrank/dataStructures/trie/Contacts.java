package com.hackerrank.dataStructures.trie;

import java.util.Scanner;
import java.util.Stack;

public class Contacts {
	public static void main(String[] args) {
		final Scanner in = new Scanner(System.in);
		int qtd = in.nextInt();
		String[] inputs = new String[qtd];
		Stack<String> command = new Stack<>();
		Stack<String> words = new Stack<>();
		for (int i = 0; i < qtd; i++) {
			command.push(in.next());
			words.push(in.next());
		}
	}
	
	static class Node {
		private int letter;
		private boolean finalLetter;
		private int[] nextLetters;
		public Node(int letter) {
			this.letter = letter;
		}
		public int getLetter() {
			return letter;
		}
		public boolean isFinalLetter() {
			return finalLetter;
		}
		public int[] getNextLetters() {
			return nextLetters;
		}
		public void setLetter(int letter) {
			this.letter = letter;
		}
		public void setFinalLetter(boolean finalLetter) {
			this.finalLetter = finalLetter;
		}
		public void setNextLetters(int[] nextLetters) {
			this.nextLetters = nextLetters;
		}
	}

	static class Triee{
		private Node root;
		
	}
	
	
}
