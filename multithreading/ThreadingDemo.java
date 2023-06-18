package io.github.cmbessone.multithreading;

public class ThreadingDemo {

	public static void main (String[] args)
	{
		
		int n= 10;
		
		for (int i=1; i<n ; i++)
		{
			Thread1 t1 = new Thread1();
			t1.start();//El start cambia el estado de ready yo running, y llama al run internamente desde el JDK
			
			Thread t2 = new Thread(new Thread2()); //JDK Class
			t2.start();
		}
		
	}

}
//Los threads corren en paralelo por eso no se ejecutan siempre en el mismo orden, sino que se ejecutan de acuerdo al CPU disponible