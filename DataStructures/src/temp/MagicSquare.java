package temp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class MagicSquare {

	public static void main(String[] args) throws IOException {
		
		int[][] matrix = new int[3][3];
		HashSet<Integer> matrixElements = new HashSet<Integer>();
		HashSet<Integer> duplicates = new HashSet<Integer>();
		HashSet<Integer> missingElements = new HashSet<Integer>();
		// ArrayList<Integer> totals = new ArrayList<Integer>();
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// read matrix
		for(int i = 0; i < 3; i++) {
			String[] tempRow = br.readLine().split(" ");
			for(int j = 0; j < 3; j++) {
				matrix[i][j] = Integer.parseInt(tempRow[j]);
				
				// find duplicate elements in matrix
				if(!matrixElements.add(matrix[i][j])) duplicates.add(matrix[i][j]);
			}
		}
		
		// find missing elements from matrix
		for(int i = 1; i <= 9; i++) {
			if(!matrixElements.contains(i)) missingElements.add(i);
		}
		
		/*// find all row totals
		for (int i = 0; i < 3; i++) {
			int tempSum = 0;
			for (int j = 0; j < 3; j++) {
				tempSum += matrix[i][j];
			}
			totals.add(tempSum);
		}
		
		// find all column totals
		for (int j = 0; j < 3; j++) {
			int tempSum = 0;
			for (int i = 0; i < 3; i++) {
				tempSum += matrix[i][j];
			}
			totals.add(tempSum);
		}
		
		// diagonal totals
		totals.add(matrix[0][0] + matrix[1][1] + matrix[2][2]);
		
		totals.add(matrix[0][2] + matrix[1][1] + matrix[2][0]);*/
		
		
		
		System.out.println(matrixElements);
		
		System.out.println(duplicates);
		
		System.out.println(missingElements);
		
		Iterator itr = duplicates.iterator();
		
		while(itr.hasNext()) {
			int duplicateElement = (int) itr.next();
		}
		
		for(int i = 0; i < 3; i++) {
			System.out.println(Arrays.toString(matrix[i]));			
		}
		
	}
}