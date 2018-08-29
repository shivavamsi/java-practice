package com.hackerearth.datastructures;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Hashtable;

public class NameLookup {
	
	public static void main(String[] args) throws IOException{
		int n;
		int q;
		int[] queries;
		Hashtable<Integer, String> colleagues = new Hashtable<Integer, String>();
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		n = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < n; i++) {
			String[] tempColleagues = br.readLine().split(" ");
			colleagues.put(Integer.parseInt(tempColleagues[0]), tempColleagues[1]);
		}
		
		q = Integer.parseInt(br.readLine());
		queries = new int[q];
		for (int i = 0; i < q; i++) {
			queries[i] = Integer.parseInt(br.readLine());
			System.out.println(colleagues.get(queries[i]));
		}
	}
}