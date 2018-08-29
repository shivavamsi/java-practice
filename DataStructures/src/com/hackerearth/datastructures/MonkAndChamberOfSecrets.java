package com.hackerearth.datastructures;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

public class MonkAndChamberOfSecrets {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] tempNX = br.readLine().split(" ");
		String[] tempPowers;
		int[] results;
		Queue<Integer> spiderPowers = new LinkedList<>();
		Queue<Integer> spiderIndexes = new LinkedList<>();
		int n = Integer.parseInt(tempNX[0]);
		int x = Integer.parseInt(tempNX[1]);

		results = new int[x];
		tempPowers = br.readLine().split(" ");

		for (int i = 0; i < n; i++) {
			spiderPowers.add(Integer.parseInt(tempPowers[i]));
			spiderIndexes.add(i);
		}
		
		// System.out.println(spiderPowers);
		for (int i = 0; i < x; i++) {
			int[] currentXSpiders = new int[x];
			int[] currentXIndexes = new int[x];
			int powerfulSpider;
			boolean foundPowerfulSpider = false;
			
			// remove first x spiders from queue
			for (int j = 0; j < x; j++) {
				if(!spiderPowers.isEmpty()) {
					currentXSpiders[j] = spiderPowers.remove();
					currentXIndexes[j] = spiderIndexes.remove();
				}
			}
			
			// find the spider with max power
			powerfulSpider = currentXSpiders[0];
			for (int j = 0; j < x; j++) {
				if(currentXSpiders[j] > powerfulSpider) powerfulSpider = currentXSpiders[j];
			}
			
			// add the x spiders which were removed after decreasing power by 1
			for (int j = 0; j < x; j++) {
				
				if(!foundPowerfulSpider && currentXSpiders[j] == powerfulSpider) {
					foundPowerfulSpider = true;
					results[i] = currentXIndexes[j] + 1;
				} else {
					if(currentXSpiders[j] > 0) currentXSpiders[j]--; 
					spiderPowers.add(currentXSpiders[j]);
					spiderIndexes.add(currentXIndexes[j]);
				}
			}
			
			// System.out.println(spiderPowers);
		}
		
		for(int result : results) {
			System.out.print(result + " ");
		}
	}
}