package io.github.cmbessone.autobox;

public class AutoBoxingDemo {

	public static void main (String [] args){
		int i =10;
		
		//Autobox
		Integer iObj = Integer.valueOf(i);
		System.out.println("Value of Integer obj: " + iObj);
		
		//Auto de-Box
		int i2 = iObj;
		System.out.println("Value of i2: " + i2);
		
			

	}
	
}
