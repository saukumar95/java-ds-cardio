package com.saurabh;

public class ArrayRotation {

	void arrayRotationTimes(int arr[], int n, int d) {
		for (int i = 1; i <= n; i++) {
			arrayRotate(arr, d);
		}
	}

	void arrayRotate(int arr[], int d) {
		int i, temp;
		temp = arr[0];
		for (i = 0; i < d - 1; i++) {
			arr[i] = arr[i + 1];
		}
		arr[i] = temp;
	}

	void printArray(int arr[], int n) {
		for (int i = 0; i < n; i++) {
			System.out.println(arr[i] + "");
		}
	}

	/* Method 2 */

	void arrayReverse(int arr[]) {
		int a[] = { arr[0], arr[1] };
		int b[] = { arr[2], arr[3], arr[4], arr[5], arr[6] };

		int temp;
		temp = a[0];
		a[0] = a[1];
		a[1] = temp;

//		b[0] = b[4];
//		b[1] = b[3];
//		b[2] = b[2];
//		b[3] = b[1];
//		b[4] = b[0];

		int i;
		int temp1 = b[4];
		for (i = 4; i > 0; i--) {
			System.out.println(i);
			b[4 - i] = b[i];
		}
		b[i] = temp1;

		for (int j = 0; j < b.length; j++) {
			System.out.println(b[j]);
		}

		mergeArray(a, b);
	}

	void mergeArray(int a[], int b[]) {

		int[] c = new int[a.length + b.length];
		int count = 0;

		for (int i = 0; i < a.length; i++) {
			c[i] = a[i];
			count++;
		}

		for (int j = 0; j < b.length; j++) {
			c[count++] = b[j];
		}
		for (int i = 0; i < c.length; i++) {
//			System.out.println(c[i]);
		}
	}

	public static void main(String[] args) {
		ArrayRotation ar = new ArrayRotation();
		int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
		ar.arrayReverse(arr);
//		ar.printArray(arr, 12);

	}

}
