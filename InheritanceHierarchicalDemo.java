class Animal{
	void running(){
		System.out.println("Animal running");
	}
}

class Dog extends Animal {
	void bark(){
		System.out.println("Dog barks");
	}
}

class Cat extends Animal {
	void meow(){
		System.out.println("Cat meow");
	}
}
class Lion extends Animal {
	void hunt(){
		System.out.println("Lion can hunt");
	}
}

public class InheritanceHierarchicalDemo {
	public static void main(String[] args){
		Dog puppy = new Dog();
		puppy.running();
		puppy.bark();

		Cat milo = new Cat();
		milo.running();
		milo.meow();

		Lion simba = new Lion();
		simba.running();
		simba.hunt();


	}
}