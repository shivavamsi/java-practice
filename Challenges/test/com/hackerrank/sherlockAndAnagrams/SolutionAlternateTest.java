package com.hackerrank.sherlockAndAnagrams;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class SolutionAlternateTest {
	
	static int actualOutput;
	static int expectedOutput;
	static String input;
	static String error;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		error = "expected: ";
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testSherlockAndAnagrams1() {
		input = "abba";
		expectedOutput = 4;
		actualOutput = SolutionAlternate.sherlockAndAnagrams(input);
		
		error = error + expectedOutput + ". But, received: " + actualOutput;
		assertThat(error, actualOutput, equalTo(expectedOutput));
	}
	
	@Test
	public void testSherlockAndAnagrams2() {
		input = "abcd";
		expectedOutput = 0;
		actualOutput = SolutionAlternate.sherlockAndAnagrams(input);
		assertThat(actualOutput, equalTo(expectedOutput));
	}

	@Test
	public void testSherlockAndAnagrams3() {
		input = "ifailuhkqq";
		expectedOutput = 3;
		actualOutput = SolutionAlternate.sherlockAndAnagrams(input);
		assertThat(actualOutput, equalTo(expectedOutput));
	}

	@Test
	public void testSherlockAndAnagrams4() {
		input = "kkkk";
		expectedOutput = 10;
		actualOutput = SolutionAlternate.sherlockAndAnagrams(input);
		assertThat(actualOutput, equalTo(expectedOutput));
	}

	@Test
	public void testSherlockAndAnagrams5() {
		input = "ifailuhkqqhucpoltgtyovarjsnrbfpvmupwjjjfiwwhrlkpekxxnebfrwibylcvkfealgonjkzwlyfhhkefuvgndgdnbelgruel";
		expectedOutput = 399;
		actualOutput = SolutionAlternate.sherlockAndAnagrams(input);
		assertThat(actualOutput, equalTo(expectedOutput));
	}

	@Test
	public void testSherlockAndAnagrams6() {
		input = "gffryqktmwocejbxfidpjfgrrkpowoxwggxaknmltjcpazgtnakcfcogzatyskqjyorcftwxjrtgayvllutrjxpbzggjxbmxpnde";
		expectedOutput = 471;
		actualOutput = SolutionAlternate.sherlockAndAnagrams(input);
		assertThat(actualOutput, equalTo(expectedOutput));
	}

	@Test
	public void testSherlockAndAnagrams7() {
		input = "mqmtjwxaaaxklheghvqcyhaaegtlyntxmoluqlzvuzgkwhkkfpwarkckansgabfclzgnumdrojexnrdunivxqjzfbzsodycnsnmw";
		expectedOutput = 370;
		actualOutput = SolutionAlternate.sherlockAndAnagrams(input);
		assertThat(actualOutput, equalTo(expectedOutput));
	}

	@Test
	public void testSherlockAndAnagrams8() {
		input = "ofeqjnqnxwidhbuxxhfwargwkikjqwyghpsygjxyrarcoacwnhxyqlrviikfuiuotifznqmzpjrxycnqktkryutpqvbgbgthfges";
		expectedOutput = 403;
		actualOutput = SolutionAlternate.sherlockAndAnagrams(input);
		assertThat(actualOutput, equalTo(expectedOutput));
	}

	@Test
	public void testSherlockAndAnagrams9() {
		input = "zjekimenscyiamnwlpxytkndjsygifmqlqibxxqlauxamfviftquntvkwppxrzuncyenacfivtigvfsadtlytzymuwvpntngkyhw";
		expectedOutput = 428;
		actualOutput = SolutionAlternate.sherlockAndAnagrams(input);
		assertThat(actualOutput, equalTo(expectedOutput));
	}

}
