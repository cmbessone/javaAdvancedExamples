package io.github.cmbessone.synchronization;

 class Thread2 implements Runnable {
	 MathUtils mu;
	 
	 public Thread2 (MathUtils mu) {
		 this.mu = mu;
	 }
	 
	 public void run() {
		 try {
			 mu.getMultiples(3);
		 }catch (Exception e) {
			 // Throwing an exception
			 System.out.println("Exception is caught");
		 }
	 }
	

}
