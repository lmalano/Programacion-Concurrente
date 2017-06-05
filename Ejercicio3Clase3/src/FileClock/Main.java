package FileClock;

import java.util.concurrent.TimeUnit;

public class Main {

	public static void main(String[] args) {
		FileClock clock= new FileClock();
		Thread thread = new Thread(clock);
		thread.run();

		
		try{TimeUnit.SECONDS.sleep(5);
		}catch (InterruptedException e){
			e.printStackTrace();
		}
		thread.interrupt();
	}

}
