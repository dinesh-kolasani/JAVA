public class GetSetPriority implements Runnable {

	public void run() {
		System.out.println("Thread Priority:" +Thread.currentThread().getPriority());
		System.out.println("Thread Name: "+Thread.currentThread().getName());
	}

	public static void main(String[] args) {

		System.out.println("Old Priority: " +Thread.currentThread().getPriority());
		
		Thread.currentThread().setPriority(7);
		System.out.println("New Priority: " +Thread.currentThread().getPriority());

		GetSetPriority gsp = new GetSetPriority();
		Thread t = new Thread(gsp);
		t.setName("Dinesh");
		t.start();
	}
} 