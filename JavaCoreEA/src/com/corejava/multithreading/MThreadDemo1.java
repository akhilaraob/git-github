package com.corejava.multithreading;

  class MyThread extends Thread 
  {
	    public void run()  
	    {
	    	for(int i=1;i<=100;i++)
	    		System.out.println(i);
	    }
  }

public class MThreadDemo1 {

	public static void main(String[] args) {
		
		MyThread t1=new MyThread();
		t1.start();
		
		MyThread t2=new MyThread();
		t2.start();

	}

}
