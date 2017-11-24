package assignment;

public class AdjacentSum {

	public static void main(String[] args) {
		System.out.println("Largest adjacent sum in an array is : "+ largestAdjacentSum());
	}

	/**
	 * returns largest adjacent sum from an array
	 */
	public static int largestAdjacentSum() {
		int[] arr = { 1, 7, 2, 8, -9, 4 };
		int maxSum = 0;
		for (int i = 0; i < arr.length - 1; i++) {
			int sum1 = arr[i] + arr[i + 1];
			if (sum1 > maxSum) {
				maxSum = sum1;
			}
		}
		return maxSum;

	}

}
