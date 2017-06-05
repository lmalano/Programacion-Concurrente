import java.util.concurrent.TimeUnit;//pag 30

public class Main {

	public static void main(String[] args) {
		
			SafeTask task=new SafeTask();
			
			for (int i=0; i<10; i++){
				Thread thread=new Thread(task);
				thread.start();
						try {TimeUnit.SECONDS.sleep(2);}
						catch (InterruptedException e) {e.printStackTrace();}
									}
											}
					}

/*


 para resolver lo del eje3clase4 se usaran variables locales de hilo.
• Declare un objeto de la clase ThreadLocal<date>.
– Este objeto tendra un implementacion implicita que
incluye el metodo InitialValue. Este metodo devuelve el
valor actual.

*/