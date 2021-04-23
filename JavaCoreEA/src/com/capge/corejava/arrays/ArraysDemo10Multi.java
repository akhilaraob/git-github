package com.capge.corejava.arrays;


public class ArraysDemo10Multi {

	public static void main(String[] args) {
		int n=1;
		
	int arr[][]= new int[5][5];
		
		for(int i = 0;i<5;i++)
		 
		 for(int j=0;j<5;j++)
		 { 
               arr[i][j] =n;
		 n++;
		 }
		 
		 
		 
		
		for(int i = 0;i<5;i++)
		{
			System.out.println();
			for(int j=0;j<5;j++)
		
		System.out.print("  " +arr[i][j]);
		}
		
	}

}
