package com.vinod.analytical;

public class LargestAndSmallestNumber {
	public static void main(String[] args) {

		int[] numbers = new int[] { 32, 43, 53, 54, 32, 65, 2, 63, 98, 43, 23,23 };
		
		int largest = numbers[0];
		int smallest = numbers[0];

		for (int i = 1; i < numbers.length; i++)
		{
			if (numbers[i] > largest) {
				largest = numbers[i];
				
			} else if (numbers[i] < smallest) {
				smallest = numbers[i];
			}
		}

		System.out.println("Largest Number : " + largest);
		System.out.println("Smallest Number : " + smallest);
	}

}
