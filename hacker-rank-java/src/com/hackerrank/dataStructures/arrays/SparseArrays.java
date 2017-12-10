package com.hackerrank.dataStructures.arrays;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SparseArrays {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Map<String,Integer> stringsMap = new HashMap<>();
		int n = in.nextInt();
		for (int i = 0; i <= n; i++) {
			String word =in.nextLine();
			int count = 0;
			if(stringsMap.containsKey(word)){
				count = stringsMap.get(word);
			}
			count++;
			stringsMap.put(word, count);
		}
		int q = in.nextInt();
		for (int i = 0; i < q; i++) {
			String query = in.next();
			if(stringsMap.containsKey(query)){
				System.out.println(stringsMap.get(query));
			}else{
				System.out.println(0);
			}
			
		}
		in.close();
		
		
    }
}
