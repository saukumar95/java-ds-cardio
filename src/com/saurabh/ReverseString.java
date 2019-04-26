package com.saurabh;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class ReverseString {
	public static void main(String args[]) {
		String string = " saurabh kumar";

		/*
		 * Method 1 for string reverse using the toCharArray method
		 */
		char[] newString = string.toCharArray();

		for (int i = newString.length - 1; i >= 0; i--) {
			System.out.print(newString[i]);
		}

		/*
		 * Method 2 for string reverse using ArrayList
		 */
		List<Character> charList = new ArrayList<>();
		for (char c : newString) {
			charList.add(c);
		}
		Collections.reverse(charList);
		
		ListIterator<Character> li = charList.listIterator();
		while (li.hasNext()) {
			System.out.print(li.next());
		}
	}
}
