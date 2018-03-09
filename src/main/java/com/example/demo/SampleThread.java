package com.example.demo;


class RunnableObj implements Runnable{
	public void run() {
		System.out.println("Current Thread in run"+Thread.currentThread().getName());
		
	}
}


public class SampleThread {

	public static void main(String[] args) {
		Runnable t1= new Thread();
		Thread t2= new Thread();
		//t1.start();
		try {
			
			t2.start();
			t2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Current Thread in main"+Thread.currentThread().getName());
	}

	
	

}
