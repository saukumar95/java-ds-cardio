package com.saurabh;

public class ArmstrongCheck {

	public static boolean isArmstrong(int number) {

		int result = 0;
		int original = number;
		while (number != 0) {
			int remainder = number % 10;
			result = result + remainder * remainder * remainder;
			number = number / 10;
		}
		if (original == result) {
			return true;
		}

		return false;
	}

	public static boolean isPalinddrome(int number) {

		int reverse = 0;
		int palindrome = number;

		while (number != 0) {
			int remainder = number % 10;
			reverse = reverse * 10 + remainder;
			number = number / 10;
		}

		if (palindrome == reverse) {
			return true;
		}
		return false;
	}

	public static boolean isPrime(int number) {
		if (number <= 1) {
			return false;
		}
		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String args[]) {
		if (isPrime(2)) {
			System.out.println("It is ok!");
		} else {
			System.out.println("It is not ok");
		}
	}
}
