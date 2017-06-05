import java.util.Date;
import java.util.Deque;
import java.util.concurrent.TimeUnit;


public class WriterTask implements Runnable {
	Deque<Event> deque; //deque es cola
	
	public WriterTask (Deque<Event> deque){
		this.deque=deque;
	}
	
	@Override
	public void run(){
		//escribe 100 eventos
		for(int i=0;i<100;i++){
			Event event=new Event();
			event.setDate(new Date());
			event.setEvent(String.format("the thread %s has generated an event",Thread.currentThread().getId()));
			//add to the data esctructura
			
			deque.addFirst(event);
			try{
				//duerme durante un segundo
				TimeUnit.SECONDS.sleep(1);
			}  catch (InterruptedException e){
				e.printStackTrace();
			}
			
		}	
		}
			
		
	}
	
	

