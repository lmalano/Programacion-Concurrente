package tareas;

import java.lang.Thread;

public class Tarea {
	
	public Tarea() {
	//Calculator tarea1 =new Calculator(5);
	Thread h1= new Thread(new Calculator(5));//paso como param tarea 1 o creo el objeto calculadora como parametro
	h1.start();
		
	
	//  h1.run();
	}
}
