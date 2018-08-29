package com.hackerrank.twoRobots;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Solution {

    static int twoRobots(int m, int[][] queries) {
        int N = queries.length;
        int robot1Index = 0;
        int robot2Index = 0;
        int mA;
        int mB;
        int totalDistance = 0;
        int distanceLeft = findDistance(queries);
        for (int queryIndex = 0; queryIndex < N; queryIndex++) {
            mA = queries[queryIndex][0];
            mB = queries[queryIndex][1];
            int currentDistance = Math.abs(mA - mB);
            distanceLeft -= currentDistance;
            
            
            /*if() {
                
            }*/
            /*System.out.println("mA: " + mA);
            System.out.println("mB: " + mB);
            System.out.println(totalDistance);*/
        }
        return totalDistance;
    }

    static void findMinDistance(int robot1Index, int robot2Index, int[][] queries) {
        int mA = queries[0][0];
        int mB = queries[0][1];
        int currentDistance = mA - mB;
        int distanceMoved = 0;

        int temp1 = Math.abs(mA - robot1Index);
        int temp2 = Math.abs(mA - robot2Index);

        int length = queries.length;
        int[][] subQueries = new int[length - 1][2];

        if (length == 1) {
            if(temp1 < temp2 || temp1 == temp2) {
                robot1Index = mB;
                distanceMoved = temp1;
            }else {
                robot2Index = mB;
                distanceMoved = temp2;
            }

        } else {

            // create sub array
            for (int i = 0; i < length - 1; i++) {
                subQueries[i] = queries[i + 1];
            }

            findMinDistance(robot1Index, robot2Index, subQueries);

        }
    }

    static int findDistance(int[][] arr) {
        int distance = 0;
        int length = arr.length;

        for (int i = 0; i < length; i++) {
            distance += Math.abs(arr[i][0] - arr[i][1]);
        }

        return distance;
    }

    public static void main(String[] args) throws IOException {

        int T;
        int M;
        int N;
        int[] results;

        // Enter data using BufferReader
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        T = Integer.parseInt(reader.readLine());
        results = new int[T];

        for (int testIndex = 0; testIndex < T; testIndex++) {
            String[] temp = reader.readLine().split(" ");
            M = Integer.parseInt(temp[0]);
            N = Integer.parseInt(temp[1]);

            int[][] queries = new int[N][2];
            for (int queryIndex = 0; queryIndex < N; queryIndex++) {
                String[] tempQuery = reader.readLine().split(" ");
                queries[queryIndex][0] = Integer.parseInt(tempQuery[0]);
                queries[queryIndex][1] = Integer.parseInt(tempQuery[1]);
            }
            results[testIndex] = twoRobots(M, queries);
        }
        for (int testIndex = 0; testIndex < T; testIndex++) {
            System.out.println(results[testIndex]);
        }
        reader.close();
    }
}
