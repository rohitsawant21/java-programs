package com.Array;

public class LargestElement {

	public static void main(String[] args) {
		int array[] = { 23, 32, 2, 3, 5, 234 };
		int max = array[0];
		for (int i = 0; i < array.length; i++) {

			if (array[i] > max) {
				max = array[i];
			}
		}
		System.out.println(max);
	}
}
