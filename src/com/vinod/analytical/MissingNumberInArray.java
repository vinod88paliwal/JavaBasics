package com.vinod.analytical;

public class MissingNumberInArray {

	private static void missingNumberUsingTotalOfArray(int[] a) {
		
		int asum = 0,sum = 0;
		for(int i=1;i<=10;i++){ //here 10 is last digit
		sum=sum+i;
		}
		System.out.println("Sum: "+sum);
		
		for(int i=0;i<a.length;i++)
		asum=asum+a[i];
		System.out.println("asum: "+asum);
		
		int missnum=sum-asum;
		System.out.println("Missing Number"+missnum);
		
	}
	
	/*
	1) XOR all the array elements, let the result of XOR be X1.
	2) XOR all numbers from 1 to n, let XOR be X2.
	3) XOR of X1 and X2 gives the missing number. 
	*/	
	/*
	* Class to find out the missing element from n-1 size array. Other way also is that n*(n+1)/2 give the sum 
	* and then sum the array numbers and difference is the missing number.
	* 
	*/
	   private static int missingNumberUsingXOROfArray(int[] a, int n)
	    {
	        int x1 = a[0];
	        int x2 = 1;
	        for (int i = 1; i < a.length; i++)
	        {
	            x1 = x1 ^ a[i];
	        }
	        
	        System.out.println("X1 : "+ x1);
	        
	        for (int i = 2; i <= n; i++)
	        {
	            x2 = x2 ^ i;
	        }
	        System.out.println("X2 : "+ x2);
	        
	        int finalVal = (x1 ^ x2);
	        System.out.println("Final Value : "+finalVal);
	        return finalVal;

	    }
	/* The XOR operator will return a 1, or TRUE, if both numbers being compared are different. But, 
	 * if the numbers being compared are the same it will return a 0 for FALSE.
	X 	Y 	Output
	0 	0 	0
	1 	1 	0
	0 	1 	1
	1 	0 	1
 */

public static void main(String args[]){
	
	int a[]={1,2,3,4,5,7,8,9,10};
	int len = a.length;
	System.out.println("Len : "+len);
	
	missingNumberUsingTotalOfArray(a);
	missingNumberUsingXOROfArray(a,len);
	}
}
