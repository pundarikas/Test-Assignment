package assignment;

import java.util.Scanner;


public class PrimeFactor {

	
	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter any number : ");
			int inputNumber = sc.nextInt();
			System.out.println("Largest prime factor of " +inputNumber + " is : " +largestPrimeFactor(inputNumber));

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * returns largest prime factor of given inputNumber 
	 * @param inputNumber
	 * @return i
	 */

	public static int largestPrimeFactor(int inputNumber) {

		int i;
		int number = inputNumber;
		if (number == 1) {
			return 0;
		} else {
			for (i = 2; i <= number; i++) {
				if (number % i == 0) {
					number /= i;
					i--;
				}
			}
			return i;
		}
	}

}
