package com.hackerearth.datastructures;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.Stack;

public class SignalRange {

	public static void main(String[] args) throws IOException {
		int t;
		int[][] results;

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		t = Integer.parseInt(br.readLine());
		results = new int[t][];

		for (int i = 0; i < t; i++) {
			int n = Integer.parseInt(br.readLine());
			int[] towerHeights = new int[n];
			// Stack<Integer> towerHeights = new Stack<Integer>();
			String[] tempTowers = br.readLine().split(" ");

			for (int j = 0; j < n; j++) {
				// towerHeights.push(Integer.parseInt(tempTowers[j]));
				towerHeights[j] = Integer.parseInt(tempTowers[j]); 
			}

			results[i] = findRange(towerHeights);
		}
		for (int[] result : results) {
			for (int towerRange : result) {
				System.out.print(towerRange + " ");
			}
			System.out.println();
		}
	}

	private static int[] findRange(int[] towerHeights) {
		
		int[] res = new int[towerHeights.length];
		
		for (int i = towerHeights.length - 1; i >= 0; i--) {
			res[i] = i + 1;
			for (int j = i - 1; j >= 0; j--) {
				if (towerHeights[j] > towerHeights[i]) {
					res[i] = i - j;
					break;
				}
			}
		}
		res[0] = 1;
		return res;
	}
}