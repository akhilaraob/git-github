package com.capge.corejava.arrays;

// java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5
public class ArraysDemo6Multi {

	public static void main(String[] args) {
		
		int arr[][]= new int[5][5];
		
		for(int i = 0;i<5;i++)
		 for(int j=0;j<5;j++)
		      arr[i][j]=7;
		 
		 
		
		for(int i = 0;i<5;i++)
		{
			System.out.println();
			for(int j=0;j<5;j++)
		
		System.out.print("  " +arr[i][j]);
		}
		
	}

}
