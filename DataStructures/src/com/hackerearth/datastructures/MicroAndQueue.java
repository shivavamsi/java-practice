package com.hackerearth.datastructures;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class MicroAndQueue {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Queue<Integer> myQueue = new LinkedList<>();
		int n = Integer.parseInt(br.readLine());

		for (int i = 0; i < n; i++) {
			String[] temp = br.readLine().split(" ");
			if (temp[0].equals("E")) {
				myQueue.add(Integer.parseInt(temp[1]));
				// System.out.println(myQueue);
			} else if (temp[0].equals("D")) {
				if (myQueue.isEmpty()) {
					System.out.print(-1 + " ");
				} else {
					int tempDeq = myQueue.remove();
					System.out.print(tempDeq + " ");
				}
			}
			 System.out.println(myQueue.size());
		}
	}
}