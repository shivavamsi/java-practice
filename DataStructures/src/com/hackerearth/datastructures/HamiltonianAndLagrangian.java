package com.hackerearth.datastructures;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class HamiltonianAndLagrangian {
	
	public static void main(String[] args) throws IOException{
		int numStudents;
		int[] scores;
		int max;
		List<Integer> results = new ArrayList<Integer>();
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		numStudents = Integer.parseInt(br.readLine());
		scores = new int[numStudents];
		String[] temp = br.readLine().split(" ");
		for (int i = 0; i < numStudents; i++) {
			scores[i] = Integer.parseInt(temp[i]);
		}
		
		max = scores[numStudents - 1];
		
		for (int n = numStudents - 1; n >= 0; n-- ) {
			if (scores[n] >= max) {
				max = scores[n];
				results.add(max);
			}
		}
		
		for (int i = results.size() - 1; i >= 0; i--) {
			System.out.print(results.get(i) + " ");
		}
	}
}