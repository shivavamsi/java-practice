package com.hackerearth.datastructures;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class MultiDimensionalArrayTest {
	
	public static void main(String[] args) throws Exception{
		int N;
		int M;
		int[][] matrix;
		int[][] transpose;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));		
		
		String[] temp = br.readLine().split(" " );
		
		N = Integer.parseInt(temp[0]);
		M = Integer.parseInt(temp[1]);
		matrix = new int[N][M];
		transpose = new int[M][N];
		
		for (int i = 0; i < N; i++) {
			String[] tempRow = br.readLine().split(" ");
			for (int j = 0; j < M; j++) {
				matrix[i][j] = Integer.parseInt(tempRow[j]);
			}
		}
		
		for (int i = 0; i < M; i++) {
			for(int j = 0; j < N; j++) {
				transpose[i][j] = matrix[j][i];
			}
		}
		
		for (int i = 0; i < M; i++) {
			for (int j = 0; j < N; j++) {
				System.out.print(transpose[i][j] + " ");
			}
			System.out.println();
		}
	}
}