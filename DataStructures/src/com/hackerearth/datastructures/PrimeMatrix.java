package com.hackerearth.datastructures;

import java.util.Arrays;

public class PrimeMatrix {

	public static int sumPrimeMatrices(int[][] matrix) {
		int size = matrix.length;
		// int numSubMat = 0;
		int result = 0;
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				for (int subMatSize = 1; (subMatSize + i <= size) && (subMatSize + j <= size) && subMatSize < size; subMatSize++) {
					int[][] subMatrix = new int[subMatSize][subMatSize];
					for (int rowSub = 0; rowSub < subMatSize; rowSub++) {
						subMatrix[rowSub] = Arrays.copyOfRange(matrix[i + rowSub], j, j + subMatSize);
					}
					
					for(int r = 0; r < subMatrix.length; r++) {
						for (int c = 0; c < subMatrix.length; c++) {
							// System.out.print(subMatrix[r][c] + "\t");
						}
						// System.out.println();
					}
					
					if(isPrimeMatrix(subMatrix)) result++;
					// numSubMat++;
					// System.out.println("----------------------");
				}
			}
		}
		// System.out.println("nubmer of sub matrices: " + numSubMat);
		return result;
	}

	private static boolean isPrimeMatrix(int[][] subMatrix) {
		boolean primeFlag = true;
			for (int[] row : subMatrix) {
				for (int el : row) {
					if(!isPrime(el)) {
						primeFlag = false;
						break;
					}
				}
			}
		// System.out.println(primeFlag);
		return primeFlag;
	}

	private static boolean isPrime(int el) {
		
		boolean prime = (el <= 1) ? false : true;
		
		for (int i = 2; i <= Math.sqrt(el); i++) {
			if (el % i == 0) {
				prime = false;
				break;
			}
		}
		// System.out.println(prime);
		return prime;
	}

	public static void main(String[] args) {
		int[][] sampleMatrix = { { 3, 5, 6 }, { 8, 3, 2 }, { 3, 5, 2 } };
		System.out.println("result: " + sumPrimeMatrices(sampleMatrix));
		
		int[][] sampleMatrix1 = { { 2, 3, 8 }, { 4, 5, 7 }, { 2, 7, 5 } };
		System.out.println("result: " + sumPrimeMatrices(sampleMatrix1));
		
		int[][] sampleMatrix2 = { {1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
		System.out.println("result: " + sumPrimeMatrices(sampleMatrix2));
		
		/*System.out.println(Math.sqrt(4));
		System.out.println(isPrime(4));*/
	}
}