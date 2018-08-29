package temp;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.io.IOException;

public class Sam1 {

	public static int findDistinctCharacters(String str) {
		HashSet<Character> distinctCharacters = new HashSet<>();

		for (char c : str.toCharArray()) {
			distinctCharacters.add(c);
		}

		return distinctCharacters.size();
	}

	public static void main (String[] args) throws IOException{
		String inputString;
		String subString;
		int result;
		int maxDistinctCharacters;
		int currentDistinctCharacters;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		inputString = br.readLine();
		result = inputString.length();
		maxDistinctCharacters = findDistinctCharacters(inputString);
		
		for (int i = 0; i < inputString.length(); i++) {
			for (int j = 1; j <= inputString.length() - i; j++) {
				subString = inputString.substring(i, i + j);
				// System.out.println(subString);
				currentDistinctCharacters = findDistinctCharacters(subString);
				if(currentDistinctCharacters == maxDistinctCharacters && subString.length() < result) {
					// System.out.println(subString);
					// System.out.println("distinct characters: " + currentDistinctCharacters);
					result = subString.length();
				}
			}
		}
		System.out.println(result);
	}
}