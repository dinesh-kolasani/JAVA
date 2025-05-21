public class MultiThreadingExample implements Runnable {
	
	public void run() {
		System.out.println("Thread details: " +Thread.currentThread());
	}

	public static void main(String args[]) {
		MultiThreadingExample obj = new MultiThreadingExample();
		MultiThreadingExample obj1 = new MultiThreadingExample();
		MultiThreadingExample obj2 = new MultiThreadingExample();
		

		Thread t = new Thread(obj);
		t.setName("Dinesh");
		t.setPriority(6);
		
		Thread t1 = new Thread(obj1);
		t1.setName("Raj");
		t1.setPriority(8);
		
		Thread t2 = new Thread(obj2);
		t2.setName("Kolasani");
		t2.setPriority(10);
		

		t.start();
		t1.start();
		t2.start();
		
	}
	
}