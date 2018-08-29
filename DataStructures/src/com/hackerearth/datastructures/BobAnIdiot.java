package com.hackerearth.datastructures;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Hashtable;

public class BobAnIdiot {

	public static void main(String[] args) throws IOException {
		int n;
		String swappedProgram;
		char[] correctedProgram;
		Hashtable<Character, Character> swappedLetters = new Hashtable<Character, Character>();
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		n = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < n; i++) {
			String[] tempChars = br.readLine().split(" ");
			swappedLetters.put(tempChars[0].charAt(0), tempChars[1].charAt(0));
			swappedLetters.put(tempChars[1].charAt(0), tempChars[0].charAt(0));
		}
		// System.out.println(swappedLetters);
		
		swappedProgram = br.readLine();
		correctedProgram = new char[swappedProgram.length()];
		
		for (int i = 0; i < swappedProgram.length(); i++) {
			char c = swappedProgram.charAt(i);
			correctedProgram[i] = swappedLetters.contains(c) ? swappedLetters.get(c) : c;
			
			// System.out.println(correctedProgram[i]);
			// System.out.println(c);
		}
		
		System.out.println(new String(correctedProgram));
	}
}