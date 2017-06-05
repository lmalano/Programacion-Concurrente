
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class EventStorage {

	private int maxSize;
	private List<Date> storage;
	
	public EventStorage(){
		maxSize=10;
		storage= new LinkedList<>();
	}
	
	public synchronized void set(){
		while (storage.size()==maxSize){
			try{
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
		}
			
	}
	((LinkedList<Date>) storage).offer(new Date());
	System.out.printf("set: %d\n",storage.size());
	notifyAll();
	}
	
	public synchronized void get(){
		while (storage.size()==0) {
			try{
				wait();
		} catch (InterruptedException e) {
			
			e.printStackTrace();
			
		}
	}
	System.out.printf("get %d: %s\n",storage.size(),((LinkedList<Date>)storage).poll());
	notifyAll();
	}
}
//el offer es un add pero al final de la lista
