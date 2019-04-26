package com.saurabh;

import java.util.Arrays;

public class FizzBuzz {
	public static void main(String args[]) {
		for (int i = 1; i <= 50; i++) {
			if (i % (7 * 11) == 0)
				System.out.println("FizzBuzz");
			else if (i % 7 == 0)
				System.out.println("Buzz");
			else if (i % 11 == 0)
				System.out.println("Fizz");
			else
				System.out.println(i);
		}

		char[] chars = new char[] { '\u0097' };
		String str = new String(chars);
		byte[] bytes = str.getBytes();
		System.out.println(Arrays.toString(bytes));

	}
}
