class Animal {
	void makeSound(){
		System.out.println("Animal Sound");
	}
}

class Dog extends Animal {
	void makeSound(){
		System.out.println("Dog barks");
	}
}

class Cat extends Animal{
	void makeSound(){
		System.out.println("Cat meow");
	}
}

public class PolymorphismDemoOverriding {
	
	public static void main(String[] args) {

		System.out.println("Polymorphism Overloading Demo");
		
		Animal petAnimals = new Animal();
		petAnimals.makeSound();

		Dog d = new Dog();
		d.makeSound();

		Cat c = new Cat();
		c.makeSound();
	}
}