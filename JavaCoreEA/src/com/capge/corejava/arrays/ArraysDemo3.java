package com.capge.corejava.arrays;

public class ArraysDemo3 {

	public static void main(String[] args) {
		
		int ar[]= new int[5];
		
		ar[0]=10;
		ar[1]=20;
		ar[2]=30;
		ar[3]=40;
		ar[4]=50;
		for(int i = 0;i<ar.length;i++)
			System.out.println(ar[i]);
		
		for(int t:ar)
			System.out.println(t);
	}

}
