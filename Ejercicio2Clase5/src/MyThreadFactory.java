import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ThreadFactory;

public class MyThreadFactory implements ThreadFactory {
	
	
	// Atributes to save the necessary data the factory
	
	private int counter;
	private String name;
	private List<String> stats;
	
	/**
	 * constructor of the class
	 * @param name Base name of the thread objets created by
	 */
	
	public MyThreadFactory(String name){
		counter=0;
		this.name=name;
		stats=new ArrayList<String>();
	}
	/**
	 * Method that creates a new Thread objets using a Runnable
	 * @param r: Runnable objets to create the new Thread
	 */
	@Override
	public Thread newThread(Runnable r){
		// Create the new Thread objet
		Thread t=new Thread(r,name+"-Thread_"+counter);
		counter++;
		// Actualize the statics of the factory
		stats.add(String.format("Created thread %d with name %s on %s\n",
			t.getId(),t.getName(),new Date()));
		return t;
	}
	
	public String getState(){
		StringBuffer buffer=new StringBuffer();
		Iterator<String> it=stats.iterator();
		
		while(it.hasNext()){
			buffer.append(it.next());
		}
		return buffer.toString();
	}
	
	

}
