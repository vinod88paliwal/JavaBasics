package com.vinod.analytical;
/*
* Class to find out the missing element from n-1 size array. Other way also is that n*(n+1)/5 give the sum 
* and then sum the array numbers and difference is the missing number.
* 
*/

public class MissingNumber {

	public static void main(String[] args)
    {
        int a[] = { 1, 2, 4, 6, 3, 7, 8 };
        
        int n = a.length + 1;
        
        int mising = findMissing(a, n);
       
        System.out.println(mising);
    }

    private static int findMissing(int[] a, int n)
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
        return (x1 ^ x2);

    }
/* The XOR operator will return a 1, or TRUE, if both numbers being compared are different. But, 
 * if the numbers being compared are the same it will return a 0 for FALSE.
X 	Y 	Output
0 	0 	0
0 	1 	1
1 	0 	1
1 	1 	0
 */
}
