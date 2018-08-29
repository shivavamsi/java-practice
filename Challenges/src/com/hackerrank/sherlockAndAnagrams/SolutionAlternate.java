package com.hackerrank.sherlockAndAnagrams;
import java.io.*;
import java.util.*;

public class SolutionAlternate {

	static int sherlockAndAnagrams(String s) {

		int counter = 0;
		ArrayList<String> substringList = new ArrayList<String>(); // contains all substrings
		String sub1;
		String sub2;

		// find all substrings for the string s
		substringList = findSubstrings(s);

		for (int i = 0; i < substringList.size() - 1; i++) {
			sub1 = substringList.get(i);
			for (int j = i + 1; j < substringList.size(); j++) {
				sub2 = substringList.get(j);
				if (checkAnagrams(sub1, sub2)) {
					counter++;
				}
			}
		}

		return counter;
	}

	private static ArrayList<String> findSubstrings(String s) {
		ArrayList<String> substringList = new ArrayList<String>();
		for (int i = 0; i < s.length(); i++) {
			for (int j = i + 1; j <= s.length(); j++) {
				substringList.add(s.substring(i, j));
			}

		}
		substringList.remove(s);

		return substringList;
	}

	private static boolean checkAnagrams(String sub1, String sub2) {

		String sortedSub1;
		String sortedSub2;

		if (sub1.length() != sub2.length()) {
			return false;
		}

		sortedSub1 = sortString(sub1);
		sortedSub2 = sortString(sub2);

		return sortedSub1.equals(sortedSub2);
	}

	private static String sortString(String s) {

		String sortedS;
		char[] temp;

		temp = s.toCharArray();
		Arrays.sort(temp);
		sortedS = new String(temp);

		return sortedS;
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {

		int result[];
		int q = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		result = new int[q];

		for (int qItr = 0; qItr < q; qItr++) {
			String s = scanner.nextLine();
			result[qItr] = sherlockAndAnagrams(s);
		}

		scanner.close();

		for (int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		}
	}
}