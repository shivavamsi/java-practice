package com.hackerearth.datastructures;

import java.io.BufferedReader;
import java.io.InputStreamReader;

class FizzBuzz {
	public static void main(String args[]) throws Exception {
		int t;
		int n;
		String[] tempN;

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		t = Integer.parseInt(br.readLine());
		tempN = br.readLine().split(" ");

		for (int i = 0; i < t; i++) {
			n = Integer.parseInt(tempN[i]);
			printFizzBuzz(n);
		}

	}

	private static void printFizzBuzz(int n) {
		String printWord;
		for (int j = 1; j <= n; j++) {
			printWord = new String("");

			if (j % 3 == 0) {
				printWord += "Fizz";
			}
			if (j % 5 == 0) {
				printWord += "Buzz";
			}
			if (printWord.equals("")) {
				printWord += j;
			}
			System.out.println(printWord);
		}

	}
}
