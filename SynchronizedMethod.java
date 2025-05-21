class CalculateTable{
	
	synchronized void printTable(int n){  
	       System.out.println("Table of " + n);
	       for(int i=1;i<=10;i++){
	           System.out.println(n+"X"+i+ "=" +n*i); 
	        }       
	     }   
}

class TwoTable extends Thread{
	CalculateTable CT;
	
	public void run() {
		
		CT.printTable(2);
	}
	TwoTable(CalculateTable ct){
		this.CT =ct;
	}
	
}

class FiveTable extends Thread{
CalculateTable CT;
	
	public void run() {
		
		CT.printTable(5);
	}
	FiveTable(CalculateTable ct){
		this.CT =ct;
	}
	
	
}

public class SynchronizedMethod {

	public static void main(String args[]) {
		CalculateTable obj = new CalculateTable();
		
		TwoTable thread1 = new TwoTable(obj);
		thread1.start();
		
		FiveTable thread2 = new FiveTable(obj);
		thread2.start();
	}
}