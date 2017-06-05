package ejercicio2clase2;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.lang.Thread.State;



public class Main {

	public static void main(String[] args)  {
		Thread threads[] = new Thread[10];
		Thread.State status[] = new Thread.State[10];
		
		for (int i=0; i<10; i++){
			threads[i]=new Thread(new Calculator(i));
			if ((i%2)==0){
				threads[i].setPriority(Thread.MAX_PRIORITY);//setea prioridad para i%2=0
			} else {
				threads[i].setPriority(Thread.MIN_PRIORITY);//setea prioridad
			}
			threads[i].setName("Thread "+i);//da nombre hilo
		}
					
FileWriter file = new FileWriter("C:/data/log.txt");PrintWriter pw = new PrintWriter(file);
{
			
			for (int i=0; i<10; i++){
				pw.println("Main : Status of Thread "+i+" : "+threads[i].getState());//obtiene el stado del hilo i
				status[i]=threads[i].getState();//guarda el estado de los hilos (NEW) xq se crearon
			}

			for (int i=0; i<10; i++){
				threads[i].start();//corre los hilos
			}
			
			boolean finish=false;
			
				while (!finish) { //si el hilo termino, obtenemos los estados de los hilos 
					for (int i=0; i<10; i++){
						if (threads[i].getState()!=status[i]) {//si el estado (state) es difente al de los hilos
							writeThreadInfo(pw, threads[i],status[i]);
							status[i]=threads[i].getState();//asigno estado
																}	
											}
				
				finish=true;
				
				for (int i=0; i<10; i++){
					finish=finish &&(threads[i].getState()==State.TERMINATED);//finish es verdadero si el hilo termino
										}
								}
			
		} 
	}

	/**
	 *  This method writes the state of a thread in a file
	 * @param pw : PrintWriter to write the data
	 * @param thread : Thread whose information will be written
	 * @param state : Old state of the thread
	 */
	private static void writeThreadInfo(PrintWriter pw, Thread thread, State state) {
		pw.printf("Main : Id %d - %s\n",thread.getId(),thread.getName());
		pw.printf("Main : Priority: %d\n",thread.getPriority());
		pw.printf("Main : Old State: %s\n",state);
		pw.printf("Main : New State: %s\n",thread.getState());
		pw.printf("Main : ************************************\n");
	}