package io.github.cmbessone.enums;
public class Main {
	
	public static void main (String[] args) {
		
		Color c1 = Color.GREEN;
		
		
		System.out.println(c1.name());
		System.out.println(c1.getValue());
		
		
		for (Color color : Color.values()) {
			System.out.println("Enum Value " + color.name() + " value " + color.getValue());

		}
	}

}



