package tareas;

public class Calculator implements Runnable {
	private int number;
	
	public Calculator(int number){
	super();
	this.number=number;
	}
	
public void run(){
	
	
for(int i=0;i<9;i++)
{
System.out.printf("%s: %d * %d =%d \n", Thread.currentThread().getName(),number,i,i*number);
}

} 		
}
