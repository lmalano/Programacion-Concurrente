package Ejercicio1Clase5;

import java.lang.Thread.UncaughtExceptionHandler;

//Class that process the uncaugth exception throwed in a Th
public class ExceptionHandler  implements UncaughtExceptionHandler{
	
	
	
	/**
	 * Main method of the class. It process the uncaugth
	 * in a Thread
	 * 
	 * @param t The Thread than throws the Exception
	 * @param e The Exception throwed
	 */

	@Override
	public void uncaughtException(Thread t, Throwable e) {
		// TODO Auto-generated method stub
		System.out.printf("An exception has been captured\n");
		System.out.printf("Thread:  %s\n",t.getId());//identifica el hilo
		System.out.printf("Exception: %s: %s\n",e.getClass().getName(),e.getMessage());//tipo  de excepcion da
		System.out.printf("Stack Trace:\n");
		e.printStackTrace(System.out);//da el detalle del error
		System.out.printf("Thread status: %s\n",t.getState());	
	}

//aqui es como q imprimo toda la info del error


	}

	
	
	

