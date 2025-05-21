public class MultiThreadExample extends Thread {
	
	public void run() {
		System.out.println("Thread details: " +Thread.currentThread());
	}

	public static void main(String args[]) {
		MultiThreadExample obj = new MultiThreadExample();
		Thread t = new Thread(obj);
		t.setName("Dinesh");
		t.start();
		
		MultiThreadExample obj1 = new MultiThreadExample();
		Thread t1 = new Thread(obj1);
		t1.setName("Raj");
		t1.start();
		
		MultiThreadExample obj2 = new MultiThreadExample();
		Thread t2 = new Thread(obj2);
		t2.setName("Kolasani");
		t2.start();
		
	}
	
}