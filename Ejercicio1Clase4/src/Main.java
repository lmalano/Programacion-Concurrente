import java.util.Date;//pag 21
public class Main {

	
	
	public static void main(String[] args) {
	
		
		DataSourcesLoader dsLoader= new DataSourcesLoader();
		Thread thread1= new Thread(dsLoader,"DataSource Thread");//tipo y nombre del hilo creado
		
		NetworkConnectionsLoader ntLoader =new NetworkConnectionsLoader();
		Thread thread2 = new Thread(ntLoader,"NetworkConnectionsLoader Thread");
		
		thread1.start();
		thread2.start();
		
		try{
			thread1.join();//es lo mismo usar el join solo con el segundo
		//	thread2.join(); //aca hace q el main detanga su ejecucion hasta q finalize
			
			
		} catch (InterruptedException e){
			e.printStackTrace();
		
		}
		System.out.printf("Main: configuration has been  loader %s\n",new Date());
	}

}
