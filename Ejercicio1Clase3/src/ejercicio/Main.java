package ejercicio;

public class Main {

	public static void main(String[] args) {
		
		PrimeGenerator task= new PrimeGenerator();
		task.start();
		//si hago task.run() no terminaria nunca ya q start obedece al while(true) y no toma la interrupcion
		
		try {
			
			Thread.sleep(5000);
	
		}
		catch (InterruptedException e)
		{
			e.printStackTrace();
	
	}
	task.interrupt();
	}
	
	

}
