package com.vinod.analytical;

public class Reverse2DArray {
	
	public static void main(String[] args) {
		
		Reverse2DArray obj = new Reverse2DArray();
		
		  int[][] a = {
				  	   {1,2,3},
				  	   {4,5,6},
				  	   {7,8,9},
				  	   {10,11,12}
				  	 };
		  
		  obj.reverseArray(a);
		  obj.printArray(a);
		  
		  
	}

	private void reverseArray(int[][] a) {
		
		int[][] b = new int[a.length][];
		
		for(int i = 0; i < a.length; i++) {
		    for(int j = 0; j < a[i].length/2; j++) {
		     
		    	int temp = a[i][j];
		    	a[i][j] = a[i][a[i].length-(j + 1)];
		    	a[i][a[i].length-(j + 1)] = temp;
		    	
		    }
		}
	}
	

	private void printArray(int[][] a) {
		System.out.println("Printing Array --> ");

		for(int i = 0; i < a.length; i++) {
		    for(int j = 0; j < a[i].length; j++) {
		    	System.out.print(a[i][j]+" ");
		    }
		    System.out.println();
		}
	}
	
}
