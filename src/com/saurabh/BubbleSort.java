public class BubbleSort {

	public static void main(String[] args) {
		BubbleSortAlgo();
	}

	static void BubbleSortAlgo() {
		// original numeric array
		int[] numArray = { 5, 9, 3, 1, 2, 8, 4, 7, 6, 10 };
		//new blank sortedArray
		int[] sortedArray = new int[numArray.length];

		// this for sorting the sorted number in new sorted array.
		for (int j = 0; j <= sortedArray.length - 1; j++) {
			// this is for completion of one cycle of number sorting
			for (int i = numArray.length - 1; i > 0; i--) {
				// taking two index original values to compare.
				int tempIndexValue1 = numArray[i];
				int tempIndexValue2 = numArray[i - 1];

				// comparing two numbers and replacing them using index
				if (compareNum(numArray[i], numArray[i - 1])) {
					numArray[i - 1] = tempIndexValue1;
					numArray[i] = tempIndexValue2;
				}
			}
			// storing the left most i.e. sorted number to new array
			sortedArray[j] = numArray[0];
			// filtering the already sorted number from exiting array
			numArray = filteredArray(numArray, 0);

			System.out.println(sortedArray[j]);
		}

	}

	// compare two numbers method
	static boolean compareNum(int num1, int num2) {
		if (num1 < num2) {
			return true;
		}
		return false;
	}

	// filtering array value using its index number.
	static int[] filteredArray(int[] array, int index) {
		int[] filteredArray = new int[array.length - 1];
		for (int i = 0, k = 0; i < array.length; i++) {
			if (i == index) {
				continue;
			}
			filteredArray[k++] = array[i];
		}
		return filteredArray;
	}

}

