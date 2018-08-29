package com.hackerrank.twoRobots;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class SolutionTest {
    
    int actualResult;
    int expectedResult;

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
    }

    @AfterClass
    public static void tearDownAfterClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testTwoRobots1() {
        int m = 5;
        int[][] queries = {
                {1, 5},
                {3, 2},
                {4, 1},
                {2, 4}
        };
        expectedResult = 11;
        
        actualResult = Solution.twoRobots(m, queries);
        assertEquals(actualResult, expectedResult);
    }
    
    @Test
    public void testTwoRobots2() {
        int m = 4;
        int[][] queries = {
                {1, 2},
                {4, 3}
        };
        expectedResult = 2;
        
        actualResult = Solution.twoRobots(m, queries);
        assertEquals(actualResult, expectedResult);
    }
    
    @Test
    public void testTwoRobots3() {
        int m = 10;
        int[][] queries = {
                {2, 4},
                {5, 4},
                {9, 8}
        };
        expectedResult = 5;
        
        actualResult = Solution.twoRobots(m, queries);
        assertEquals(actualResult, expectedResult);
    }

}
