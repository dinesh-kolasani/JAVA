public class SleepMethodExample implements Runnable{
	
	public void run() {
		for(int j=0;j<=5;j++) {
			System.out.println("Thread: " + j);
		}
	}
	

	public static void main(String args[]) {
		
		SleepMethodExample sme = new SleepMethodExample();
		Thread t = new Thread(sme);
		t.start();
		try {
			t.sleep(1000);
		}catch (Exception e){
			System.out.println(e);
		}
		
		for(int i=0;i<=5;i++) {
			System.out.println("Main Thread: " + i);
		}
		
	}
	
}