import java.util.concurrent.TimeUnit;//pag 30

public class Main {

	public static void main(String[] args) {
		
			UnsafeTask task=new UnsafeTask();
			
			for (int i=0; i<10; i++){
				Thread thread=new Thread(task);
				thread.start();
						try {TimeUnit.SECONDS.sleep(2);}
						catch (InterruptedException e) {e.printStackTrace();}
									}
											}
					}


/*

Uno de los aspectos mas críticos de las
aplicaciones concurrentes son las variables
compartidas.
• Esto tiene vital importancia en las clases que
extienden la clase Thread o implementan la
interfaz runnable.
• Si ud. crea un objeto de una clase que implementa
la interfaz runnable, y luego crea varios hilos
usando el mismo objeto runnable
en el ejercicio4clase4 se resuelve este problema de variables compartidas
*/