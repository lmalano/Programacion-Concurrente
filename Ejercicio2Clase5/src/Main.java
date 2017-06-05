
public class Main {//pag 40

	public static void main(String[] args) {
		
		
		//Creates a Factory
		MyThreadFactory factory=new MyThreadFactory("MyThreadFactory");
		
		//Creates the a task
		Task task=new Task();
		Thread thread;
		
		
		// creates and starts ten Thread objets
		System.out.printf("Starting the Threads\n");
		for(int i=0; i<10; i++){
			thread=factory.newThread(task);//creo los hilos
			thread.start();
		}
		
		// Prints the statistics of the ThreadFactory to the
		System.out.printf("Factory stats:\n");
		System.out.printf("%s\n",factory.getState());

	}

}
