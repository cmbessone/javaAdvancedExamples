package io.github.cmbessone.serializable;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerDeserDemo{

	public static void main(String[]arg) {
		Student student = new Student ("John", 25, "23 East, California");
		student.setX(10);
		
		String filename = "/Users/cristianbessone/Test.txt";
		FileOutputStream fileOut = null;
		ObjectOutputStream objOut = null;
		// Serialization 
		try {
			fileOut	= new FileOutputStream(filename);
			objOut = new ObjectOutputStream(fileOut);
			objOut.writeObject(student);
			
			objOut.close();
			fileOut.close();
			
			System.out.println("object has been serialized: \n" + student);
			
		}catch (IOException ex) {
			System.out.println("IOEXceotion is caught");
		}
		
		// Deserialization
		FileInputStream fileIn = null;
		ObjectInputStream objIn = null;
		try {
			fileIn = new FileInputStream(filename);
			objIn = new ObjectInputStream(fileIn);
			
			Student object = (Student) objIn.readObject(); // Se debe castear el objeto cuando se deserializa porque no sabe que tipo de informacion es al decifrarlo en binario generado por el WriteObject.
			
			System.out.println("Object has been deserialized: \n"+ object);
			System.out.println("Object has been deserialized: \n"+ object.getX());
			
			objIn.close();
			fileIn.close();
		} catch (IOException ex) {
			System.out.println("IOException is caught");
		} catch (ClassNotFoundException ex) {
			System.out.println("ClassNotFoundException" + " is Caught");
		}
		
	}

}
