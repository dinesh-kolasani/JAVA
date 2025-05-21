public class PolymorphismDemoOverloading {

	void add(int a, int b) {
		int sum1 = a+b;
		System.out.println(sum1);
	}

	void add(int a, int b, int c) {
		int sum1 = a+b+c;
		System.out.println(sum1);
	}

	void add(int a, int b, int c, int d) {
		int sum1 = a+b+c+d; 
		System.out.println(sum1);
	}

	public static void main(String[] args){

		PolymorphismDemoOverloading demo = new PolymorphismDemoOverloading();
		demo.add(10, 20);
		demo.add(10, 20, 30);
		demo.add(10, 20, 30,40);
		System.out.println("Polymorphism Demo");
	}
}

