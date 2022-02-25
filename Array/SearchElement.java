//Check if a value is present in an Array in Java
package com.Array;

public class SearchElement {

	public static void main(String[] args) {
		int array[] = { 3, 23, 21, 4, 5, 1 };

		int key = 34;

		int count = 0;
		for (int i : array) {
			if (i == key) {
				count++;
			}
		}
		if (count > 0) {
			System.out.println("True");
		} else {
			System.out.println("False");
		}

	}

}
