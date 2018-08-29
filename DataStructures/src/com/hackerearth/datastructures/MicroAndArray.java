package com.hackerearth.datastructures;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MicroAndArray {
	public static void main(String[] args) throws IOException {
		int numTestCases;
		int[] results;

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		numTestCases = Integer.parseInt(br.readLine());

		results = new int[numTestCases];

		for (int i = 0; i < numTestCases; i++) {
			String[] tempArray1 = br.readLine().split(" ");
			String[] tempArray2 = br.readLine().split(" ");

			int N = Integer.parseInt(tempArray1[0]);
			int K = Integer.parseInt(tempArray1[1]);

			int[] tempIntArray = new int[N];

			for (int j = 0; j < N; j++) {
				tempIntArray[j] = Integer.parseInt(tempArray2[j]);
			}

			results[i] = findMinTime(tempIntArray, K);
		}

		for (int result : results) {
			System.out.println(result);
		}
	}

	private static int findMinTime(int[] myArray, int limitK) {
		// TODO Auto-generated method stub
		int timeRequired;
		int min = myArray[0];
		// find min element
		for (int el : myArray) {
			if (el < min) min = el;
		}
		
		timeRequired = (min < limitK) ? (limitK - min) : 0;
		
		return timeRequired;
	}
}