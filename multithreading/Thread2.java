package io.github.cmbessone.multithreading;

 class Thread2 implements Runnable {
	 
	 public void run() {
		 try {
			 System.out.println("Thread 2 is running");
		 }catch (Exception e) {
			 // Throwing an exception
			 System.out.println("Exception is caught");
		 }
	 }
	

}
