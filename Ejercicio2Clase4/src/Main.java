import java.util.ArrayDeque;//pag 24
import java.util.Deque;

public class Main {

	public static void main(String[] args) {
		Deque<Event> deque= new ArrayDeque<Event>();//create event data estructura

		WriterTask writer=  new WriterTask(deque);// create  the tree  writetask and start  them
		for(int i=0;i<3;i++){
			Thread thread = new Thread(writer);
			thread.start();
		}
			 	
		//creates  a cleaner task  and starts  them
		CleanerTask cleaner =new CleanerTask(deque);
		cleaner.start();
	}

}
