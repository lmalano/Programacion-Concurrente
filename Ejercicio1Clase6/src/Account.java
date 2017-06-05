
public class Account {

	
	private double balance;
	
	
	public double getBalance(){
		return balance;
	}
	
	public void setBalance(double balance){
		this.balance=balance;
		
	}
	
	public synchronized void addAmount(double amount){
		double tmp= balance;
		
		try{
			Thread.sleep(10);// se lo pone para poder forzar un error,pero el sync lo impide
		} catch (InterruptedException e){
			e.printStackTrace();
				}
		tmp+=amount;
		balance=tmp;
												}
	
	public synchronized void subtractAmount(double amount){
		double tmp= balance;
		
		try{
			Thread.sleep(10);// se lo pone para poder forzar un error, pero el sync lo impide
		} catch (InterruptedException e){
			e.printStackTrace();
				}
		tmp-=amount;
		balance=tmp;
												}
}
//si saco el synchronized no daria bien el resultado

/*


Sin la palabra synchronized, mientras un hilo est� durmiendo despu�s de leer
el valor del saldo de la cuenta,el otro m�todo lee el saldo de la cuenta, por lo que ambos
Los m�todos modificar�n el mismo equilibrio y una de las operaciones no se reflejar� en el
Resultado fnal.

*/