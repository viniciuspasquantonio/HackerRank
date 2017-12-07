package com.hackerrank.dataStructures.arrays;

import java.util.Scanner;

public class LeftRotation {
	static int[] leftRotation(int[] a, int d) {
		int length = a.length;
		int[] result = new int[length];
		int diff = (length-d);
		for (int i = 0; i <= length-1; i++) {
			if(diff+i >= length){
				result[diff+i - length] = a[i];
			}else{
				result[diff+i] = a[i];
			}
		}
		return result;
		
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int d = in.nextInt();
		int[] a = new int[n];
		for (int a_i = 0; a_i < n; a_i++) {
			a[a_i] = in.nextInt();
		}
		int[] result = leftRotation(a, d);
		for (int i = 0; i < result.length; i++) {
			System.out.print(result[i] + (i != result.length - 1 ? " " : ""));
		}
		System.out.println("");

		in.close();
	}
}
