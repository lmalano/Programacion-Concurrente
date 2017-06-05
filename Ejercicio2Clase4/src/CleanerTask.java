import java.util.Date;
import java.util.Deque;


public class CleanerTask extends Thread {
	private Deque<Event> deque;
	
	
	public CleanerTask(Deque<Event> deque){
		
		this.deque=deque;
		setDaemon(true);//establezco that this a daemon thread, va antes del run()
	}
	
	
	@Override
	public void run(){
	while(true){
		Date date =new Date();
		clean(date);
	}
		
	}

	
	private void clean(Date date){
		long diferencia;
		boolean delete;
		
		if(deque.size()==0){
			return;
		}
		
		delete=false;
		do{
			
			Event e= deque.getLast();
			diferencia= date.getTime()- e.getFate().getTime();//cambie getdate x getfate
			
			if(diferencia<10000){
		
				System.out.printf("cleaner %s\n",e.getEvent());
				deque.removeLast();
				delete=true;
			}
		} while(diferencia>10000);
			if(delete){
				System.out.printf("cleaner: size de la cola: %d\n",deque.size());
			}				
	}
}

	
/*
 Implemente el método clean (). Obtiene el último evento y, si se creó más
Hace 10 segundos, la borra y comprueba el siguiente evento. Si se elimina un evento,
Escribe el mensaje del evento y el nuevo tamaño de la cola, para que puedas ver
Su evolución.			
 */
			
		
	
		
		

