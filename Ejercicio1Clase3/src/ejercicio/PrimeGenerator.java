package ejercicio;

public class PrimeGenerator extends Thread {
	
 @Override
   public void run(){
		
long number=1L;
	while(true){
	
	if(isPrime(number)){
				System.out.println("number"+number+" is Prime");
								}
	if(isInterrupted()){//pregunta si alguien interrumpio el hilo y si se interrumpio imprime el msj
				System.out.printf("The prime generator has been interrupted\n");
				return;}
			number++;
		}
	}
	

private boolean isPrime(long number){
	
	if(number<=2)
		return true;
	
	for(long i=2;i<number;i++){
	if(number%i==0)
		return false;
}
		


return true;
}
}
