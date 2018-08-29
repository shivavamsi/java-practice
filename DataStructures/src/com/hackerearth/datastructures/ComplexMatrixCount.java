package com.hackerearth.datastructures;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class ComplexMatrixCount {

	public static int findSubMatrices(int[][] matrix) {
		int size = matrix.length;
		int result = 0;
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				for (int subMatSize = 1; (subMatSize + i <= size) && (subMatSize + j <= size) && subMatSize < size; subMatSize++) {
					int[][] subMatrix = new int[subMatSize][subMatSize];
					for (int rowSub = 0; rowSub < subMatSize; rowSub++) {
						subMatrix[rowSub] = Arrays.copyOfRange(matrix[i + rowSub], j, j + subMatSize);
					}
					if(isPrimeMatrix(subMatrix)) result++;
				}
			}
		}
		return result;
	}

	private static boolean isPrimeMatrix(int[][] subMatrix) {
		boolean primeFlag = true;
			for (int[] row : subMatrix) {
				for (int el : row) {
					if(!isPrime(el)) {
						primeFlag = false;
						break;
					};
				}
			}
		return primeFlag;
	}

	private static boolean isPrime(int el) {
		
		boolean prime = (el <= 1) ? false : true;
		
		for (int i = 2; i < Math.sqrt(el); i++) {
			if (el % i == 0) {
				prime = false;
				break;
			}
		}
		return prime;
	}

	public static void main(String[] args) throws IOException{
		int n;
		int m;
		int k;
		int x;
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] tempNMKX = br.readLine().split(" ");
		n = Integer.parseInt(tempNMKX[0]);
		m = Integer.parseInt(tempNMKX[1]);
		k = Integer.parseInt(tempNMKX[2]);
		x = Integer.parseInt(tempNMKX[3]);
		
		// int[][] sampleMatrix = { { 3, 5, 6 }, { 8, 3, 2 }, { 3, 5, 2 } };
		// System.out.println("result: " + sumPrimeMatrices(sampleMatrix));
	}
}