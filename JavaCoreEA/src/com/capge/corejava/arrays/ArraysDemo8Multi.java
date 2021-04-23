package com.capge.corejava.arrays;


public class ArraysDemo8Multi {

	public static void main(String[] args) {
		
	int arr[][]= new int[5][5];
		
		for(int i = 0;i<5;i++)
		 for(int j=0;j<5;j++)
		    if(i==j) 
               arr[i][j] =1;
		else
			arr[i][j] =0;
		 
		 
		
		for(int i = 0;i<5;i++)
		{
			System.out.println();
			for(int j=0;j<5;j++)
		
		System.out.print("  " +arr[i][j]);
		}
		
	}

}
