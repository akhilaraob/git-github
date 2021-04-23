package com.corejava.multithreading;
   class MyThread1  implements Runnable
   {

	@Override
	public void run() {
		for(int i=1;i<=100;i++)
    		System.out.println(i);
		
	}
	   
   }

   public class MThreadDemo2 {

	public static void main(String[] args) {
		
		MyThread1 my=new MyThread1();
		
		Thread t1=new Thread(my); 
			t1.start();
			t1.setPriority(8);
		
			Thread t2=new Thread(my); 
			t2.start();
			t2.setPriority(2);
			t2.setDaemon(true); 
		
		

	}

}
