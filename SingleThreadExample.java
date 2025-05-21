public class SingleThreadExample extends Thread {
	public void run(){
		System.out.println("run method is called");
	}

	public static void main(String[] args){
		System.out.println("Single Thread Started");
		
		SingleThreadExample ste = new SingleThreadExample();
		Thread t = new Thread(ste);
		t.start();
		
		System.out.println(ste);

		System.out.println("Thread " + t);
		System.out.println("Thread Name : " + t.getName());
		System.out.println("Thread Priority: " + t.getPriority());
		System.out.println("Thread Group: " + t.getThreadGroup());

	}
}