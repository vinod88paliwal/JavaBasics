package com.vinod.analytical;

public class FindTopTwo {

	public void findTwoMaxNumbers(int[] array) {

		int maxOne = 0;
		int maxTwo = 0;

		for (int i : array) {

			if (maxOne < i) {
				maxTwo = maxOne;
				maxOne = i;
			} else if (maxTwo < i) {
				maxTwo = i;
			}
		}

		System.out.println("First Maximum Number: " + maxOne);
		System.out.println("Second Maximum Number: " + maxTwo);
		System.out.println();
	}

	
	
	public void findThreeMaxNumbers(int[] array) {
			
		int maxOne = 0;
		int maxTwo = 0;
		int maxThree =0;

		for (int i : array) {

			if (maxOne < i) {
				maxThree = maxTwo;
				maxTwo = maxOne;
				maxOne = i;
			} else if (maxTwo < i) {
				maxThree = maxTwo;
				maxTwo = i;
				
			} else if (maxThree < i) {
				maxThree = i;
			}
		}

		System.out.println("First Maximum Number: " + maxOne);
		System.out.println("Second Maximum Number: " + maxTwo);
		System.out.println("Three Maximum Number: " + maxThree);
	}
	
	public static void main(String a[]) {

		int num[] = { 4, 23, 67, 1, 76, 1, 98, 13 };
		FindTopTwo obj = new FindTopTwo();
		obj.findTwoMaxNumbers(num);
		obj.findThreeMaxNumbers(new int[] { 4, 5, 6, 90, 1 });

	}

}