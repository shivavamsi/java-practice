package temp;

import java.util.Arrays;

public class testArray {

	public static void swap(int[] a, int[] b) {
		int[] temp = b;
		b = a;
		a = temp;
	}

	public static void change(int[] changed) {
		changed[0] = 100;
	}

	public static void main(String[] args) {
		int[] initialArray = {1, 2, 3, 4};
		System.out.println("before changing: " + Arrays.toString(initialArray));
		
		change(initialArray);
		
		System.out.println("After changing: " + Arrays.toString(initialArray));
		
		/*int x = 4;
		int y = 14;
		y = x;
		y = 28;
		int[] a = new int[3];
		int[] b = a;
		a[0] = 4;
		a[1] = 5;
		a[2] = 6;

		System.out.println(x);
		System.out.println(a);
		System.out.println(Arrays.toString(a));
		
		b[2] = 10;
		System.out.println(b);
		System.out.println(Arrays.toString(b));
		
		System.out.println(a);
		System.out.println(Arrays.toString(a));*/
		
		
		/*int[] a = {1, 2, 3};
		int[] b = {9, 10, 11};
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));
		System.out.println("after swapping:");
		swap(a, b);
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));*/
	}

}