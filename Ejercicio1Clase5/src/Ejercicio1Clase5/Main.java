package Ejercicio1Clase5;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Creates the Task
		Task task= new Task ();
		//Creates the thread
		Thread thread=new Thread(task);
		//Sets de uncaugh exeptio handler
		thread.setUncaughtExceptionHandler(new ExceptionHandler());
		//Starts The Thread
		thread.start();
		
		
		try{//esto esta medio al pedo
			thread.join();
		} catch (InterruptedException e){
			e.printStackTrace();
		}
		
		System.out.printf("Thread has finished\n");

	}

}
