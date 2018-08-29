package com.hackerearth.datastructures;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RoyAndSymmetricLogos {

	public static void main(String[] args) throws IOException {
		int t;
		boolean[] results;

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		t = Integer.parseInt(br.readLine());
		results = new boolean[t];
		for (int testIndex = 0; testIndex < t; testIndex++) {
			int tempN = Integer.parseInt(br.readLine());
			boolean[][] tempMatrix = new boolean[tempN][tempN];

			for (int r = 0; r < tempN; r++) {
				String[] tempRow = br.readLine().split("");

				for (int c = 0; c < tempRow.length; c++) {
					int tempEl = Integer.parseInt(tempRow[c]);
					// System.out.println(tempEl);
					tempMatrix[r][c] = tempEl != 0;
				}
				// System.out.println(Arrays.toString(tempRow));
			}
			results[testIndex] = isSymmetric(tempMatrix);
		}

		for (boolean result : results) {
			if (result) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		}
	}

	private static boolean isSymmetric(boolean[][] tempMatrix) {
		boolean symmetricFlag = true;
		int matSize = tempMatrix.length;
		int toCheck = matSize%2 == 0 ? matSize/2 : (matSize/2 + 1);
		for (int i = 0; i < toCheck; i++) {
			for (int j = 0; j < toCheck; j++) {
				boolean a = tempMatrix[i][j];
				boolean b = tempMatrix[i][matSize - 1 - j];
				boolean c = tempMatrix[matSize - 1 - i][j];
				boolean d = tempMatrix[matSize - 1 - i][matSize - 1 - j];
				// System.out.println((a == b ? "true" : "false")  + (c == d ? "true" : "false") +  (a == c ? "true" : "false") + (b == d ? "true" : "false"));
				if (!(a == b && c == d && a == c & b ==d)) {
					symmetricFlag = false;
					return symmetricFlag;
				}
			}
		}

		return symmetricFlag;
	}
}