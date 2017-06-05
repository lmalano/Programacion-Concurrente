package filesearch;

import java.util.concurrent.TimeUnit;


public class Main {

	public static void main(String[] args) {
		FileSearch buscador= new FileSearch("C:\\","log.txt");
		Thread hilo = new Thread (buscador);
		
		hilo.start();
		
		
		try
		{ TimeUnit.SECONDS.sleep(1);
		//Thread.sleep(10000);
		}
		catch (InterruptedException e)
		{e.printStackTrace();
			
	
		}
		hilo.interrupt();
	}
	

}
